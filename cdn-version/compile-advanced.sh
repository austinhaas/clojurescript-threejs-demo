#/bin/bash

# This script just compiles the clojurescript code.

clj --main cljs.main \
    --compile-opts compile-opts-advanced.edn \
    --compile

exit 0
