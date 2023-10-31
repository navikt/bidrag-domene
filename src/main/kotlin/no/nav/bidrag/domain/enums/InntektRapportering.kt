package no.nav.bidrag.domain.enums

enum class InntektRapportering(
    val visningsnavn: String,
    val hentesAutomatisk: Boolean,
    val kanLeggesInnManuelt: Boolean,
    val inneholderInntektTypeListe: List<InntektType>,
) {

    // Rapporteringer fra bidrag-inntekt

    AINNTEKT(
        visningsnavn = "Lønn og trekk",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = listOf(
            InntektType.DAGPENGER,
            InntektType.AAP,
            InntektType.FØDSEL_ADOPSJON,
            InntektType.PENSJON,
            InntektType.SYKEPENGER,
            InntektType.LØNNSINNTEKT,
            InntektType.OVERGANGSSTØNAD,
        ),
    ),

    AINNTEKT_BEREGNET_3MND(
        visningsnavn = "Lønn og trekk siste 3 mnd",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = listOf(
            InntektType.DAGPENGER,
            InntektType.AAP,
            InntektType.FØDSEL_ADOPSJON,
            InntektType.PENSJON,
            InntektType.SYKEPENGER,
            InntektType.LØNNSINNTEKT,
            InntektType.OVERGANGSSTØNAD,
        ),
    ),

    AINNTEKT_BEREGNET_12MND(
        visningsnavn = "Lønn og trekk siste 12 mnd",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = listOf(
            InntektType.DAGPENGER,
            InntektType.AAP,
            InntektType.FØDSEL_ADOPSJON,
            InntektType.PENSJON,
            InntektType.SYKEPENGER,
            InntektType.LØNNSINNTEKT,
            InntektType.OVERGANGSSTØNAD,
        ),
    ),

    KAPITALINNTEKT(
        visningsnavn = "Sigrun kapitalinntekt (KAPS)",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = listOf(
            InntektType.KAPITALINNTEKT,
        ),
    ),

    LIGNINGSINNTEKT(
        visningsnavn = "Sigrun ligningsinntekt (LIGS)",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = listOf(
            InntektType.DAGPENGER,
            InntektType.AAP,
            InntektType.FØDSEL_ADOPSJON,
            InntektType.PENSJON,
            InntektType.SYKEPENGER,
            InntektType.LØNNSINNTEKT,
            InntektType.OVERGANGSSTØNAD,
        ),
    ),

    KONTANTSTØTTE(
        visningsnavn = "Kontantstøtte",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = true,
        inneholderInntektTypeListe = listOf(
            InntektType.KONTANTSTØTTE,
        ),
    ),

    SMÅBARNSTILLEGG(
        visningsnavn = "Småbarnstillegg",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = true,
        inneholderInntektTypeListe = listOf(
            InntektType.SMÅBARNSTILLEGG,
        ),
    ),

    UTVIDET_BARNETRYGD(
        visningsnavn = "Utvidet barnetrygd",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = true,
        inneholderInntektTypeListe = listOf(
            InntektType.UTVIDET_BARNETRYGD,
        ),
    ),

    // Manuelt registrerte rapporteringer

    PERSONINNTEKT_EGNE_OPPLYSNINGER(
        visningsnavn = "Personinntekt egne opplysninger",
        hentesAutomatisk = false,
        kanLeggesInnManuelt = true,
        inneholderInntektTypeListe = listOf(
            InntektType.AAP,
            InntektType.DAGPENGER,
            InntektType.FØDSEL_ADOPSJON,
            InntektType.PENSJON,
            InntektType.SYKEPENGER,
            InntektType.LØNNSINNTEKT,
            InntektType.OVERGANGSSTØNAD,
        ),
    ),

    KAPITALINNTEKT_EGNE_OPPLYSNINGER(
        visningsnavn = "Kapitalinntekt egne opplysninger",
        hentesAutomatisk = false,
        kanLeggesInnManuelt = true,
        inneholderInntektTypeListe = listOf(
            InntektType.KAPITALINNTEKT,
        ),
    ),

    SAKSBEHANDLER_BEREGNET_INNTEKT(
        visningsnavn = "Saksbehandlers beregnede inntekt",
        hentesAutomatisk = false,
        kanLeggesInnManuelt = true,
        inneholderInntektTypeListe = listOf(
            InntektType.AAP,
            InntektType.DAGPENGER,
            InntektType.FØDSEL_ADOPSJON,
            InntektType.PENSJON,
            InntektType.SYKEPENGER,
            InntektType.LØNNSINNTEKT,
            InntektType.OVERGANGSSTØNAD,
        ),
    ),

    LØNN_MANUELT_BEREGNET(
        visningsnavn = "Lønn manuelt beregnet",
        hentesAutomatisk = false,
        kanLeggesInnManuelt = true,
        inneholderInntektTypeListe = listOf(
            InntektType.LØNNSINNTEKT,
        ),
    ),

    NÆRINGSINNTEKT_MANUELT_BEREGNET(
        visningsnavn = "Næringsinntekt manuelt beregnet",
        hentesAutomatisk = false,
        kanLeggesInnManuelt = true,
        inneholderInntektTypeListe = listOf(
            InntektType.NÆRINGSINNTEKT,
        ),
    ),

    YTELSE_FRA_OFFENTLIG_MANUELT_BEREGNET(
        visningsnavn = "Ytelse fra det offentlige manuelt beregnet",
        hentesAutomatisk = false,
        kanLeggesInnManuelt = true,
        inneholderInntektTypeListe = listOf(
            InntektType.AAP,
            InntektType.DAGPENGER,
            InntektType.FØDSEL_ADOPSJON,
            InntektType.PENSJON,
            InntektType.SYKEPENGER,
            InntektType.OVERGANGSSTØNAD,
        ),
    ),

    // Rapporteringer brukt i Bisys/BBM

    AAP(
        visningsnavn = "AAP",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = emptyList(),
    ),

    AINNTEKT_KORRIGERT_BARNETILLEGG(
        visningsnavn = "A-inntekt korrigert for barnetillegg",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = emptyList(),
    ),

    BARNETRYGD_MANUELL_VURDERING(
        visningsnavn = "Barnetrygd manuell vurdering",
        hentesAutomatisk = false,
        kanLeggesInnManuelt = true,
        inneholderInntektTypeListe = emptyList(),
    ),

    BARNS_SYKDOM(
        visningsnavn = "Barns sykdom",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = emptyList(),
    ),

    DAGPENGER(
        visningsnavn = "Dagpenger",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = emptyList(),
    ),

    DOKUMENTASJON_MANGLER_SKJØNN(
        visningsnavn = "Dokumentasjon mangler (skjønn)",
        hentesAutomatisk = false,
        kanLeggesInnManuelt = true,
        inneholderInntektTypeListe = emptyList(),
    ),

    FORDEL_SKATTEKLASSE2(
        visningsnavn = "Fordel skatteklasse 2",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = emptyList(),
    ),

    FORDEL_SÆRFRADRAG_ENSLIG_FORSØRGER(
        visningsnavn = "Fordel særfradrag enslig forsørger",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = true,
        inneholderInntektTypeListe = emptyList(),
    ),

    FØDSEL_ADOPSJON(
        visningsnavn = "Fødsels- og adopsjonspenger",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = emptyList(),
    ),

    INNTEKTSOPPLYSNINGER_ARBEIDSGIVER(
        visningsnavn = "Inntektsopplysninger fra arbeidsgiver",
        hentesAutomatisk = false,
        kanLeggesInnManuelt = true,
        inneholderInntektTypeListe = emptyList(),
    ),

    KAPITALINNTEKT_SKE(
        visningsnavn = "Kapitalinntekt fra Skatteetaten",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = emptyList(),
    ),

    LIGNINGSOPPLYSNINGER_MANGLER(
        visningsnavn = "Ingen ligningsopplysninger finnes",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = emptyList(),
    ),

    LIGNING_SKE(
        visningsnavn = "Ligning fra Skatteetaten",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = emptyList(),
    ),

    LØNN_SKE(
        visningsnavn = "Lønnsoppgave fra Skatteetaten",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = emptyList(),
    ),

    LØNN_SKE_KORRIGERT_BARNETILLEGG(
        visningsnavn = "Lønnsoppgave fra Skatteetaten korrigert for barnetillegg",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = emptyList(),
    ),

    LØNN_TREKK(
        visningsnavn = "A-inntekt",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = emptyList(),
    ),

    MANGLENDE_BRUK_EVNE_SKJØNN(
        visningsnavn = "Manglende bruk av evne (skjønn)",
        hentesAutomatisk = false,
        kanLeggesInnManuelt = true,
        inneholderInntektTypeListe = emptyList(),
    ),

    NETTO_KAPITALINNTEKT(
        visningsnavn = "Netto kapitalinntekt",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = emptyList(),
    ),

    PENSJON(
        visningsnavn = "Pensjon",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = emptyList(),
    ),

    PENSJON_KORRIGERT_BARNETILLEGG(
        visningsnavn = "Pensjon korrigert for barnetillegg",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = emptyList(),
    ),

    REHABILITERINGSPENGER(
        visningsnavn = "Rehabiliteringspenger",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = emptyList(),
    ),

    SKATTEGRUNNLAG_KORRIGERT_BARNETILLEGG(
        visningsnavn = "Skattegrunnlag korrigert for barnetillegg",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = emptyList(),
    ),

    SKATTEGRUNNLAG_SKE(
        visningsnavn = "Skattegrunnlag fra Skatteetaten",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = emptyList(),
    ),

    SYKEPENGER(
        visningsnavn = "Sykepenger",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = emptyList(),
    ),
    ;

    companion object {

        /**
         * Extension function som returnerer true hvis de to inntektrapporteringene som sammenlignes ikke inneholder noen like inntektstyper.
         * @param inntektRapportering2 Verdi av type InntektRapportering som det skal sammenlignes med
         * @return true hvis inntektsrapporteringene som sammenlignes kan brukes samtidig
         */
        fun InntektRapportering.kanBrukesSammenMed(inntektRapportering2: InntektRapportering) =
            !(this.inneholderInntektTypeListe.any { inntektRapportering2.inneholderInntektTypeListe.contains(it) })
    }
}
