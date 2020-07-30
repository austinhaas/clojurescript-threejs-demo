(ns user
  (:require
   [clojure.edn :as edn]
   [cljs.repl :as repl]
   [cljs.repl.browser :as browser]))

(def compile-opts-files ["compile-opts-dev.edn"])

(defn browser-repl
  "Launch a ClojureScript browser REPL, but don't launch the browser. Uses
  settings compile-opts-files."
  []
  (let [env          (browser/repl-env :launch-browser false)
        compile-opts (->> (map (comp edn/read-string slurp) compile-opts-files)
                          (reduce merge))]
    (repl/repl* env compile-opts)))
