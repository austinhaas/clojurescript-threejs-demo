# ClojureScript + three.js (using :npm-deps)

See the [main README](../README.md) for more info.

1. Change to this project directory.
```
cd npm-deps-version
```

2. Compile. Start a REPL. Launch a browser. Watch for changes.
```
./run-dev-process-easy.sh
```

> Note that version r118 of three.js, released at the time of this writing, will
> not work without a very small modification, due to an incompatibility with
> Google Closure. The error is "ERROR: JSC_PARSE_ERROR. Parse error. Invalid
> trailing comma in arguments list". To fix it, just delete the trailing comma
> on the line in the file mentioned.

> To prevent this change from being overwritten, you must also edit
> compile-opts-dev.edn and set `:install-deps false`.

The browser should open and display a spinning green box.

~~If you select the browser, you can move the camera using the arrow keys,
mouse, or touch controls.~~ **I haven't figured out how to load modules from the
three.js example directory.**

You should also see a prompt at the REPL, but if you saw the errors above, it
may not be visible. Hit enter for a fresh prompt.

3. Enter commands at the repl.

```
(in-ns 'demo)
(add-scene!)

```

4. Read the files for more commentary.
