---
title: getChatScheduledMessages - libtd-ktx
---

[libtd-ktx](../index.html) / [kotlinx.telegram.coroutines](index.html) / [getChatScheduledMessages](./get-chat-scheduled-messages.html)

# getChatScheduledMessages

`suspend fun `[`TelegramFlow`](../kotlinx.telegram.core/-telegram-flow/index.html)`.getChatScheduledMessages(chatId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`): `[`Messages`](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi/Messages.html)

Suspend function, which returns all scheduled messages in a chat. The messages are returned in a
reverse chronological order (i.e., in order of decreasing messageId).

### Parameters

`chatId` - Chat identifier.

**Return**
[Messages](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi/Messages.html) Contains a list of messages.

