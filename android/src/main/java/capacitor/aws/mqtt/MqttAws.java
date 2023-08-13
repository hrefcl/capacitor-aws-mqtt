package capacitor.aws.mqtt;

import org.eclipse.paho.client.mqttv3.*;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

public class MqttAws {

    private MqttClient client;
    private String broker;
    private String clientId;
    private MemoryPersistence persistence = new MemoryPersistence();
    private String privateKey;
    private String certificate;
    private String caCertificate;

    public MqttAws(String broker, String clientId, String privateKey, String certificate, String caCertificate) {
        this.broker = broker;
        this.clientId = clientId;
        this.privateKey = privateKey;
        this.certificate = certificate;
        this.caCertificate = caCertificate;
    }

    public void connect() throws MqttException {
        MqttConnectOptions connOpts = new MqttConnectOptions();
        connOpts.setCleanSession(true);

        // Aquí debes configurar los certificados y la clave privada.
        // Puedes necesitar convertirlos en objetos adecuados, como X509Certificate y PrivateKey.

        client = new MqttClient(broker, clientId, persistence);
        client.connect(connOpts);
    }

    public void subscribe(String topic, int qos) throws MqttException {
        if (client != null) {
            client.subscribe(topic, qos);
        }
    }

    public void publish(String topic, String payload, int qos, boolean retained) throws MqttException {
        if (client != null) {
            MqttMessage message = new MqttMessage(payload.getBytes());
            message.setQos(qos);
            message.setRetained(retained);
            client.publish(topic, message);
        }
    }
}
