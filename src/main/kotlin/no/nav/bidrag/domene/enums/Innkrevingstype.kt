package no.nav.bidrag.domene.enums

import io.swagger.v3.oas.annotations.media.Schema

@Schema(enumAsRef = true)
enum class Innkrevingstype {
    MED_INNKREVING,
    UTEN_INNKREVING,
}
