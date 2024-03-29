package cordova_plugin_biometric;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class BioMetricPlugin extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("testMethod")) {
            this.testMethod(callbackContext);
            return true;
        } 
        return false;
    }

    private void testMethod(CallbackContext callbackContext) {
        callbackContext.success("its working");
    }
}
