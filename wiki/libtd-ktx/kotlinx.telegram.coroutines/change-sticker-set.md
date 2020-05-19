[libtd-ktx](../index.md) / [kotlinx.telegram.coroutines](index.md) / [changeStickerSet](./change-sticker-set.md)

# changeStickerSet

`suspend fun `[`TelegramFlow`](../kotlinx.telegram.core/-telegram-flow/index.md)`.changeStickerSet(setId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, isInstalled: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, isArchived: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Suspend function, which installs/uninstalls or activates/archives a sticker set.

### Parameters

`setId` - Identifier of the sticker set.

`isInstalled` - The new value of isInstalled.

`isArchived` - The new value of isArchived. A sticker set can't be installed and archived
simultaneously.