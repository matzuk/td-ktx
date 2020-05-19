---
title: deleteSupergroup - libtd-ktx
---

[libtd-ktx](../index.html) / [kotlinx.telegram.coroutines](index.html) / [deleteSupergroup](./delete-supergroup.html)

# deleteSupergroup

`suspend fun `[`TelegramFlow`](../kotlinx.telegram.core/-telegram-flow/index.html)`.deleteSupergroup(supergroupId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Suspend function, which deletes a supergroup or channel along with all messages in the
corresponding chat. This will release the supergroup or channel username and remove all members;
requires owner privileges in the supergroup or channel. Chats with more than 1000 members can't be
deleted using this method.

### Parameters

`supergroupId` - Identifier of the supergroup or channel.