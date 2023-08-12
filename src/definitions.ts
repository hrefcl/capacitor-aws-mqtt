export interface MqttAwsPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
