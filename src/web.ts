import { WebPlugin } from '@capacitor/core';

import type { MqttAwsPlugin } from './definitions';

export class MqttAwsWeb extends WebPlugin implements MqttAwsPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
