package capacitor.aws.mqtt;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;

// @CapacitorPlugin(name = "MqttAws")
public class MqttAwsPlugin extends Plugin {

    private MqttAws mqttAws;

    @PluginMethod
    public void connect(PluginCall call) {
        String broker = call.getString("host");
        String clientId = call.getString("clientId");
        String privateKey = call.getString("privateKey");
        String certificate = call.getString("certificate");
        String caCertificate = call.getString("caCertificate");

        mqttAws = new MqttAws(broker, clientId, privateKey, certificate, caCertificate);

        try {
            mqttAws.connect();
            call.success();
        } catch (Exception e) {
            call.reject("Error connecting to MQTT", e);
        }
    }

    @PluginMethod
    public void subscribe(PluginCall call) {
        String topic = call.getString("topic");
        int qos = call.getInt("qos", 1);

        try {
            mqttAws.subscribe(topic, qos);
            call.success();
        } catch (Exception e) {
            call.reject("Error subscribing to topic", e);
        }
    }

    @PluginMethod
    public void publish(PluginCall call) {
        String topic = call.getString("topic");
        String payload = call.getString("payload");
        int qos = call.getInt("qos", 1);
        boolean retained = call.getBoolean("retained", false);

        try {
            mqttAws.publish(topic, payload, qos, retained);
            call.success();
        } catch (Exception e) {
            call.reject("Error publishing message", e);
        }
    }
}
