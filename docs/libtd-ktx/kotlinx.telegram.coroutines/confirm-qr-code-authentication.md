---
title: confirmQrCodeAuthentication - libtd-ktx
---

[libtd-ktx](../index.html) / [kotlinx.telegram.coroutines](index.html) / [confirmQrCodeAuthentication](./confirm-qr-code-authentication.html)

# confirmQrCodeAuthentication

`suspend fun `[`TelegramFlow`](../kotlinx.telegram.core/-telegram-flow/index.html)`.confirmQrCodeAuthentication(link: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?): `[`Session`](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi.Session.html)

Suspend function, which confirms QR code authentication on another device. Returns created
session on success.

### Parameters

`link` - A link from a QR code. The link must be scanned by the in-app camera.

**Return**
[Session](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi.Session.html) Contains information about one session in a Telegram application used by the
current user. Sessions should be shown to the user in the returned order.

