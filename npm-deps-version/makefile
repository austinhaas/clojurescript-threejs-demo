.PHONY : repl-server
repl-server : ## Compile with dev options. Serve socket-based REPL on port 5555. Recompile when src changes.
	clj \
	-M:socket \
	--main cljs.main \
	--watch src \
	--compile-opts config/compile-opts-dev.edn \
	--compile

# This version is for when you want a REPL, but without connecting it to your editor.
.PHONY : repl
repl : ## Compile with dev options. Launch REPL. Launch browser. Recompile when src changes.
	clj \
	-M \
	--main cljs.main \
	--watch src \
	--compile-opts config/compile-opts-dev.edn \
	--compile \
	--repl

.PHONY : build
build : ## Compile with advanced optimizations.
	clj \
	-M \
	--main cljs.main \
	--compile-opts config/compile-opts-build.edn \
	--compile

.PHONY : serve
serve : ## Launch a webserver on 0.0.0.0:4000. (Requires python.)
	python -m http.server 4000

pom.xml : deps.edn ## Generate pom.xml.
	clj -Spom

.PHONY : display-dependency-updates
display-dependency-updates : pom.xml ## Report on stale dependencies. (Requires maven.)
	mvn versions:display-dependency-updates

.PHONY : clean
clean : ## Remove temporary files.
	rm -rf out
	rm -rf .cpcache
	rm -f pom.xml # In a real project, you may not want to delete the pom file.
	rm -rf node_modules
	rm package-lock.json
	rm package.json

.DEFAULT_GOAL := help

help :
	@grep -E '^[a-zA-Z_-]+ ?:.*?## .*$$' $(MAKEFILE_LIST) | awk 'BEGIN {FS = ":.*?## "}; {printf "\033[36m%-30s\033[0m %s\n", $$1, $$2}'
