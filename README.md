![Metafacture](https://raw.github.com/wiki/culturegraph/metafacture-core/img/metafacture.png)

Metafacture is a toolkit for processing semi-structured data with a focus on library metadata. It provides a versatile set of tools for reading, writing and transforming data. Metafacture can be used as a stand-alone application or as a java library in other applications. The name Metafacture is a portmanteau of the words *meta* data and manu*facture*.

Metafacture consists of a core library and a number of plugin packages and satellite projects which build on the core library and extend it with additional tools and features. This page describes the core package. Have a look at the [Plugins and Tools page](https://github.com/culturegraph/metafacture-core/wiki/Plugins-and-Tools) on the wiki for an overview of the supplementary packages and projects.

Originally, Metafacture was developed as part of the [Culturegraph](http://culturegraph.org) platform but its now used by others, too: [see who uses Metafacture](https://github.com/culturegraph/metafacture-core/wiki/Who-uses-Metafacture).

# Build

[![Build Status](https://secure.travis-ci.org/culturegraph/metafacture-core.svg?branch=master)](https://travis-ci.org/culturegraph/metafacture-core/)

See the [.travis.yml](./.travis.yml) file for details on the CI config used by Travis.

# Getting started

You can use Metafacture either as a stand-alone application or as a Java library in your own projects.

## Metafacture as a stand-alone application
 
If you are only interested in running Flux scripts without doing any Java programming this is the way to go. The instructions assume that you are using a *nix-like shell.

1. Download the latest distribution package from the [metafacture-core/releases](https://github.com/culturegraph/metafacture-core/releases) page. Make sure that you do download a distribution package and _not_ a source code package.

2. Extract the downloaded archive:
   ```bash
   $ tar xzf metafacture-runner-VERSION-dist.tar.gz
   ```
   This will create a new directory containing a ready-to-use metafacture distribution.
3. Change into the newly created directory:
   ```bash
   $ cd metafacture-runner-VERSION
   ```
4. Run one of the example scripts:
   ```bash
   $ ./flux.sh examples/read/marc21/read-marc21.flux
   ```
   This example will print a number of marc21 records on standard out.

The _examples_ folder contains many more examples which provide a good starting point for learning metafacture. If you have any questions please join our [mailing list](http://lists.dnb.de/mailman/listinfo/metafacture) or use our issue-based discussion forum over at [metafacture-documentation](https://github.com/culturegraph/metafacture-documentation).


## Using Metafacture as a Java libary

If you want use Metafacture in your own Java projects all you need to do is to include the metafacture-core package as a dependency in your project. metafacture-core is available from [Maven Central](http://search.maven.org/#search%7Cga%7C1%7Cg%3A%22org.culturegraph%22). To use it, add the following dependency declaration to your `pom.xml`:

    <dependency>
    	<groupId>org.culturegraph</groupId>
    	<artifactId>metafacture-core</artifactId>
    	<version>4.0.0</version>
    </dependency>

Our integration server automatically publishes successful builds of the master branch as snapshot versions on [Sonatype OSS Repository](https://oss.sonatype.org/index.html#nexus-search;quick~culturegraph).

<!--
TODO: Add

* Link to getting started tutorial
* Mention the application-archetype
-->

# Building metafacture-core from source

Building metafacture-core from source is easy. All you need is git and JDK 8:

1. Clone the metafacture-core repository and change into the directory:

    ```bash
    $ git clone https://github.com/culturegraph/metafacture-core.git
    $ cd metafacture-core
    ```

2. Invoke the gradle-wrapper to download Gradle and build metafacture-core:

   ```bash
   $ ./gradlew install
   ```
   on Windows call `gradlew.bat install` instead.

See [Code Quality and Style](https://github.com/culturegraph/metafacture-core/wiki/Code-Quality-and-Style) on the wiki for further information on the sources.

<!--
TODO: Include a link to a page which explains how to write plugins
-->

# Stay updated

For support and discussion join the [mailing list](http://lists.dnb.de/mailman/listinfo/metafacture).
