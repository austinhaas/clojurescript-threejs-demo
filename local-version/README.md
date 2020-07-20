# ClojureScript + three.js (artifacts locally installed)

See the [main README](../README.md) for more info.

### 1. Change to this project directory.
```
cd local-version
```

### 2. Download the three.js files.
```
curl https://unpkg.com/three@<VERSION>/build/three.module.js > three.module.js
curl https://unpkg.com/three@<VERSION>/examples/jsm/controls/OrbitControls.js > OrbitControls.js
```
Substitute <VERSION> with the current version of three.js.
See https://threejs.org/docs/index.html#manual/en/introduction/Installation

### 3. Compile. Start a REPL. Launch a browser. Watch for changes.
```
./run-dev-process-easy.sh
```

> I haven't been able to get this to work.

The browser should open and display a spinning green box.

If you select the browser, you can move the camera using the arrow keys, mouse,
or touch controls.

You should also see a prompt at the REPL, but if you saw the errors above, it
may not be visible. Hit enter for a fresh prompt.

### 4. Enter commands at the repl.

```
(in-ns 'demo)
(add-scene!)
```

### 5. Check out the files for more commentary.
