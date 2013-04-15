(defproject defrecordissue "1.0.0-SNAPSHOT"
  :description "FIXME: write"
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :profiles {:aot1 {:aot [defrecordissue.aot1]}
             :aot2 {:aot [defrecordissue.aot2]}}
  :aliases {"aot1" ["do" "clean," "with-profile" "aot1" "compile"]
            "aot2" ["do" "clean," "with-profile" "aot2" "compile"]})
