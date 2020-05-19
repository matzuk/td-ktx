---
title: checkAuthenticationBotToken - libtd-ktx
---

[libtd-ktx](../index.html) / [kotlinx.telegram.coroutines](index.html) / [checkAuthenticationBotToken](./check-authentication-bot-token.html)

# checkAuthenticationBotToken

`suspend fun `[`TelegramFlow`](../kotlinx.telegram.core/-telegram-flow/index.html)`.checkAuthenticationBotToken(token: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Suspend function, which checks the authentication token of a bot; to log in as a bot. Works only
when the current authorization state is authorizationStateWaitPhoneNumber. Can be used instead of
setAuthenticationPhoneNumber and checkAuthenticationCode to log in.

### Parameters

`token` - The bot token.