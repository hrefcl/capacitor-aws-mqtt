import { registerPlugin } from '@capacitor/core';

import type { MqttAwsPlugin } from './definitions';

const MqttAws = registerPlugin<MqttAwsPlugin>('MqttAws', {
  web: () => import('./web').then(m => new m.MqttAwsWeb()),
});

export * from './definitions';
export { MqttAws };
