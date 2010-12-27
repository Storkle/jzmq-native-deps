# jzmq-native-deps
NOTE: use leiningen 1.3.1 by modifying lein version in script you download (for some reason, on linux, native deps doesn't work with higher lein)

ZeroMQ Java bindings all packaged up and ready for use with leiningen + native-deps + clojars.org.
Includes linux x86_64 //will include  linux x86, , window x86, and window x86_64. Please fork and build for other architectures!

NOTE: Mac OS X x86 not tested, and doesnt include native library, only java library.

look at build scripts for example how to isntall to local repository and/or clojars. you can get a pom file automatically generated
by first installing to native repository and taking the pom from there...

Make sure that the version in the project.clj is the same as that in the jar file name above!

## Usage

In your project.clj:

    :native-dependencies [[org.clojars.starry/jzmq-native-deps "2.0.9-SNAPSHOT"]]
     
## Acknowledgements 

This concept borrows from and updates [this library](http://clojars.org/org.clojars.mikejs/jzmq-native-deps) from clojars' [mikejs](http://clojars.org/users/mikejs).

## License

Copyright (C) Bobby Calderwood

Distributed under the Eclipse Public License, the same as Clojure.
