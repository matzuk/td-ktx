---
title: ChatKtx.generateInviteLink - libtd-ktx
---

[libtd-ktx](../../index.html) / [kotlinx.telegram.extensions](../index.html) / [ChatKtx](index.html) / [generateInviteLink](./generate-invite-link.html)

# generateInviteLink

`open suspend fun `[`Chat`](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi.Chat.html)`.generateInviteLink(): `[`ChatInviteLink`](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi.ChatInviteLink.html)

Suspend function, which generates a new invite link for a chat; the previously generated link
is revoked. Available for basic groups, supergroups, and channels. Requires administrator
privileges and canInviteUsers right.

**Return**
[TdApi.ChatInviteLink](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi.ChatInviteLink.html) Contains a chat invite link.

