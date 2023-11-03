package no.nav.bidrag.domene.enums

/**
 * Typer grunnlag som benyttes i behandling
 */
enum class Grunnlagstype(val value: String) {
    SAERFRADRAG(GrunnlagstypeConstants.SAERFRADRAG),
    SOKNADSBARN_INFO(GrunnlagstypeConstants.SOKNADSBARN_INFO),
    SKATTEKLASSE(GrunnlagstypeConstants.SKATTEKLASSE),
    BARN_I_HUSSTAND(GrunnlagstypeConstants.BARN_I_HUSSTAND),
    BOSTATUS(GrunnlagstypeConstants.BOSTATUS),
    BOSTATUS_BP(GrunnlagstypeConstants.BOSTATUS_BP),
    INNTEKT(GrunnlagstypeConstants.INNTEKT),
    INNTEKT_BARN(GrunnlagstypeConstants.INNTEKT_BARN),
    INNTEKT_UTVIDET_BARNETRYGD(GrunnlagstypeConstants.INNTEKT_UTVIDET_BARNETRYGD),
    KAPITALINNTEKT(GrunnlagstypeConstants.KAPITALINNTEKT),
    KAPITALINNTEKT_BARN(GrunnlagstypeConstants.KAPITALINNTEKT_BARN),
    NETTO_SAERTILSKUDD(GrunnlagstypeConstants.NETTO_SAERTILSKUDD),
    SAMVAERSKLASSE(GrunnlagstypeConstants.SAMVAERSKLASSE),
    BIDRAGSEVNE(GrunnlagstypeConstants.BIDRAGSEVNE),
    SAMVAERSFRADRAG(GrunnlagstypeConstants.SAMVAERSFRADRAG),
    SJABLON(GrunnlagstypeConstants.SJABLON),
    LOPENDE_BIDRAG(GrunnlagstypeConstants.LOPENDE_BIDRAG),
    FAKTISK_UTGIFT(GrunnlagstypeConstants.FAKTISK_UTGIFT),
    BARNETILSYN_MED_STONAD(GrunnlagstypeConstants.BARNETILSYN_MED_STONAD),
    FORPLEINING_UTGIFT(GrunnlagstypeConstants.FORPLEINING_UTGIFT),
    BARN(GrunnlagstypeConstants.BARN),
    SIVILSTAND(GrunnlagstypeConstants.SIVILSTAND),
    BARNETILLEGG(GrunnlagstypeConstants.BARNETILLEGG),
    BARNETILLEGG_FORSVARET(GrunnlagstypeConstants.BARNETILLEGG_FORSVARET),
    DELT_BOSTED(GrunnlagstypeConstants.DELT_BOSTED),
    NETTO_BARNETILSYN(GrunnlagstypeConstants.NETTO_BARNETILSYN),
    UNDERHOLDSKOSTNAD(GrunnlagstypeConstants.UNDERHOLDSKOSTNAD),
    BPS_ANDEL_UNDERHOLDSKOSTNAD(GrunnlagstypeConstants.BPS_ANDEL_UNDERHOLDSKOSTNAD),
    TILLEGGSBIDRAG(GrunnlagstypeConstants.TILLEGGSBIDRAG),
    MAKS_BIDRAG_PER_BARN(GrunnlagstypeConstants.MAKS_BIDRAG_PER_BARN),
    BPS_ANDEL_SAERTILSKUDD(GrunnlagstypeConstants.BPS_ANDEL_SAERTILSKUDD),
    MAKS_GRENSE_25_INNTEKT(GrunnlagstypeConstants.MAKS_GRENSE_25_INNTEKT),
    GEBYRFRITAK(GrunnlagstypeConstants.GEBYRFRITAK),
    SOKNAD_INFO(GrunnlagstypeConstants.SOKNAD_INFO),
    BARN_INFO(GrunnlagstypeConstants.BARN_INFO),
    PERSON_INFO(GrunnlagstypeConstants.PERSON_INFO),
    SAKSBEHANDLER_INFO(GrunnlagstypeConstants.SAKSBEHANDLER_INFO),
    VEDTAK_INFO(GrunnlagstypeConstants.VEDTAK_INFO),
    INNBETALT_BELOP(GrunnlagstypeConstants.INNBETALT_BELOP),
    FORHOLDSMESSIG_FORDELING(GrunnlagstypeConstants.FORHOLDSMESSIG_FORDELING),
    SLUTTBEREGNING_BBM(GrunnlagstypeConstants.SLUTTBEREGNING_BBM),
    KLAGE_STATISTIKK(GrunnlagstypeConstants.KLAGE_STATISTIKK),
    PERSON(GrunnlagstypeConstants.PERSON),
    BOSTATUS_PERIODE(GrunnlagstypeConstants.BOSTATUS_PERIODE),
    BEREGNING_INNTEKT_RAPPORTERING_PERIODE(GrunnlagstypeConstants.BEREGNING_INNTEKT_RAPPORTERING_PERIODE),
    SIVILSTAND_PERIODE(GrunnlagstypeConstants.SIVILSTAND_PERIODE),
    VIRKNINGSDATO(GrunnlagstypeConstants.VIRKNINGSDATO),
    NOTAT(GrunnlagstypeConstants.NOTAT),
    ;

    object GrunnlagstypeConstants {
        const val SAERFRADRAG = "SAERFRADRAG"
        const val SOKNADSBARN_INFO = "SOKNADSBARN_INFO"
        const val SKATTEKLASSE = "SKATTEKLASSE"
        const val BARN_I_HUSSTAND = "BARN_I_HUSSTAND"
        const val BOSTATUS = "BOSTATUS"
        const val BOSTATUS_BP = "BOSTATUS_BP"
        const val INNTEKT = "INNTEKT"
        const val INNTEKT_BARN = "INNTEKT_BARN"
        const val INNTEKT_UTVIDET_BARNETRYGD = "INNTEKT_UTVIDET_BARNETRYGD"
        const val KAPITALINNTEKT = "KAPITALINNTEKT"
        const val KAPITALINNTEKT_BARN = "KAPITALINNTEKT_BARN"
        const val NETTO_SAERTILSKUDD = "NETTO_SAERTILSKUDD"
        const val SAMVAERSKLASSE = "SAMVAERSKLASSE"
        const val BIDRAGSEVNE = "BIDRAGSEVNE"
        const val SAMVAERSFRADRAG = "SAMVAERSFRADRAG"
        const val SJABLON = "SJABLON"
        const val LOPENDE_BIDRAG = "LOPENDE_BIDRAG"
        const val FAKTISK_UTGIFT = "FAKTISK_UTGIFT"
        const val BARNETILSYN_MED_STONAD = "BARNETILSYN_MED_STONAD"
        const val FORPLEINING_UTGIFT = "FORPLEINING_UTGIFT"
        const val BARN = "BARN"
        const val SIVILSTAND = "SIVILSTAND"
        const val BARNETILLEGG = "BARNETILLEGG"
        const val BARNETILLEGG_FORSVARET = "BARNETILLEGG_FORSVARET"
        const val DELT_BOSTED = "DELT_BOSTED"
        const val NETTO_BARNETILSYN = "NETTO_BARNETILSYN"
        const val UNDERHOLDSKOSTNAD = "UNDERHOLDSKOSTNAD"
        const val BPS_ANDEL_UNDERHOLDSKOSTNAD = "BPS_ANDEL_UNDERHOLDSKOSTNAD"
        const val TILLEGGSBIDRAG = "TILLEGGSBIDRAG"
        const val MAKS_BIDRAG_PER_BARN = "MAKS_BIDRAG_PER_BARN"
        const val BPS_ANDEL_SAERTILSKUDD = "BPS_ANDEL_SAERTILSKUDD"
        const val MAKS_GRENSE_25_INNTEKT = "MAKS_GRENSE_25_INNTEKT"
        const val GEBYRFRITAK = "GEBYRFRITAK"
        const val SOKNAD_INFO = "SOKNAD_INFO"
        const val BARN_INFO = "BARN_INFO"
        const val PERSON_INFO = "PERSON_INFO"
        const val SAKSBEHANDLER_INFO = "SAKSBEHANDLER_INFO"
        const val VEDTAK_INFO = "VEDTAK_INFO"
        const val INNBETALT_BELOP = "INNBETALT_BELOP"
        const val FORHOLDSMESSIG_FORDELING = "FORHOLDSMESSIG_FORDELING"
        const val SLUTTBEREGNING_BBM = "SLUTTBEREGNING_BBM"
        const val KLAGE_STATISTIKK = "KLAGE_STATISTIKK"
        const val PERSON = "PERSON"
        const val BOSTATUS_PERIODE = "BOSTATUS_PERIODE"
        const val BEREGNING_INNTEKT_RAPPORTERING_PERIODE = "BEREGNING_INNTEKT_RAPPORTERING_PERIODE"
        const val SIVILSTAND_PERIODE = "SIVILSTAND_PERIODE"
        const val VIRKNINGSDATO = "VIRKNINGSDATO"
        const val NOTAT = "NOTAT"
    }
}
