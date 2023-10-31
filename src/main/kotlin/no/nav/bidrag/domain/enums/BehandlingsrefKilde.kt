package no.nav.bidrag.domain.enums

enum class BehandlingsrefKilde {
    BEHANDLING_ID, // Id fra bidrag-behandling
    BISYS_SOKNAD, // Søknadsid fra Bisys
    BISYS_KLAGE_REF_SOKNAD, // For klage: Bisys søknadsid til den opprinnelige søknaden det klages på
}
