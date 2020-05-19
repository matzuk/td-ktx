---
title: getChatMember - libtd-ktx
---

[libtd-ktx](../index.html) / [kotlinx.telegram.coroutines](index.html) / [getChatMember](./get-chat-member.html)

# getChatMember

`suspend fun `[`TelegramFlow`](../kotlinx.telegram.core/-telegram-flow/index.html)`.getChatMember(chatId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, userId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`ChatMember`](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi/ChatMember.html)

Suspend function, which returns information about a single member of a chat.

### Parameters

`chatId` - Chat identifier.

`userId` - User identifier.

**Return**
[ChatMember](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi/ChatMember.html) A user with information about joining/leaving a chat.

