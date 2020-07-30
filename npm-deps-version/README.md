# ClojureScript + three.js (using :npm-deps)

See the [main README](../README.md) for more info.

### 1. Change to this project directory.
```
cd npm-deps-version
```

### 2. Compile. Start a REPL. Launch a browser. Watch for changes.
```
./run-dev-process-easy.sh
```

The browser should open and display a spinning green box.

~~If you select the browser, you can move the camera using the arrow keys,
mouse, or touch controls.~~ I can't figure out how to import modules from the
three.js examples folder.

You should also see a prompt at the REPL, but if you saw the errors above, it
may not be visible. Hit enter for a fresh prompt.

### 3. Enter commands at the repl.

```
(in-ns 'demo)
(add-scene!)
```

### 4. Read the files for more commentary.
