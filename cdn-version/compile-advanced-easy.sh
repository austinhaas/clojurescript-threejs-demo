#/bin/bash

# This script compiles the clojurescript code and launches a webserver. Open a
# browser to http://localhost:9000. I don't use this, because I serve my files
# with a different webserver.

clj --main cljs.main \
    --compile-opts foreign-libs.edn \
    --compile-opts compile-opts-advanced.edn \
    --compile \
    --serve

exit 0
