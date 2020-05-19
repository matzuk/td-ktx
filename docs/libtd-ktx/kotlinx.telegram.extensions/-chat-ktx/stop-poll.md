---
title: ChatKtx.stopPoll - libtd-ktx
---

[libtd-ktx](../../index.html) / [kotlinx.telegram.extensions](../index.html) / [ChatKtx](index.html) / [stopPoll](./stop-poll.html)

# stopPoll

`open suspend fun `[`Chat`](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi/Chat.html)`.stopPoll(messageId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, replyMarkup: `[`ReplyMarkup`](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi/ReplyMarkup.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Suspend function, which stops a poll. A poll in a message can be stopped when the message has
canBeEdited flag set.

### Parameters

`messageId` - Identifier of the message containing the poll.

`replyMarkup` - The new message reply markup; for bots only.