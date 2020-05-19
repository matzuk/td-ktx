[libtd-ktx](../../index.md) / [kotlinx.telegram.extensions](../index.md) / [FileKtx](index.md) / [cancelUpload](./cancel-upload.md)

# cancelUpload

`open suspend fun `[`File`](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi/File.html)`.cancelUpload(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Suspend function, which stops the uploading of a file. Supported only for files uploaded by
using uploadFile. For other files the behavior is undefined.
