package no.nav.bidrag.domene.enums

import io.swagger.v3.oas.annotations.media.Schema

@Schema(enumAsRef = true)
enum class Inntektstype {
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
        fun Inntektstype.inngårIInntektRapporteringer() =
            Inntektsrapportering.entries.filter { this in it.inneholderInntektstypeListe }
    }
}
