[libtd-ktx](../index.md) / [kotlinx.telegram.coroutines](index.md) / [acceptCall](./accept-call.md)

# acceptCall

`suspend fun `[`TelegramFlow`](../kotlinx.telegram.core/-telegram-flow/index.md)`.acceptCall(callId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, protocol: `[`CallProtocol`](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi.CallProtocol.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Suspend function, which accepts an incoming call.

### Parameters

`callId` - Call identifier.

`protocol` - Description of the call protocols supported by the client.