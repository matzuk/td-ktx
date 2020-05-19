---
title: generateChatInviteLink - libtd-ktx
---

[libtd-ktx](../index.html) / [kotlinx.telegram.coroutines](index.html) / [generateChatInviteLink](./generate-chat-invite-link.html)

# generateChatInviteLink

`suspend fun `[`TelegramFlow`](../kotlinx.telegram.core/-telegram-flow/index.html)`.generateChatInviteLink(chatId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`): `[`ChatInviteLink`](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi/ChatInviteLink.html)

Suspend function, which generates a new invite link for a chat; the previously generated link is
revoked. Available for basic groups, supergroups, and channels. Requires administrator privileges
and canInviteUsers right.

### Parameters

`chatId` - Chat identifier.

**Return**
[ChatInviteLink](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi/ChatInviteLink.html) Contains a chat invite link.

