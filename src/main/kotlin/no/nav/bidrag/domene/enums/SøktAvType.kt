package no.nav.bidrag.domene.enums

enum class SøktAvType(val kode: String) {
    BIDRAGSMOTTAKER("MO"),
    BIDRAGSPLIKTIG("PL"),
    BARN_18_AAR("BB"),
    BM_I_ANNEN_SAK("AS"),
    NAV_BIDRAG("ET"), // TK
    FYLKESNEMDA("FN"),
    NAV_INTERNASJONALT("IN"),
    KOMMUNE("KU"),
    NORSKE_MYNDIGHET("NM"),
    UTENLANDSKE_MYNDIGHET("UM"),
    VERGE("VE"),
    TRYGDEETATEN_INNKREVING("TI"),
    KLAGE_ANKE("FK"), // FTK

    KONVERTERING("KV"); // Kodeverdi som brukes i eldre overførte saker i Bisys. Ikke bruk

    companion object {
        fun fraKode(kode: String): SøktAvType? = entries.find { it.kode == kode }
    }
}
