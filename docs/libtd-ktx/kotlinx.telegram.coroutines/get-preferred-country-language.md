---
title: getPreferredCountryLanguage - libtd-ktx
---

[libtd-ktx](../index.html) / [kotlinx.telegram.coroutines](index.html) / [getPreferredCountryLanguage](./get-preferred-country-language.html)

# getPreferredCountryLanguage

`suspend fun `[`TelegramFlow`](../kotlinx.telegram.core/-telegram-flow/index.html)`.getPreferredCountryLanguage(countryCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?): `[`Text`](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi.Text.html)

Suspend function, which returns an IETF language tag of the language preferred in the country,
which should be used to fill native fields in Telegram Passport personal details. Returns a 404
error if unknown.

### Parameters

`countryCode` - A two-letter ISO 3166-1 alpha-2 country code.

**Return**
[Text](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi.Text.html) Contains some text.

