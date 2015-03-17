var exec = require('cordova/exec');

function DeviceInfo() { 
    console.log("DeviceInfo.js: is created");
}

DeviceInfo.prototype.showToast = function(aString){ 
    console.log("DeviceInfo.js: showToast"); 
    exec(
        function(result){
            alert("OK" + reply);
        }, 
        function(result){
            alert("Error" + reply);
        },
        "DeviceInfo",
        aString,
        []
    );
} 

var deviceInfo = new DeviceInfo(); 
module.exports = deviceInfo;
