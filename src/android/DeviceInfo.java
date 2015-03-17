package com.chromedia.phonegap;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DeviceInfo extends CordovaPlugin
{
	/**
     * Constructor.
     */
    public DeviceInfo() {
    }
    
	@Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("getDeviceManufacturer")) {
            this.echo(android.os.Build.MANUFACTURER, callbackContext);
            return true;
        }
        return false;
    }
	
	private void echo(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }
}