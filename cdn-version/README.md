# ClojureScript + three.js (from CDN)

See the [main README](../README.md) for more info.

## Dependencies

* [Clojure CLI](https://clojure.org/guides/deps_and_cli)
* [Python](https://www.python.org/) (Optional. For launching a webserver.)
* [GNU Make](https://www.gnu.org/software/make/) (Optional. For running CLI commands.)

## Development mode

### 1. Change to this project directory.
```bash
cd cdn-version
```

### 2. Compile with dev options. Launch REPL. Launch browser. Recompile when src changes.
```bash
make repl
```

The browser should open and display a spinning green box.

If you select the browser, you can move the camera using the arrow keys, mouse,
or touch controls.

You should also see a prompt at the REPL.

## Production Build

### 1. Change to this project directory.
```bash
cd cdn-version
```

### 2. Compile with advanced optimizations.
```bash
make build
```

### 3. Launch a webserver on 0.0.0.0:4000. (Requires python.)
```bash
make serve
```

### 4. Open browser to 0.0.0.0:4000.

## Cleanup
```bash
make clean
```

## Other

### Show all commands.
```bash
make
```

### Read the files for more info.
