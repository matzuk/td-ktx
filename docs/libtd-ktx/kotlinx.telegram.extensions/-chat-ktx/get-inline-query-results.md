---
title: ChatKtx.getInlineQueryResults - libtd-ktx
---

[libtd-ktx](../../index.html) / [kotlinx.telegram.extensions](../index.html) / [ChatKtx](index.html) / [getInlineQueryResults](./get-inline-query-results.html)

# getInlineQueryResults

`open suspend fun `[`Chat`](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi.Chat.html)`.getInlineQueryResults(botUserId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, userLocation: `[`Location`](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi.Location.html)`?, query: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?, offset: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?): `[`InlineQueryResults`](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi.InlineQueryResults.html)

Suspend function, which sends an inline query to a bot and returns its results. Returns an
error with code 502 if the bot fails to answer the query before the query timeout expires.

### Parameters

`botUserId` - The identifier of the target bot.

`userLocation` - Location of the user, only if needed.

`query` - Text of the query.

`offset` - Offset of the first entry to return.

**Return**
[TdApi.InlineQueryResults](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi.InlineQueryResults.html) Represents the results of the inline query. Use
sendInlineQueryResultMessage to send the result of the query.

