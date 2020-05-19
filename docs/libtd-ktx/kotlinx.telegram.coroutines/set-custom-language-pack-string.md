---
title: setCustomLanguagePackString - libtd-ktx
---

[libtd-ktx](../index.html) / [kotlinx.telegram.coroutines](index.html) / [setCustomLanguagePackString](./set-custom-language-pack-string.html)

# setCustomLanguagePackString

`suspend fun `[`TelegramFlow`](../kotlinx.telegram.core/-telegram-flow/index.html)`.setCustomLanguagePackString(languagePackId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?, newString: `[`LanguagePackString`](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi/LanguagePackString.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Suspend function, which adds, edits or deletes a string in a custom local language pack. Can be
called before authorization.

### Parameters

`languagePackId` - Identifier of a previously added custom local language pack in the current
localization target.

`newString` - New language pack string.