# ClojureScript + three.js (using :npm-deps)

See the [main README](../README.md) for more info.

## Dependencies

* [Clojure CLI](https://clojure.org/guides/deps_and_cli)
* [npm](https://www.npmjs.com/) (Not needed for the CDN version.)
* [Python](https://www.python.org/) (Optional. For launching a webserver.)
* [GNU Make](https://www.gnu.org/software/make/) (Optional. For running CLI commands.)

## Development mode

### 1. Change to this project directory.
```
cd npm-deps-version
```

### 2. Compile with dev options. Launch REPL. Launch browser. Recompile when src changes.
```
make repl
```

The browser should open and display a spinning green box.

If you select the browser, you can move the camera using the arrow keys, mouse,
or touch controls.

You should also see a prompt at the REPL.

### 3. Enter commands at the repl.

```
(in-ns 'demo)
(add-scene!)
```

## Production Build

> I can't get this to work. (The documentation says this may not work:
> https://clojurescript.org/reference/compiler-options#npm-deps).

### 1. Change to this project directory.
```
cd npm-deps-version
```

### 2. Compile with advanced optimizations.
```
make build
```

### 3. Launch a webserver on 0.0.0.0:4000. (Requires python.)
```
make serve
```

### 4. Open browser to 0.0.0.0:4000.

## Cleanup
```
make clean
```

## Other

### Show all commands.
```
make
```

### Read the files for more info.
