---
title: removeTopChat - libtd-ktx
---

[libtd-ktx](../index.html) / [kotlinx.telegram.coroutines](index.html) / [removeTopChat](./remove-top-chat.html)

# removeTopChat

`suspend fun `[`TelegramFlow`](../kotlinx.telegram.core/-telegram-flow/index.html)`.removeTopChat(category: `[`TopChatCategory`](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi.TopChatCategory.html)`?, chatId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Suspend function, which removes a chat from the list of frequently used chats. Supported only if
the chat info database is enabled.

### Parameters

`category` - Category of frequently used chats.

`chatId` - Chat identifier.