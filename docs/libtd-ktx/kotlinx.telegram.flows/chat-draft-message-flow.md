---
title: chatDraftMessageFlow - libtd-ktx
---

[libtd-ktx](../index.html) / [kotlinx.telegram.flows](index.html) / [chatDraftMessageFlow](./chat-draft-message-flow.html)

# chatDraftMessageFlow

`fun `[`TelegramFlow`](../kotlinx.telegram.core/-telegram-flow/index.html)`.chatDraftMessageFlow(): Flow<`[`UpdateChatDraftMessage`](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi.UpdateChatDraftMessage.html)`>`

emits [UpdateChatDraftMessage](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi.UpdateChatDraftMessage.html) if a chat draft has changed. Be aware that the update may come in
the currently opened chat but with old content of the draft. If the user has changed the content of
the draft, this update shouldn't be applied.

