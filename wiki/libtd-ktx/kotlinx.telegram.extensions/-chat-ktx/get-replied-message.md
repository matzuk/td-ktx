[libtd-ktx](../../index.md) / [kotlinx.telegram.extensions](../index.md) / [ChatKtx](index.md) / [getRepliedMessage](./get-replied-message.md)

# getRepliedMessage

`open suspend fun `[`Chat`](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi/Chat.html)`.getRepliedMessage(messageId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`): `[`Message`](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi/Message.html)

Suspend function, which returns information about a message that is replied by given message.

### Parameters

`messageId` - Identifier of the message reply to which get.

**Return**
[TdApi.Message](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi/Message.html) Describes a message.
