(defproject vega-demo "1.0.0-SNAPSHOT"
  :description "Demo of Vega through React"
  :url "https:/github.com/pkimbrel/vega-demo"
  :license {:name "MIT"
            :url "https://opensource.org/license/MIT"}
  :cljsbuild {:builds
              [{:id "dev"
                :source-paths ["src"]
                :compiler {:output-to "resources/public/js/main.js"}}]}
  :dependencies [
                 [org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.229"]
                 [cljsjs/vega "2.6.0-0"]
                 [org.omcljs/om "1.0.0-alpha46"]
                 [cljs-http "0.1.41"]
                 [figwheel-sidecar "0.5.7"]
                 ]
  )

