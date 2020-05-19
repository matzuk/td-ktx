---
title: deleteChatHistory - libtd-ktx
---

[libtd-ktx](../index.html) / [kotlinx.telegram.coroutines](index.html) / [deleteChatHistory](./delete-chat-history.html)

# deleteChatHistory

`suspend fun `[`TelegramFlow`](../kotlinx.telegram.core/-telegram-flow/index.html)`.deleteChatHistory(chatId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, removeFromChatList: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, revoke: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Suspend function, which deletes all messages in the chat. Use Chat.canBeDeletedOnlyForSelf and
Chat.canBeDeletedForAllUsers fields to find whether and how the method can be applied to the chat.

### Parameters

`chatId` - Chat identifier.

`removeFromChatList` - Pass true if the chat should be removed from the chat list.

`revoke` - Pass true to try to delete chat history for all users.