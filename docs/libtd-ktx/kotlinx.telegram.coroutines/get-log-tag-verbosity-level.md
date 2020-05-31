---
title: getLogTagVerbosityLevel - libtd-ktx
---

[libtd-ktx](../index.html) / [kotlinx.telegram.coroutines](index.html) / [getLogTagVerbosityLevel](./get-log-tag-verbosity-level.html)

# getLogTagVerbosityLevel

`suspend fun `[`TelegramFlow`](../kotlinx.telegram.core/-telegram-flow/index.html)`.getLogTagVerbosityLevel(tag: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?): `[`LogVerbosityLevel`](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi.LogVerbosityLevel.html)

Suspend function, which returns current verbosity level for a specified TDLib internal log tag.
This is an offline method. Can be called before authorization. Can be called synchronously.

### Parameters

`tag` - Logging tag to change verbosity level.

**Return**
[LogVerbosityLevel](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi.LogVerbosityLevel.html) Contains a TDLib internal log verbosity level.

