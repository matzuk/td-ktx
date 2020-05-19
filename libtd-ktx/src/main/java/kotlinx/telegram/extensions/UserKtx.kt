//
// NOTE: THIS FILE IS AUTO-GENERATED by the "ExtensionsGenerator".kt
// See: https://github.com/tdlibx/td-ktx-generator/
//
package kotlinx.telegram.extensions

import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.LongArray
import kotlin.String
import kotlinx.telegram.core.TelegramFlow
import kotlinx.telegram.coroutines.addChatMember
import kotlinx.telegram.coroutines.addStickerToSet
import kotlinx.telegram.coroutines.blockUser
import kotlinx.telegram.coroutines.createCall
import kotlinx.telegram.coroutines.createNewSecretChat
import kotlinx.telegram.coroutines.createNewStickerSet
import kotlinx.telegram.coroutines.createPrivateChat
import kotlinx.telegram.coroutines.deleteChatMessagesFromUser
import kotlinx.telegram.coroutines.getChatMember
import kotlinx.telegram.coroutines.getGameHighScores
import kotlinx.telegram.coroutines.getGroupsInCommon
import kotlinx.telegram.coroutines.getInlineGameHighScores
import kotlinx.telegram.coroutines.getUser
import kotlinx.telegram.coroutines.getUserFullInfo
import kotlinx.telegram.coroutines.getUserProfilePhotos
import kotlinx.telegram.coroutines.reportSupergroupSpam
import kotlinx.telegram.coroutines.setChatMemberStatus
import kotlinx.telegram.coroutines.setGameScore
import kotlinx.telegram.coroutines.setInlineGameScore
import kotlinx.telegram.coroutines.setPassportElementErrors
import kotlinx.telegram.coroutines.sharePhoneNumber
import kotlinx.telegram.coroutines.transferChatOwnership
import kotlinx.telegram.coroutines.unblockUser
import kotlinx.telegram.coroutines.uploadStickerFile
import org.drinkless.td.libcore.telegram.TdApi
import org.drinkless.td.libcore.telegram.TdApi.CallProtocol
import org.drinkless.td.libcore.telegram.TdApi.ChatMemberStatus
import org.drinkless.td.libcore.telegram.TdApi.InputFile
import org.drinkless.td.libcore.telegram.TdApi.InputPassportElementError
import org.drinkless.td.libcore.telegram.TdApi.InputSticker
import org.drinkless.td.libcore.telegram.TdApi.User

/**
 * Interface for access [TdApi.User] extension functions. Can be used alongside with other extension
 * interfaces of the package. Must contain [TelegramFlow] instance field to access its functionality
 */
interface UserKtx : BaseKtx {
  /**
   * Instance of the [TelegramFlow] connecting extensions to the Telegram Client
   */
  override val api: TelegramFlow

  /**
   * Suspend function, which adds a new member to a chat. Members can't be added to private or
   * secret chats. Members will not be added until the chat state has been synchronized with the
   * server.
   *
   * @param chatId Chat identifier.  
   * @param forwardLimit The number of earlier messages from the chat to be forwarded to the new
   * member; up to 100. Ignored for supergroups and channels.
   */
  suspend fun User.addChatMember(chatId: Long, forwardLimit: Int) = api.addChatMember(chatId,
      this.id, forwardLimit)

  /**
   * Suspend function, which adds a new sticker to a set; for bots only. Returns the sticker set.
   *
   * @param name Sticker set name.  
   * @param sticker Sticker to add to the set.
   *
   * @return [TdApi.StickerSet] Represents a sticker set.
   */
  suspend fun User.addStickerToSet(name: String?, sticker: InputSticker?) =
      api.addStickerToSet(this.id, name, sticker)

  /**
   * Suspend function, which adds a user to the blacklist.
   */
  suspend fun User.block() = api.blockUser(this.id)

  /**
   * Suspend function, which creates a new call.
   *
   * @param protocol Description of the call protocols supported by the client.
   *
   * @return [TdApi.CallId] Contains the call identifier.
   */
  suspend fun User.createCall(protocol: CallProtocol?) = api.createCall(this.id, protocol)

  /**
   * Suspend function, which creates a new secret chat. Returns the newly created chat.
   *
   *
   * @return [TdApi.Chat] A chat. (Can be a private chat, basic group, supergroup, or secret chat.)
   */
  suspend fun User.createNewSecretChat() = api.createNewSecretChat(this.id)

  /**
   * Suspend function, which creates a new sticker set; for bots only. Returns the newly created
   * sticker set.
   *
   * @param title Sticker set title; 1-64 characters.  
   * @param name Sticker set name. Can contain only English letters, digits and underscores. Must
   * end with *&quot;_by_&lt;bot username&gt;&quot;* (*&lt;botUsername&gt;* is case insensitive); 1-64
   * characters.  
   * @param isMasks True, if stickers are masks.  
   * @param stickers List of stickers to be added to the set.
   *
   * @return [TdApi.StickerSet] Represents a sticker set.
   */
  suspend fun User.createNewStickerSet(
    title: String?,
    name: String?,
    isMasks: Boolean,
    stickers: Array<InputSticker>?
  ) = api.createNewStickerSet(this.id, title, name, isMasks, stickers)

  /**
   * Suspend function, which returns an existing chat corresponding to a given user.
   *
   * @param force If true, the chat will be created without network request. In this case all
   * information about the chat except its type, title and photo can be incorrect.
   *
   * @return [TdApi.Chat] A chat. (Can be a private chat, basic group, supergroup, or secret chat.)
   */
  suspend fun User.createPrivateChat(force: Boolean) = api.createPrivateChat(this.id, force)

  /**
   * Suspend function, which deletes all messages sent by the specified user to a chat. Supported
   * only for supergroups; requires canDeleteMessages administrator privileges.
   *
   * @param chatId Chat identifier.  
   */
  suspend fun User.deleteChatMessagesFrom(chatId: Long) = api.deleteChatMessagesFromUser(chatId,
      this.id)

  /**
   * Suspend function, which returns information about a single member of a chat.
   *
   * @param chatId Chat identifier.  
   *
   * @return [TdApi.ChatMember] A user with information about joining/leaving a chat.
   */
  suspend fun User.getChatMember(chatId: Long) = api.getChatMember(chatId, this.id)

  /**
   * Suspend function, which returns the high scores for a game and some part of the high score
   * table in the range of the specified user; for bots only.
   *
   * @param chatId The chat that contains the message with the game.  
   * @param messageId Identifier of the message.  
   *
   * @return [TdApi.GameHighScores] Contains a list of game high scores.
   */
  suspend fun User.getGameHighScores(chatId: Long, messageId: Long) = api.getGameHighScores(chatId,
      messageId, this.id)

  /**
   * Suspend function, which returns a list of common group chats with a given user. Chats are
   * sorted by their type and creation date.
   *
   * @param offsetChatId Chat identifier starting from which to return chats; use 0 for the first
   * request.  
   * @param limit The maximum number of chats to be returned; up to 100.
   *
   * @return [TdApi.Chats] Represents a list of chats.
   */
  suspend fun User.getGroupsInCommon(offsetChatId: Long, limit: Int) =
      api.getGroupsInCommon(this.id, offsetChatId, limit)

  /**
   * Suspend function, which returns game high scores and some part of the high score table in the
   * range of the specified user; for bots only.
   *
   * @param inlineMessageId Inline message identifier.  
   *
   * @return [TdApi.GameHighScores] Contains a list of game high scores.
   */
  suspend fun User.getInlineGameHighScores(inlineMessageId: String?) =
      api.getInlineGameHighScores(inlineMessageId, this.id)

  /**
   * Suspend function, which returns information about a user by their identifier. This is an
   * offline request if the current user is not a bot.
   *
   *
   * @return [TdApi.User] Represents a user.
   */
  suspend fun User.get() = api.getUser(this.id)

  /**
   * Suspend function, which returns full information about a user by their identifier.
   *
   *
   * @return [TdApi.UserFullInfo] Contains full information about a user (except the full list of
   * profile photos).
   */
  suspend fun User.getFullInfo() = api.getUserFullInfo(this.id)

  /**
   * Suspend function, which returns the profile photos of a user. The result of this query may be
   * outdated: some photos might have been deleted already.
   *
   * @param offset The number of photos to skip; must be non-negative.  
   * @param limit The maximum number of photos to be returned; up to 100.
   *
   * @return [TdApi.UserProfilePhotos] Contains part of the list of user photos.
   */
  suspend fun User.getProfilePhotos(offset: Int, limit: Int) = api.getUserProfilePhotos(this.id,
      offset, limit)

  /**
   * Suspend function, which reports some messages from a user in a supergroup as spam; requires
   * administrator rights in the supergroup.
   *
   * @param supergroupId Supergroup identifier.  
   * @param messageIds Identifiers of messages sent in the supergroup by the user. This list must be
   * non-empty.
   */
  suspend fun User.reportSupergroupSpam(supergroupId: Int, messageIds: LongArray?) =
      api.reportSupergroupSpam(supergroupId, this.id, messageIds)

  /**
   * Suspend function, which changes the status of a chat member, needs appropriate privileges. This
   * function is currently not suitable for adding new members to the chat and transferring chat
   * ownership; instead, use addChatMember or transferChatOwnership. The chat member status will not be
   * changed until it has been synchronized with the server.
   *
   * @param chatId Chat identifier.  
   * @param status The new status of the member in the chat.
   */
  suspend fun User.setChatMemberStatus(chatId: Long, status: ChatMemberStatus?) =
      api.setChatMemberStatus(chatId, this.id, status)

  /**
   * Suspend function, which updates the game score of the specified user in the game; for bots
   * only.
   *
   * @param chatId The chat to which the message with the game belongs.  
   * @param messageId Identifier of the message.  
   * @param editMessage True, if the message should be edited.  
   * @param score The new score.  
   * @param force Pass true to update the score even if it decreases. If the score is 0, the user
   * will be deleted from the high score table.
   *
   * @return [TdApi.Message] Describes a message.
   */
  suspend fun User.setGameScore(
    chatId: Long,
    messageId: Long,
    editMessage: Boolean,
    score: Int,
    force: Boolean
  ) = api.setGameScore(chatId, messageId, editMessage, this.id, score, force)

  /**
   * Suspend function, which updates the game score of the specified user in a game; for bots only.
   *
   * @param inlineMessageId Inline message identifier.  
   * @param editMessage True, if the message should be edited.  
   * @param score The new score.  
   * @param force Pass true to update the score even if it decreases. If the score is 0, the user
   * will be deleted from the high score table.
   */
  suspend fun User.setInlineGameScore(
    inlineMessageId: String?,
    editMessage: Boolean,
    score: Int,
    force: Boolean
  ) = api.setInlineGameScore(inlineMessageId, editMessage, this.id, score, force)

  /**
   * Suspend function, which informs the user that some of the elements in their Telegram Passport
   * contain errors; for bots only. The user will not be able to resend the elements, until the errors
   * are fixed.
   *
   * @param errors The errors.
   */
  suspend fun User.setPassportElementErrors(errors: Array<InputPassportElementError>?) =
      api.setPassportElementErrors(this.id, errors)

  /**
   * Suspend function, which shares the phone number of the current user with a mutual contact.
   * Supposed to be called when the user clicks on chatActionBarSharePhoneNumber.
   */
  suspend fun User.sharePhoneNumber() = api.sharePhoneNumber(this.id)

  /**
   * Suspend function, which changes the owner of a chat. The current user must be a current owner
   * of the chat. Use the method canTransferOwnership to check whether the ownership can be transferred
   * from the current session. Available only for supergroups and channel chats.
   *
   * @param chatId Chat identifier.  
   * @param password The password of the current user.
   */
  suspend fun User.transferChatOwnership(chatId: Long, password: String?) =
      api.transferChatOwnership(chatId, this.id, password)

  /**
   * Suspend function, which removes a user from the blacklist.
   */
  suspend fun User.unblock() = api.unblockUser(this.id)

  /**
   * Suspend function, which uploads a PNG image with a sticker; for bots only; returns the uploaded
   * file.
   *
   * @param pngSticker PNG image with the sticker; must be up to 512 kB in size and fit in 512x512
   * square.
   *
   * @return [TdApi.File] Represents a file.
   */
  suspend fun User.uploadStickerFile(pngSticker: InputFile?) = api.uploadStickerFile(this.id,
      pngSticker)
}