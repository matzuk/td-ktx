---
title: setSupergroupStickerSet - libtd-ktx
---

[libtd-ktx](../index.html) / [kotlinx.telegram.coroutines](index.html) / [setSupergroupStickerSet](./set-supergroup-sticker-set.html)

# setSupergroupStickerSet

`suspend fun `[`TelegramFlow`](../kotlinx.telegram.core/-telegram-flow/index.html)`.setSupergroupStickerSet(supergroupId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, stickerSetId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Suspend function, which changes the sticker set of a supergroup; requires canChangeInfo rights.

### Parameters

`supergroupId` - Identifier of the supergroup.

`stickerSetId` - New value of the supergroup sticker set identifier. Use 0 to remove the
supergroup sticker set.