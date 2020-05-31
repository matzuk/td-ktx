---
title: newChatFlow - libtd-ktx
---

[libtd-ktx](../index.html) / [kotlinx.telegram.flows](index.html) / [newChatFlow](./new-chat-flow.html)

# newChatFlow

`fun `[`TelegramFlow`](../kotlinx.telegram.core/-telegram-flow/index.html)`.newChatFlow(): Flow<`[`Chat`](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi.Chat.html)`>`

emits [Chat](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi.Chat.html) if a new chat has been loaded/created. This update is guaranteed to come before the
chat identifier is returned to the client. The chat field changes will be reported through separate
updates.

