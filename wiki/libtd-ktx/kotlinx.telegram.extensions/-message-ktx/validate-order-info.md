[libtd-ktx](../../index.md) / [kotlinx.telegram.extensions](../index.md) / [MessageKtx](index.md) / [validateOrderInfo](./validate-order-info.md)

# validateOrderInfo

`open suspend fun `[`Message`](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi/Message.html)`.validateOrderInfo(chatId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, orderInfo: `[`OrderInfo`](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi/OrderInfo.html)`?, allowSave: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`ValidatedOrderInfo`](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi/ValidatedOrderInfo.html)

Suspend function, which validates the order information provided by a user and returns the
available shipping options for a flexible invoice.

### Parameters

`chatId` - Chat identifier of the Invoice message.

`orderInfo` - The order information, provided by the user.

`allowSave` - True, if the order information can be saved.

**Return**
[TdApi.ValidatedOrderInfo](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi/ValidatedOrderInfo.html) Contains a temporary identifier of validated order
information, which is stored for one hour. Also contains the available shipping options.
