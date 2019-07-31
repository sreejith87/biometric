var exec = require('cordova/exec');

exports.coolMethod = function (arg0, success, error) {
    exec(success, error, 'BioMetricPlugin', 'coolMethod', [arg0]);
};

exports.addMethod = function (arg0, success, error) {
    exec(success, error, 'BioMetricPlugin', 'addMethod', [arg0]);
};
