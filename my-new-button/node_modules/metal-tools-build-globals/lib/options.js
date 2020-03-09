'use strict';

var babelPresetEs2015 = require('babel-preset-es2015');
var babelPresetMetalResolveSource = require('babel-preset-metal-resolve-source');

module.exports = {
  babelPresets: [babelPresetEs2015, babelPresetMetalResolveSource],
  bundleFileName: 'metal.js',
  cacheNamespace: 'metal-globals',
  dest: 'build/globals',
  globalName: 'metal',
  sourceMaps: true,
  src: 'src/**/*.js'
};
