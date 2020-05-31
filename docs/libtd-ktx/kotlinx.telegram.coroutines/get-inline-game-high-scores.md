---
title: getInlineGameHighScores - libtd-ktx
---

[libtd-ktx](../index.html) / [kotlinx.telegram.coroutines](index.html) / [getInlineGameHighScores](./get-inline-game-high-scores.html)

# getInlineGameHighScores

`suspend fun `[`TelegramFlow`](../kotlinx.telegram.core/-telegram-flow/index.html)`.getInlineGameHighScores(inlineMessageId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?, userId: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`GameHighScores`](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi.GameHighScores.html)

Suspend function, which returns game high scores and some part of the high score table in the
range of the specified user; for bots only.

### Parameters

`inlineMessageId` - Inline message identifier.

`userId` - User identifier.

**Return**
[GameHighScores](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi.GameHighScores.html) Contains a list of game high scores.

