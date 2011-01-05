# jzmq-native-deps 
ZeroMQ Java bindings all packaged up and ready for use with leiningen + native-deps + clojars.org.
Includes linux x86 and mac x86_64 //will include window x86, and window x86_64. Please fork and build for other architectures!

## Jzmq version used
[jzmq](https://github.com/zeromq/jzmq)

commit number:
ee2d21e1aa9ecd4e1a0b

commit comment:
Added support for unregistering sockets from poller. 

## Usage

In your project.clj:
    :dev-dependencies [[native-deps "1.0.5"]]
    :native-dependencies [[org.clojars.starry/jzmq-native-deps "2.0.10"]]

and then just type
lein native-deps

You also need to install zeromq 2.0.10 separately for your platform
 
[zeromq](http://www.zeromq.org/intro:get-the-software)

## Acknowledgements 

This concept borrows from and updates [this library](http://clojars.org/org.clojars.mikejs/jzmq-native-deps) from clojars' [mikejs](http://clojars.org/users/mikejs).

## License

Distributed under the Eclipse Public License, the same as Clojure.
