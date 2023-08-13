import { WebPlugin } from '@capacitor/core';

import type { MqttAwsPlugin } from './definitions';

export class MqttAwsWeb extends WebPlugin implements MqttAwsPlugin {
  async connect(): Promise<{ status: string }> {
    console.error('Method not implemented on web platform');
    return { status: 'Method not implemented on web platform' };
  }

  async subscribe(): Promise<{ status: string }> {
    console.error('Method not implemented on web platform');
    return { status: 'Method not implemented on web platform' };
  }

  async publish(): Promise<{ status: string }> {
    console.error('Method not implemented on web platform');
    return { status: 'Method not implemented on web platform' };
  }
}
