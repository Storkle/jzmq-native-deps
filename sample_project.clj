;;project which uses zeromq native deps
(defproject my-project "0.1"
  :dev-dependencies [[native-deps "1.0.5"]]
  :native-dependencies [[org.clojars.starry/jzmq-native-deps "2.0.10.2"]])
