babel-preset-metal-resolve-source
===================================

A babel preset for building Metal.js projects that automatically resolves imports into full paths.

## Usage

This is a [babel preset](http://babeljs.io/docs/plugins/) that sets the `resolveModuleSource` option to a function that converts imports that are neither relative nor absolute (i.e. start with neither "/" nor ".") to real paths relative to **node_modules**

```javascript
{
  "preset": ["metal-resolve-source"]
}
```
