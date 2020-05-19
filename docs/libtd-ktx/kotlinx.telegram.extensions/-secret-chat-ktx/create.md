---
title: SecretChatKtx.create - libtd-ktx
---

[libtd-ktx](../../index.html) / [kotlinx.telegram.extensions](../index.html) / [SecretChatKtx](index.html) / [create](./create.html)

# create

`open suspend fun `[`SecretChat`](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi/SecretChat.html)`.create(): `[`Chat`](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi/Chat.html)

Suspend function, which returns an existing chat corresponding to a known secret chat.

**Return**
[TdApi.Chat](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi/Chat.html) A chat. (Can be a private chat, basic group, supergroup, or secret chat.)

