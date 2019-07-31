var exec = require('cordova/exec');

module.exports.coolMethod = function (arg0, success, error) {
    exec(success, error, 'BioMetricPlugin', 'coolMethod', [arg0]);
};

module.exports.addMethod = function (arg0, success, error) {
    exec(success, error, 'BioMetricPlugin', 'addMethod', [arg0]);
};

// exports.anotherClassMethod = function (arg0, success, error) {
//     exec(success, error, 'BioMetricPlugin', 'anotherClassMethod', [arg0]);
// };
