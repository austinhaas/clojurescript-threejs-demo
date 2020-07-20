
# ClojureScript + three.js demo projects

This repository contains several different ways of bringing three.js into a
ClojureScript project.

The motivation for this investigation was to facilitate switching from the
release version of three.js to the dev version to check if an issue had already
been fixed. (It had.)

## Google Closure Compiler and three.js

### three.js r118

The version of three.js (r118) that is currently released conflicts with the
Google Closure Compiler. One comma needs to be removed. Workarounds are
described in the steps for each build.

Future versions shouldn't have this issue.

### :optimizations :advanced

I haven't been able to successfully run a build that compiles three.js with
advanced optimizations.

## Versions

### [CDN version](cdn-version/README.md)

Install three.js from a CDN on page load.

#### Pros

* Works with the current release of three.js (r118).
* Easiest version to test.

#### Cons

* I haven't figured out how to make it work with :simple optimizations.
* Advanced optimizations won't work, unless you supply externs.
* three.js isn't as nicely integrated into ClojureScript as the other versions.
* three.js doesn't pass through the Google Closure compiler, so no optimizations there.
* Throws some errors, but they seem benign.
* Not sure I'm wiring this up correctly.

### [Locally installed version](local-version/README.md)

This version installs the three.js artifacts locally, so that they can be used
to generate an externs file.

**This isn't working right now. The paths to the modules seem to be messed up.**

This is what I did before three.js moved to modules. It worked ok, but I had to
manually add additional externs. I haven't included those here, because I
haven't got it to work at all.

#### Pros

* IIUC, you could compile your code with advanced optimizations, but leave
  three.js alone.

#### Cons

* Not working.
* You have to manually keep your three.js dependencies up to date. This is
  especially annoying when you are using multiple modules from the examples
  directory.

### [Source version](source-version/README.md)

If you are working heavily with three.js, you probably want easy access to the
source repo, and the ability to run the dev version or any release.

The downside is every developer needs to install it manually when they first set
up the project.

This is what I currently use.

#### Pros

* Easily switch between release versions of three.js and dev version.
* Everything passes through the Closure compiler.

#### Cons

* There appears to be an issue where the clojurescript compiler tries to resolve
  dependencies in node_modules. This results in error messages and a delay, but
  otherwise seems benign.

### [Source + Webpack version](source-webpack-version/README.md)

Same as above, but bundles everything with webpack.

(I don't know what value that adds.)

#### Pros

* Same as above.
* Incorporates webpack, if that is desired.

#### Cons

* Same as above.

### [Manual npm installed version](npm-manual-version/README.md)

Manually install three.js using npm.

This seems like a good way to get three.js, especially if you already have npm
installed.

The steps walk through installing three.js as the original developer. IIUC, you
would want to commit package.json and package-lock.json and then users can just
run `npm install` to install three.js.

#### Pros

* Use npm to manage the three.js dependencies.

#### Cons

* The current released version of three.js doesn't compile without modification.
* Same clojurescript compiler issue as above.

### [:npm-deps version](npm-deps-version/README.md)

I haven't figured out how to include modules from the three.js examples directory.

If that is possible, then this might be the best way for users of your library
to get three.js (after the issue in r118 is resolved).

#### Pros

* Automatically installs three.js.

#### Cons

* The curent released version of three.js (r118) doesn't compile without modification.
* `:install-deps true` will cause any changes made to node_modules to be overwritten.
* I can't figure out how to reference modules in the three.js example directory.
