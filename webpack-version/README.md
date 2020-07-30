# ClojureScript + three.js + webpack

See the [main README](../README.md) for more info.

### 1. Change to this project directory.
```
cd webpack-version
```
### 2. Install npm, if it isn't already installed.

### 3. Initialize npm.
```
echo "{}" > package.json
```
### 4. Install dependencies.
```
npm install --save-dev webpack webpack-cli
npm install --save three
```

### 5. Compile. Start a REPL. Launch a browser. Watch for changes.
```
./run-dev-process-easy.sh
```

The browser should open and display a spinning green box.

If you select the browser, you can move the camera using the arrow keys,
mouse, or touch controls.

### 6. Enter commands at the repl.

```
(in-ns 'demo)
(add-scene!)
```

### 7. Read the files for more commentary.
