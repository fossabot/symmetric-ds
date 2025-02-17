<a href="https://sourceforge.net/projects/symmetricds/files/latest/download" rel="nofollow"><img alt="Download SymmetricDS" src="https://img.shields.io/sourceforge/dt/symmetricds.svg"></a>

[![Build Status](https://dev.azure.com/jumpmind/symmetricds/_apis/build/status/SymmetricDS?branchName=3.10)](https://dev.azure.com/jumpmind/symmetricds/_build/latest?definitionId=4&branchName=3.10)
[![FOSSA Status](https://app.fossa.com/api/projects/git%2Bgithub.com%2Frudiejd%2Fsymmetric-ds.svg?type=shield)](https://app.fossa.com/projects/git%2Bgithub.com%2Frudiejd%2Fsymmetric-ds?ref=badge_shield)

# SymmetricDS
SymmetricDS is a database and file synchronization solution that is platform-independent, web-enabled, and database agnostic.  SymmetricDS was built to make data replication across two to tens of thousands of databases and file systems fast, easy and resilient.  We specialize in near real time, bi-directional data replication across large node networks over the WAN or LAN.

SymmetricDS is sponsored by http://www.jumpmind.com.  JumpMind also provides support and a professional version that features a web-based user interface that simplifies configuration and management.

You can find articles on SymmetricDS at http://www.jumpmind.com/blog and https://medium.com/data-weekly.

Open source downloads here:

<a href="https://sourceforge.net/projects/symmetricds/files/latest/download" rel="nofollow"><img alt="Download SymmetricDS" src="https://a.fsdn.com/con/app/sf-download-button"></a>

Documentation is available at http://www.symmetricds.org/docs/overview.

Professional downloads are available at http://www.jumpmind.com/products/symmetricds/download.  Documentation is available at http://www.jumpmind.com/products/symmetricds/documentation.

We also have developed a native SymmetricDS client.  Check out the code in the [symmetric-client-clib](symmetric-client-clib) and [symmetric-client-native](symmetric-client-native).

## Core Product Development
We use Eclipse for development.

To setup a development environment run the following commands:
```
cd symmetric-assemble
./gradlew develop
```

This will generate Eclipse project artifacts.  You can then import the projects into your Eclipse workspace.


## License
[![FOSSA Status](https://app.fossa.com/api/projects/git%2Bgithub.com%2Frudiejd%2Fsymmetric-ds.svg?type=large)](https://app.fossa.com/projects/git%2Bgithub.com%2Frudiejd%2Fsymmetric-ds?ref=badge_large)