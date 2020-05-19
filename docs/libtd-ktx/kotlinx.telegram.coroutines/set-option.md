---
title: setOption - libtd-ktx
---

[libtd-ktx](../index.html) / [kotlinx.telegram.coroutines](index.html) / [setOption](./set-option.html)

# setOption

`suspend fun `[`TelegramFlow`](../kotlinx.telegram.core/-telegram-flow/index.html)`.setOption(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?, value: `[`OptionValue`](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi/OptionValue.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Suspend function, which sets the value of an option. (Check the list of available options on
https://core.telegram.org/tdlib/options.) Only writable options can be set. Can be called before
authorization.

### Parameters

`name` - The name of the option.

`value` - The new value of the option.