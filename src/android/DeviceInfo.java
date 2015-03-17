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
            //callbackContext.success(android.os.Build.MANUFACTURER);
        	callbackContext.success("KIAM: "+android.os.Build.MANUFACTURER);
            return true;
        }
        return false;
    }
}