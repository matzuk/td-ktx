[libtd-ktx](../index.md) / [kotlinx.telegram.flows](index.md) / [messageSendAcknowledgedFlow](./message-send-acknowledged-flow.md)

# messageSendAcknowledgedFlow

`fun `[`TelegramFlow`](../kotlinx.telegram.core/-telegram-flow/index.md)`.messageSendAcknowledgedFlow(): Flow<`[`UpdateMessageSendAcknowledged`](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi/UpdateMessageSendAcknowledged.html)`>`

emits [UpdateMessageSendAcknowledged](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi/UpdateMessageSendAcknowledged.html) if a request to send a message has reached the Telegram
server. This doesn't mean that the message will be sent successfully or even that the send message
request will be processed. This update will be sent only if the option &amp;quot;use_quick_ack&amp;quot; is
set to true. This update may be sent multiple times for the same message.
