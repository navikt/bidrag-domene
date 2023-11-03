package no.nav.bidrag.domene.enums

enum class Bostatuskode {
    MED_FORELDER,
    DOKUMENTERT_SKOLEGANG, // Hvis barnet er over 18 år, bor med forelder og går på skole
    IKKE_MED_FORELDER,
    MED_VERGE,
    ALENE,
    DELT_BOSTED,
}
