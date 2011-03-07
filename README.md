Latest version is 2.0.10.4
 
# jzmq-native-deps 
ZeroMQ Java bindings all packaged up and ready for use with leiningen + native-deps + clojars.org.
Includes linux x86, mac x86_64, and mac x86(??) //will include window x86, and window x86_64. Please fork and build for other architectures!
Inludes windows  x86. There is also a windows x86_64 folder with same dll as windows x86 (but this is NOT 64 bit! but it can work on 64 bit - if you run 32 bit java and place a 32 bit libzmq.dll into c:\system\sysWOW64 - this is just temporary until i have time to built 64 bit version).
 
## Jzmq version used
[jzmq](https://github.com/zeromq/jzmq)

commit number:
ee2d21e1aa9ecd4e1a0b

commit comment:
Added support for unregistering sockets from poller.

commit date:
December 29, 2010

## Usage in Project.clj
Look at sample_project.clj in this directory.

You also need to install zeromq 2.0.10 separately for your platform.
 
[zeromq](http://www.zeromq.org/intro:get-the-software)

## Windows Jzmq
the windows jzmq was build with microsoft visual c++ express 2008. Therefore,
the runtime is required.

[[microsoft runtime][http://www.microsoft.com/downloads/en/details.aspx?familyid=A5C84275-3B97-4AB7-A40D-3802B2AF5FC2&displaylang=en]]

## TODO - Usage
The key thing to remember is that sockets are not thread safe. And they cant be made thread safe with locks - only the thread which creates the socket should use it
in any manner! A context is thread safe. This is not really as bad as it might seem at first, however. At least for me - i use it by having a thread which acts a 'service' and accepts requests from the program and then sends them over the socket. I use a poller which polls over local requests (over inproc) and over external events (tcp, etc.) Read the zeromq manual to actually understand this!



## Acknowledgements 

This concept borrows from and updates [this library](http://clojars.org/org.clojars.mikejs/jzmq-native-deps) from clojars' [mikejs](http://clojars.org/users/mikejs).

## License

Distributed under the Eclipse Public License, the same as Clojure.
