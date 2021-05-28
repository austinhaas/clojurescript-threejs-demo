
# ClojureScript + three.js demo projects

This repository shows different ways of bringing three.js into a ClojureScript
project.

* [ClojureScript](https://clojurescript.org/)
* [three.js](https://threejs.org/)

## Dependencies

* [Clojure CLI](https://clojure.org/guides/deps_and_cli)
* [npm](https://www.npmjs.com/) (Not needed for the CDN version.)
* [Python](https://www.python.org/) (Optional. For launching a webserver.)
* [GNU Make](https://www.gnu.org/software/make/) (Optional. For running CLI commands.)

## Versions

### [CDN version](cdn-version)

Install three.js from a CDN on page load.

Alternatively, you could download and host the three.js files.

#### Pros

* Your code (not three.js) can be compiled with advanced optimizations.

#### Cons

* An externs file is required to compile with advanced optimizations. This file
  must be updated when new parts of three.js are referenced.
* The clojurescript code must be set up to run after the modules are loaded.
* The three.js modules must be stored globally (e.g., by adding them to `window`).
* The modules must be referenced in the global scope, as opposed to referencing
  them via `require` or `import`.
* The three.js files are not optimized.

### [Webpack version](webpack-version)

Use webpack to package the dependencies.

#### Pros

* The three.js dependency is installed and managed with `npm`.
* Modules can be referenced via `require`.
* Everything can be compiled with advanced optimizations.
* Doesn't seem to need an externs file.
* Uses webpack.

#### Cons

* npm is required.

### [:npm-deps version](npm-deps-version)

Use compiler options to specify the three.js dependency.

#### Pros

* Automatically installs three.js.
* Modules can be referenced via `require`.

#### Cons

* npm is required.
* I can't get this to work with advanced optimizations. (The documentation
  says this may not work: https://clojurescript.org/reference/compiler-options#npm-deps).
