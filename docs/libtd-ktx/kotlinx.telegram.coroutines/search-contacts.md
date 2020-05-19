---
title: searchContacts - libtd-ktx
---

[libtd-ktx](../index.html) / [kotlinx.telegram.coroutines](index.html) / [searchContacts](./search-contacts.html)

# searchContacts

`suspend fun `[`TelegramFlow`](../kotlinx.telegram.core/-telegram-flow/index.html)`.searchContacts(query: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?, limit: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Users`](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi/Users.html)

Suspend function, which searches for the specified query in the first names, last names and
usernames of the known user contacts.

### Parameters

`query` - Query to search for; may be empty to return all contacts.

`limit` - The maximum number of users to be returned.

**Return**
[Users](https://tdlibx.github.io/td/docs/org/drinkless/td/libcore/telegram/TdApi/Users.html) Represents a list of users.

