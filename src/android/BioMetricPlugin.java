package cordova.plugin.biometric;

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
        if (action.equals("coolMethod")) {
            String message = args.getString(0);
            this.coolMethod(message, callbackContext);
            return true;
        } else if (action.equals("addMethod")) {
            String No1 = args.getString(0);
            String No2 = args.getString(1);
            this.addMethod(No1, No2, callbackContext);
            return true;
        }  

        
        return false;
    }

    private void coolMethod(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }

    private void addMethod(String no1, String no2, CallbackContext callbackContext) {
        int val1 = Integer.parseInt(no1);
        int val2 = Integer.parseInt(no2);
        int val3 = val1 + val2;
        callbackContext.success(val3);
    }

}
