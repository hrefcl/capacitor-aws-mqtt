package capacitor.aws.mqtt;

import android.util.Log;

public class MqttAws {

    public String echo(String value) {
        Log.i("Echo", value);
        return value;
    }
}
