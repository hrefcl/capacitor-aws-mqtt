export interface MqttAwsPlugin {
  connect(options: {
    key: string; // Clave privada en formato PEM
    cert: string; // Certificado en formato PEM
    ca: string; // CA en formato PEM
    clientId: string; // Identificador UUID
    protocol: string; // 'mqtts'
    clean: boolean; // true
    host: string; // 'a3hxku8lcga2qj-ats.iot.us-east-1.amazonaws.com'
  }): Promise<{ status: string }>;

  subscribe(options: {
    topic: string; // Tópico para suscribir
  }): Promise<{ status: string }>;

  publish(options: {
    message: string; // Mensaje para publicar
    topic: string; // Tópico al que publicar
  }): Promise<{ status: string }>;
}
