package no.nav.bidrag.domene.enums.inntekt

import io.swagger.v3.oas.annotations.media.Schema

@Schema(enumAsRef = true)
enum class Inntektsrapportering(
    val visningsnavn: String,
    val hentesAutomatisk: Boolean,
    val kanLeggesInnManuelt: Boolean,
    val inneholderInntektstypeListe: List<Inntektstype>,
) {

    // Rapporteringer fra bidrag-inntekt

    AINNTEKT(
        visningsnavn = "Lønn og trekk",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektstypeListe = listOf(
            Inntektstype.DAGPENGER,
            Inntektstype.AAP,
            Inntektstype.FØDSEL_ADOPSJON,
            Inntektstype.PENSJON,
            Inntektstype.SYKEPENGER,
            Inntektstype.LØNNSINNTEKT,
            Inntektstype.OVERGANGSSTØNAD,
        ),
    ),

    AINNTEKT_BEREGNET_3MND(
        visningsnavn = "Lønn og trekk siste 3 mnd",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektstypeListe = listOf(
            Inntektstype.DAGPENGER,
            Inntektstype.AAP,
            Inntektstype.FØDSEL_ADOPSJON,
            Inntektstype.PENSJON,
            Inntektstype.SYKEPENGER,
            Inntektstype.LØNNSINNTEKT,
            Inntektstype.OVERGANGSSTØNAD,
        ),
    ),

    AINNTEKT_BEREGNET_12MND(
        visningsnavn = "Lønn og trekk siste 12 mnd",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektstypeListe = listOf(
            Inntektstype.DAGPENGER,
            Inntektstype.AAP,
            Inntektstype.FØDSEL_ADOPSJON,
            Inntektstype.PENSJON,
            Inntektstype.SYKEPENGER,
            Inntektstype.LØNNSINNTEKT,
            Inntektstype.OVERGANGSSTØNAD,
        ),
    ),

    KAPITALINNTEKT(
        visningsnavn = "Sigrun kapitalinntekt (KAPS)",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektstypeListe = listOf(
            Inntektstype.KAPITALINNTEKT,
        ),
    ),

    LIGNINGSINNTEKT(
        visningsnavn = "Sigrun ligningsinntekt (LIGS)",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektstypeListe = listOf(
            Inntektstype.DAGPENGER,
            Inntektstype.AAP,
            Inntektstype.FØDSEL_ADOPSJON,
            Inntektstype.PENSJON,
            Inntektstype.SYKEPENGER,
            Inntektstype.LØNNSINNTEKT,
            Inntektstype.OVERGANGSSTØNAD,
        ),
    ),

    KONTANTSTØTTE(
        visningsnavn = "Kontantstøtte",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = true,
        inneholderInntektstypeListe = listOf(
            Inntektstype.KONTANTSTØTTE,
        ),
    ),

    SMÅBARNSTILLEGG(
        visningsnavn = "Småbarnstillegg",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = true,
        inneholderInntektstypeListe = listOf(
            Inntektstype.SMÅBARNSTILLEGG,
        ),
    ),

    UTVIDET_BARNETRYGD(
        visningsnavn = "Utvidet barnetrygd",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = true,
        inneholderInntektstypeListe = listOf(
            Inntektstype.UTVIDET_BARNETRYGD,
        ),
    ),

    // Manuelt registrerte rapporteringer

    PERSONINNTEKT_EGNE_OPPLYSNINGER(
        visningsnavn = "Personinntekt egne opplysninger",
        hentesAutomatisk = false,
        kanLeggesInnManuelt = true,
        inneholderInntektstypeListe = listOf(
            Inntektstype.AAP,
            Inntektstype.DAGPENGER,
            Inntektstype.FØDSEL_ADOPSJON,
            Inntektstype.PENSJON,
            Inntektstype.SYKEPENGER,
            Inntektstype.LØNNSINNTEKT,
            Inntektstype.OVERGANGSSTØNAD,
        ),
    ),

    KAPITALINNTEKT_EGNE_OPPLYSNINGER(
        visningsnavn = "Kapitalinntekt egne opplysninger",
        hentesAutomatisk = false,
        kanLeggesInnManuelt = true,
        inneholderInntektstypeListe = listOf(
            Inntektstype.KAPITALINNTEKT,
        ),
    ),

    SAKSBEHANDLER_BEREGNET_INNTEKT(
        visningsnavn = "Saksbehandlers beregnede inntekt",
        hentesAutomatisk = false,
        kanLeggesInnManuelt = true,
        inneholderInntektstypeListe = listOf(
            Inntektstype.AAP,
            Inntektstype.DAGPENGER,
            Inntektstype.FØDSEL_ADOPSJON,
            Inntektstype.PENSJON,
            Inntektstype.SYKEPENGER,
            Inntektstype.LØNNSINNTEKT,
            Inntektstype.OVERGANGSSTØNAD,
        ),
    ),

    LØNN_MANUELT_BEREGNET(
        visningsnavn = "Lønn manuelt beregnet",
        hentesAutomatisk = false,
        kanLeggesInnManuelt = true,
        inneholderInntektstypeListe = listOf(
            Inntektstype.LØNNSINNTEKT,
        ),
    ),

    NÆRINGSINNTEKT_MANUELT_BEREGNET(
        visningsnavn = "Næringsinntekt manuelt beregnet",
        hentesAutomatisk = false,
        kanLeggesInnManuelt = true,
        inneholderInntektstypeListe = listOf(
            Inntektstype.NÆRINGSINNTEKT,
        ),
    ),

    YTELSE_FRA_OFFENTLIG_MANUELT_BEREGNET(
        visningsnavn = "Ytelse fra det offentlige manuelt beregnet",
        hentesAutomatisk = false,
        kanLeggesInnManuelt = true,
        inneholderInntektstypeListe = listOf(
            Inntektstype.AAP,
            Inntektstype.DAGPENGER,
            Inntektstype.FØDSEL_ADOPSJON,
            Inntektstype.PENSJON,
            Inntektstype.SYKEPENGER,
            Inntektstype.OVERGANGSSTØNAD,
        ),
    ),

    // Rapporteringer brukt i Bisys/BBM

    AAP(
        visningsnavn = "AAP",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektstypeListe = emptyList(),
    ),

    AINNTEKT_KORRIGERT_BARNETILLEGG(
        visningsnavn = "A-inntekt korrigert for barnetillegg",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektstypeListe = emptyList(),
    ),

    BARNETRYGD_MANUELL_VURDERING(
        visningsnavn = "Barnetrygd manuell vurdering",
        hentesAutomatisk = false,
        kanLeggesInnManuelt = true,
        inneholderInntektstypeListe = emptyList(),
    ),

    BARNS_SYKDOM(
        visningsnavn = "Barns sykdom",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektstypeListe = emptyList(),
    ),

    DAGPENGER(
        visningsnavn = "Dagpenger",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektstypeListe = emptyList(),
    ),

    DOKUMENTASJON_MANGLER_SKJØNN(
        visningsnavn = "Dokumentasjon mangler (skjønn)",
        hentesAutomatisk = false,
        kanLeggesInnManuelt = true,
        inneholderInntektstypeListe = emptyList(),
    ),

    FORDEL_SKATTEKLASSE2(
        visningsnavn = "Fordel skatteklasse 2",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektstypeListe = emptyList(),
    ),

    FORDEL_SÆRFRADRAG_ENSLIG_FORSØRGER(
        visningsnavn = "Fordel særfradrag enslig forsørger",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = true,
        inneholderInntektstypeListe = emptyList(),
    ),

    FØDSEL_ADOPSJON(
        visningsnavn = "Fødsels- og adopsjonspenger",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektstypeListe = emptyList(),
    ),

    INNTEKTSOPPLYSNINGER_ARBEIDSGIVER(
        visningsnavn = "Inntektsopplysninger fra arbeidsgiver",
        hentesAutomatisk = false,
        kanLeggesInnManuelt = true,
        inneholderInntektstypeListe = emptyList(),
    ),

    KAPITALINNTEKT_SKE(
        visningsnavn = "Kapitalinntekt fra Skatteetaten",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektstypeListe = emptyList(),
    ),

    LIGNINGSOPPLYSNINGER_MANGLER(
        visningsnavn = "Ingen ligningsopplysninger finnes",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektstypeListe = emptyList(),
    ),

    LIGNING_SKE(
        visningsnavn = "Ligning fra Skatteetaten",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektstypeListe = emptyList(),
    ),

    LØNN_SKE(
        visningsnavn = "Lønnsoppgave fra Skatteetaten",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektstypeListe = emptyList(),
    ),

    LØNN_SKE_KORRIGERT_BARNETILLEGG(
        visningsnavn = "Lønnsoppgave fra Skatteetaten korrigert for barnetillegg",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektstypeListe = emptyList(),
    ),

    LØNN_TREKK(
        visningsnavn = "A-inntekt",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektstypeListe = emptyList(),
    ),

    MANGLENDE_BRUK_EVNE_SKJØNN(
        visningsnavn = "Manglende bruk av evne (skjønn)",
        hentesAutomatisk = false,
        kanLeggesInnManuelt = true,
        inneholderInntektstypeListe = emptyList(),
    ),

    NETTO_KAPITALINNTEKT(
        visningsnavn = "Netto kapitalinntekt",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektstypeListe = emptyList(),
    ),

    PENSJON(
        visningsnavn = "Pensjon",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektstypeListe = emptyList(),
    ),

    PENSJON_KORRIGERT_BARNETILLEGG(
        visningsnavn = "Pensjon korrigert for barnetillegg",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektstypeListe = emptyList(),
    ),

    REHABILITERINGSPENGER(
        visningsnavn = "Rehabiliteringspenger",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektstypeListe = emptyList(),
    ),

    SKATTEGRUNNLAG_KORRIGERT_BARNETILLEGG(
        visningsnavn = "Skattegrunnlag korrigert for barnetillegg",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektstypeListe = emptyList(),
    ),

    SKATTEGRUNNLAG_SKE(
        visningsnavn = "Skattegrunnlag fra Skatteetaten",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektstypeListe = emptyList(),
    ),

    SYKEPENGER(
        visningsnavn = "Sykepenger",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektstypeListe = emptyList(),
    ),
    ;

    companion object {

        /**
         * Extension function som returnerer true hvis de to inntektrapporteringene som sammenlignes ikke inneholder noen like inntektstyper.
         * @param inntektsrapportering2 Verdi av type InntektRapportering som det skal sammenlignes med
         * @return true hvis inntektsrapporteringene som sammenlignes kan brukes samtidig
         */
        fun Inntektsrapportering.kanBrukesSammenMed(inntektsrapportering2: Inntektsrapportering) =
            !(this.inneholderInntektstypeListe.any { inntektsrapportering2.inneholderInntektstypeListe.contains(it) })
    }
}
