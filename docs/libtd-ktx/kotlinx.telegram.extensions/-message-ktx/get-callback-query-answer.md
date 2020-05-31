---
title: MessageKtx.getCallbackQueryAnswer - libtd-ktx
---

[libtd-ktx](../../index.html) / [kotlinx.telegram.extensions](../index.html) / [MessageKtx](index.html) / [getCallbackQueryAnswer](./get-callback-query-answer.html)

# getCallbackQueryAnswer

`open suspend fun `[`Message`](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi.Message.html)`.getCallbackQueryAnswer(chatId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, payload: `[`CallbackQueryPayload`](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi.CallbackQueryPayload.html)`?): `[`CallbackQueryAnswer`](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi.CallbackQueryAnswer.html)

Suspend function, which sends a callback query to a bot and returns an answer. Returns an error
with code 502 if the bot fails to answer the query before the query timeout expires.

### Parameters

`chatId` - Identifier of the chat with the message.

`payload` - Query payload.

**Return**
[TdApi.CallbackQueryAnswer](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi.CallbackQueryAnswer.html) Contains a bot's answer to a callback query.

