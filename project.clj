(defproject com.github.austin0209/iceclient "0.0.4-SNAPSHOT"
  :description "Icecast source and client to transmit and recieve streaming audio."
  :repositories [["jitpack" "https://jitpack.io"]]
  :dependencies [[org.clojure/clojure "1.12.1"]
                 [com.github.umjammer/jlayer "1.0.1"]
                 [com.github.umjammer/mp3spi "1.9.5"]
                 [clj-native "0.9.5"]]
  :jvm-opts ["-Djna.library.path=/usr/lib"])
