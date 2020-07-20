# ClojureScript + three.js (from npm)

See the [main README](../) for more info.

### 1. Change to this project directory.
```
cd npm-manual-version
```

### 2. Install npm, if it isn't installed.

### 3. `echo "{}" > package.json`

### 4. `npm install --save three`

### 5. Compile. Start a REPL. Launch a browser. Watch for changes.
```
./run-dev-process-easy.sh
```
Ignore these errors:
```
Error: Cannot find module '@cljs-oss/module-deps'
    at Function.Module._resolveFilename (internal/modules/cjs/loader.js:636:15)
    at Function.Module._load (internal/modules/cjs/loader.js:562:25)
    at Module.require (internal/modules/cjs/loader.js:692:17)
    at require (internal/modules/cjs/helpers.js:25:18)
    at [eval]:8:13
    at Script.runInThisContext (vm.js:122:20)
    at Object.runInThisContext (vm.js:329:38)
    at Object.<anonymous> ([eval]-wrapper:6:22)
    at Module._compile (internal/modules/cjs/loader.js:778:30)
    at evalScript (internal/bootstrap/node.js:590:27)
```

(The missing module can be installed with `npm install --save @cljs-oss/module-deps`,
but then you'll get an error about resolving relative paths.)

> Note that version r118 of three.js, released at the time of this writing, will
> not work without a very small modification, due to an incompatibility with
> Google Closure. The error is "ERROR: JSC_PARSE_ERROR. Parse error. Invalid
> trailing comma in arguments list". To fix it, just delete the trailing comma
> on the line in the file mentioned and run the previous command again.

The browser should open and display a spinning green box.

If you select the browser, you can move the camera using the arrow keys, mouse,
or touch controls.

You should also see a prompt at the REPL, but if you saw the errors above, it
may not be visible. Hit enter for a fresh prompt.

### 6. Enter commands at the repl.

```
(in-ns 'demo)
(add-scene!)
```

### 7. Read the files for more commentary.
