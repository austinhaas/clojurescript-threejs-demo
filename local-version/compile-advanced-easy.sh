#/bin/bash

# This script compiles the clojurescript code and launches a REPL, just so that
# it will launch the browser for you. I don't use this, because I serve my files
# with a different webserver and I like to control when the browser loads.

clj --main cljs.main \
    --compile-opts foreign-libs.edn \
    --compile-opts compile-opts-advanced.edn \
    --compile \
    --repl

exit 0
