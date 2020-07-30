#/bin/bash

# This script:
#  Launches a socket server.
#  Compiles the clojurescript code.
#  Watches src for changes and recompiles.

# This is how I develop:
#  I run this.
#  I run a webserver, separately.
#  I connect my editor to the socket REPL.
#  I eval (browser-repl) in the user ns to start a REPL.

clj -A:socket \
    --main cljs.main \
    --watch src \
    --compile-opts compile-opts-dev.edn \
    --compile

exit 0
