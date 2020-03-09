'use strict';

var resolve = require('resolve');

module.exports = function(module) {
  return resolve.sync(module, {basedir: process.cwd()});
};
