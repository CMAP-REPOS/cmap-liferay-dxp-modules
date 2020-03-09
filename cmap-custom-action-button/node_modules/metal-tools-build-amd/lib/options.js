'use strict';

var babelPresetEs2015 = require('babel-preset-es2015');
var babelPresetMetalResolveSource = require('babel-preset-metal-resolve-source');

module.exports = {
  babelPresets: [babelPresetEs2015, babelPresetMetalResolveSource],
  base: process.cwd(),
  cacheNamespace: 'metal-amd',
  moduleName: 'metal',
  sourceMaps: true
};
