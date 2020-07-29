#/bin/bash

# This script:
#  Compiles the clojurescript code.
#  Starts a REPL.
#  Launches the browser.
#  Watches src for changes and recompiles.

# I wouldn't use this for dev. I use run-dev-process.sh. But this is easiest way
# to try out this demo.

clj --main cljs.main \
    --watch src \
    --compile-opts foreign-libs.edn \
    --compile-opts compile-opts-dev.edn \
    --compile \
    --repl

exit 0
