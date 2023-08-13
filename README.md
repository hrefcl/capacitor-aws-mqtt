# capacitor-aws-mqtt

Conectar aws mqtt via capacitor

## Install

```bash
npm install capacitor-aws-mqtt
npx cap sync
```

## API

<docgen-index>

* [`connect(...)`](#connect)
* [`subscribe(...)`](#subscribe)
* [`publish(...)`](#publish)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### connect(...)

```typescript
connect(options: { key: string; cert: string; ca: string; clientId: string; protocol: string; clean: boolean; host: string; }) => Promise<{ status: string; }>
```

| Param         | Type                                                                                                                      |
| ------------- | ------------------------------------------------------------------------------------------------------------------------- |
| **`options`** | <code>{ key: string; cert: string; ca: string; clientId: string; protocol: string; clean: boolean; host: string; }</code> |

**Returns:** <code>Promise&lt;{ status: string; }&gt;</code>

--------------------


### subscribe(...)

```typescript
subscribe(options: { topic: string; }) => Promise<{ status: string; }>
```

| Param         | Type                            |
| ------------- | ------------------------------- |
| **`options`** | <code>{ topic: string; }</code> |

**Returns:** <code>Promise&lt;{ status: string; }&gt;</code>

--------------------


### publish(...)

```typescript
publish(options: { message: string; topic: string; }) => Promise<{ status: string; }>
```

| Param         | Type                                             |
| ------------- | ------------------------------------------------ |
| **`options`** | <code>{ message: string; topic: string; }</code> |

**Returns:** <code>Promise&lt;{ status: string; }&gt;</code>

--------------------

</docgen-api>
