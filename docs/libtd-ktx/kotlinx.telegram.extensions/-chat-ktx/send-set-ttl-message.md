---
title: ChatKtx.sendSetTtlMessage - libtd-ktx
---

[libtd-ktx](../../index.html) / [kotlinx.telegram.extensions](../index.html) / [ChatKtx](index.html) / [sendSetTtlMessage](./send-set-ttl-message.html)

# sendSetTtlMessage

`open suspend fun `[`Chat`](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi.Chat.html)`.sendSetTtlMessage(ttl: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Message`](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi.Message.html)

Suspend function, which changes the current TTL setting (sets a new self-destruct timer) in a
secret chat and sends the corresponding message.

### Parameters

`ttl` - New TTL value, in seconds.

**Return**
[TdApi.Message](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi.Message.html) Describes a message.

