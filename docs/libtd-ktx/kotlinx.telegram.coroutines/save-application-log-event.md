---
title: saveApplicationLogEvent - libtd-ktx
---

[libtd-ktx](../index.html) / [kotlinx.telegram.coroutines](index.html) / [saveApplicationLogEvent](./save-application-log-event.html)

# saveApplicationLogEvent

`suspend fun `[`TelegramFlow`](../kotlinx.telegram.core/-telegram-flow/index.html)`.saveApplicationLogEvent(type: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?, chatId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, data: `[`JsonValue`](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi.JsonValue.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Suspend function, which saves application log event on the server. Can be called before
authorization.

### Parameters

`type` - Event type.

`chatId` - Optional chat identifier, associated with the event.

`data` - The log event data.