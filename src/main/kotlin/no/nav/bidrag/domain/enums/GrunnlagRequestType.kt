package no.nav.bidrag.domain.enums

/**
 * Typer grunnlag som kan innhentes av tjenesten bidrag-grunnlag.
 * Brukes for å spesifisere hvilke grunnlag man ønsker at skal innhentes for en grunnlagspakke.
 * Må ikke forveksles med GrunnlagType.
 */
enum class GrunnlagRequestType {
    AINNTEKT,
    SKATTEGRUNNLAG,
    UTVIDET_BARNETRYGD_OG_SMAABARNSTILLEGG,
    BARNETILLEGG,
    HUSSTANDSMEDLEMMER_OG_EGNE_BARN,
    SIVILSTAND,
    KONTANTSTOTTE,
    BARNETILSYN,
    ARBEIDSFORHOLD,
}
