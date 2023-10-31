package no.nav.bidrag.domain.enums

enum class InntektType {
    AAP, // Ytelse fra offentlig
    DAGPENGER, // Ytelse fra offentlig
    FØDSEL_ADOPSJON, // Ytelse fra offentlig
    PENSJON, // Ytelse fra offentlig
    SYKEPENGER, // Ytelse fra offentlig
    LØNNSINNTEKT,
    NÆRINGSINNTEKT,
    KAPITALINNTEKT,
    OVERGANGSSTØNAD,
    KONTANTSTØTTE,
    UTVIDET_BARNETRYGD,
    SMÅBARNSTILLEGG,
    ;

    companion object {

        /**
         * Extension function som returnerer en liste av inntektrapporteringer som inneholder den aktuelle inntekttypen.
         * @return Liste av type InntektRapportering
         */
        fun InntektType.inngårIInntektRapporteringer() =
            InntektRapportering.values().filter { this in it.inneholderInntektTypeListe }
    }
}
