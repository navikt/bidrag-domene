package no.nav.bidrag.domene.enums

import io.swagger.v3.oas.annotations.media.Schema

@Schema(enumAsRef = true)
enum class BehandlingsrefKilde {
    BEHANDLING_ID, // Id fra bidrag-behandling
    BISYS_SOKNAD, // Søknadsid fra Bisys
    BISYS_KLAGE_REF_SOKNAD, // For klage: Bisys søknadsid til den opprinnelige søknaden det klages på
}
