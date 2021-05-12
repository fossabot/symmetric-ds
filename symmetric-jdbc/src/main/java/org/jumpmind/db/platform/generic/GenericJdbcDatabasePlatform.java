package org.jumpmind.db.platform.generic;

import javax.sql.DataSource;

import org.jumpmind.db.platform.AbstractJdbcDatabasePlatform;
import org.jumpmind.db.platform.DatabaseNamesConstants;
import org.jumpmind.db.platform.DatabaseVersion;
import org.jumpmind.db.platform.IDdlBuilder;
import org.jumpmind.db.platform.IDdlReader;
import org.jumpmind.db.platform.JdbcDatabasePlatformFactory;
import org.jumpmind.db.sql.ISqlTemplate;
import org.jumpmind.db.sql.SqlTemplateSettings;
import org.jumpmind.db.sql.SymmetricLobHandler;

public class GenericJdbcDatabasePlatform extends AbstractJdbcDatabasePlatform {

    private String name;

    public GenericJdbcDatabasePlatform(DataSource dataSource, SqlTemplateSettings settings) {
        super(dataSource, settings);
        try {
            DatabaseVersion nameVersion = JdbcDatabasePlatformFactory.determineDatabaseNameVersionSubprotocol(dataSource);
            name = String.format("%s%s", nameVersion.getName(), nameVersion.getVersionAsString()).toLowerCase();
        } catch (Exception e) {
            name = DatabaseNamesConstants.GENERIC;
            log.info("Unable to determine database name and version, " + e.getMessage());
        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDefaultSchema() {
        return null;
    }

    @Override
    public String getDefaultCatalog() {
        return null;
    }

    @Override
    protected IDdlBuilder createDdlBuilder() {
        return new GenericJdbcDdlBuilder(getName(), this);
    }

    @Override
    protected IDdlReader createDdlReader() {
        return new GenericJdbcSqlDdlReader(this);
    }

    @Override
    protected ISqlTemplate createSqlTemplate() {
        return new GenericJdbcSqlTemplate(dataSource, settings, new SymmetricLobHandler(), getDatabaseInfo());
    }

}
