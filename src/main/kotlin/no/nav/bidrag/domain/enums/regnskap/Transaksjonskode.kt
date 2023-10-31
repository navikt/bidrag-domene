package no.nav.bidrag.domain.enums.regnskap

import no.nav.bidrag.domain.enums.EngangsbeløpType
import no.nav.bidrag.domain.enums.StønadType

enum class Transaksjonskode(val korreksjonskode: String?, val negativtBeløp: Boolean) {
    A1("A3", false), // Bidragsforskudd
    A3(null, true),
    B1("B3", false), // Underholdsbidrag (m/u tilleggsbidrag)
    B3(null, true),
    D1("D3", false), // 18årsbidrag
    D3(null, true),
    E1("E3", false), // Bidrag til særlige utgifter (særtilskudd)
    E3(null, true),
    F1("F3", false), // Ektefellebidrag
    F3(null, true),
    G1("G3", false), // Gebyr
    G3(null, true),
    H1("H3", false), // Tilbakekreving
    H3(null, true),
    I1(null, true), // Motregning
    K1(null, true), // Ettergivelse
    K2(null, true), // Direkte oppgjør (innbetalt beløp)
    K3(null, true), // Tilbakekreving ettergivelse
    ;

    companion object {
        fun hentTransaksjonskodeForType(type: String): Transaksjonskode {
            return when (type) {
                StønadType.FORSKUDD.name -> A1
                StønadType.BIDRAG.name -> B1
                StønadType.OPPFOSTRINGSBIDRAG.name -> B1
                StønadType.BIDRAG18AAR.name -> D1
                StønadType.EKTEFELLEBIDRAG.name -> F1
                StønadType.MOTREGNING.name -> I1
                EngangsbeløpType.SAERTILSKUDD.name -> E1
                EngangsbeløpType.GEBYR_MOTTAKER.name -> G1
                EngangsbeløpType.GEBYR_SKYLDNER.name -> G1
                EngangsbeløpType.TILBAKEKREVING.name -> H1
                EngangsbeløpType.ETTERGIVELSE.name -> K1
                EngangsbeløpType.DIREKTE_OPPGJOR.name -> K2
                EngangsbeløpType.ETTERGIVELSE_TILBAKEKREVING.name -> K3
                else -> throw IllegalStateException("Ugyldig type for transaksjonskode funnet!")
            }
        }
    }
}
