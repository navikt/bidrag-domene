@file:Suppress("unused")

package no.nav.bidrag.domene.enums

import io.swagger.v3.oas.annotations.media.Schema

@Schema(enumAsRef = true)
enum class Sivilstandstype {
    ENKE_ELLER_ENKEMANN,
    GIFT,
    GJENLEVENDE_PARTNER,
    REGISTRERT_PARTNER,
    SEPARERT,
    SEPARERT_PARTNER,
    SKILT,
    SKILT_PARTNER,
    UGIFT,
    UOPPGITT,
}
