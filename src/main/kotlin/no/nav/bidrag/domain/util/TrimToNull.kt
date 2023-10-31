package no.nav.bidrag.domain.util

fun String?.trimToNull(): String? {
    return this?.trim()?.ifBlank { null }
}
