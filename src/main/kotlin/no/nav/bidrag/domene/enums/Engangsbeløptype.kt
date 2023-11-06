package no.nav.bidrag.domene.enums

import io.swagger.v3.oas.annotations.media.Schema

@Schema(enumAsRef = true)
enum class Engangsbeløptype {
    DIREKTE_OPPGJOR,
    ETTERGIVELSE,
    ETTERGIVELSE_TILBAKEKREVING,
    GEBYR_MOTTAKER,
    GEBYR_SKYLDNER,
    INNKREVING_GJELD,
    SAERTILSKUDD,
    TILBAKEKREVING,
}
