package fredboat.util.extension

import fredboat.sentinel.RawMessage
import fredboat.util.TextUtils

fun String.substringPreserveWords(len: Int) = TextUtils.substringPreserveWords(this, len)
fun String.parseTime() = TextUtils.parseTimeString(this)
fun String.asCodeBlock(style: String? = null) = TextUtils.asCodeBlock(this, style)
fun String.escapeAndDefuse() = TextUtils.escapeAndDefuse(this)
fun String.defuse() = TextUtils.defuse(this)
fun String.shorten(size: Int) = TextUtils.shorten(this, size)
fun String.isSplitSelect() = TextUtils.isSplitSelect(this)

fun String.escapeMarkdown() = TextUtils.escapeMarkdown(this)
fun String.escapeBackticks() = TextUtils.escapeBackticks(this)

fun String.toMessage() = RawMessage(this)

fun Float.toDecimalString(decimals: Int) = this.toString().substring(
        0,
        /*   Include digits   */   /* period */
        this.toInt().toString().length + 1 + decimals
)