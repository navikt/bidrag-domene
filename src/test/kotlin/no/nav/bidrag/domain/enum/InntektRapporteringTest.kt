package no.nav.bidrag.domain.enum

import io.kotest.matchers.shouldBe
import no.nav.bidrag.domain.enums.InntektRapportering
import no.nav.bidrag.domain.enums.InntektRapportering.Companion.kanBrukesSammenMed
import org.junit.jupiter.api.Test

class InntektRapporteringTest {

    @Test
    fun `skal sjekke om to inntektsrapporteringer kan opptre samtidig`() {
        InntektRapportering.AINNTEKT.kanBrukesSammenMed(InntektRapportering.AINNTEKT_BEREGNET_3MND) shouldBe false
        InntektRapportering.AINNTEKT.kanBrukesSammenMed(InntektRapportering.AINNTEKT_BEREGNET_12MND) shouldBe false
        InntektRapportering.AINNTEKT.kanBrukesSammenMed(InntektRapportering.KAPITALINNTEKT) shouldBe true
        InntektRapportering.AINNTEKT.kanBrukesSammenMed(InntektRapportering.LIGNINGSINNTEKT) shouldBe false
        InntektRapportering.AINNTEKT.kanBrukesSammenMed(InntektRapportering.KONTANTSTØTTE) shouldBe true
        InntektRapportering.AINNTEKT.kanBrukesSammenMed(InntektRapportering.SMÅBARNSTILLEGG) shouldBe true
        InntektRapportering.AINNTEKT.kanBrukesSammenMed(InntektRapportering.UTVIDET_BARNETRYGD) shouldBe true
        InntektRapportering.AINNTEKT.kanBrukesSammenMed(InntektRapportering.LØNN_MANUELT_BEREGNET) shouldBe false
        InntektRapportering.AINNTEKT.kanBrukesSammenMed(InntektRapportering.KAPITALINNTEKT_EGNE_OPPLYSNINGER) shouldBe true
        InntektRapportering.AINNTEKT.kanBrukesSammenMed(InntektRapportering.NÆRINGSINNTEKT_MANUELT_BEREGNET) shouldBe true
        InntektRapportering.AINNTEKT.kanBrukesSammenMed(InntektRapportering.PERSONINNTEKT_EGNE_OPPLYSNINGER) shouldBe false
        InntektRapportering.AINNTEKT.kanBrukesSammenMed(InntektRapportering.SAKSBEHANDLER_BEREGNET_INNTEKT) shouldBe false
        InntektRapportering.AINNTEKT.kanBrukesSammenMed(InntektRapportering.YTELSE_FRA_OFFENTLIG_MANUELT_BEREGNET) shouldBe false

        InntektRapportering.AINNTEKT_BEREGNET_3MND.kanBrukesSammenMed(InntektRapportering.AINNTEKT_BEREGNET_12MND) shouldBe false
        InntektRapportering.AINNTEKT_BEREGNET_3MND.kanBrukesSammenMed(InntektRapportering.KAPITALINNTEKT) shouldBe true
        InntektRapportering.AINNTEKT_BEREGNET_3MND.kanBrukesSammenMed(InntektRapportering.LIGNINGSINNTEKT) shouldBe false
        InntektRapportering.AINNTEKT_BEREGNET_3MND.kanBrukesSammenMed(InntektRapportering.KONTANTSTØTTE) shouldBe true
        InntektRapportering.AINNTEKT_BEREGNET_3MND.kanBrukesSammenMed(InntektRapportering.SMÅBARNSTILLEGG) shouldBe true
        InntektRapportering.AINNTEKT_BEREGNET_3MND.kanBrukesSammenMed(InntektRapportering.UTVIDET_BARNETRYGD) shouldBe true
        InntektRapportering.AINNTEKT_BEREGNET_3MND.kanBrukesSammenMed(InntektRapportering.LØNN_MANUELT_BEREGNET) shouldBe false
        InntektRapportering.AINNTEKT_BEREGNET_3MND.kanBrukesSammenMed(InntektRapportering.KAPITALINNTEKT_EGNE_OPPLYSNINGER) shouldBe true
        InntektRapportering.AINNTEKT_BEREGNET_3MND.kanBrukesSammenMed(InntektRapportering.NÆRINGSINNTEKT_MANUELT_BEREGNET) shouldBe true
        InntektRapportering.AINNTEKT_BEREGNET_3MND.kanBrukesSammenMed(InntektRapportering.PERSONINNTEKT_EGNE_OPPLYSNINGER) shouldBe false
        InntektRapportering.AINNTEKT_BEREGNET_3MND.kanBrukesSammenMed(InntektRapportering.SAKSBEHANDLER_BEREGNET_INNTEKT) shouldBe false
        InntektRapportering.AINNTEKT_BEREGNET_3MND.kanBrukesSammenMed(InntektRapportering.YTELSE_FRA_OFFENTLIG_MANUELT_BEREGNET) shouldBe false

        InntektRapportering.AINNTEKT_BEREGNET_12MND.kanBrukesSammenMed(InntektRapportering.KAPITALINNTEKT) shouldBe true
        InntektRapportering.AINNTEKT_BEREGNET_12MND.kanBrukesSammenMed(InntektRapportering.LIGNINGSINNTEKT) shouldBe false
        InntektRapportering.AINNTEKT_BEREGNET_12MND.kanBrukesSammenMed(InntektRapportering.KONTANTSTØTTE) shouldBe true
        InntektRapportering.AINNTEKT_BEREGNET_12MND.kanBrukesSammenMed(InntektRapportering.SMÅBARNSTILLEGG) shouldBe true
        InntektRapportering.AINNTEKT_BEREGNET_12MND.kanBrukesSammenMed(InntektRapportering.UTVIDET_BARNETRYGD) shouldBe true
        InntektRapportering.AINNTEKT_BEREGNET_12MND.kanBrukesSammenMed(InntektRapportering.LØNN_MANUELT_BEREGNET) shouldBe false
        InntektRapportering.AINNTEKT_BEREGNET_12MND.kanBrukesSammenMed(InntektRapportering.KAPITALINNTEKT_EGNE_OPPLYSNINGER) shouldBe true
        InntektRapportering.AINNTEKT_BEREGNET_12MND.kanBrukesSammenMed(InntektRapportering.NÆRINGSINNTEKT_MANUELT_BEREGNET) shouldBe true
        InntektRapportering.AINNTEKT_BEREGNET_12MND.kanBrukesSammenMed(InntektRapportering.PERSONINNTEKT_EGNE_OPPLYSNINGER) shouldBe false
        InntektRapportering.AINNTEKT_BEREGNET_12MND.kanBrukesSammenMed(InntektRapportering.SAKSBEHANDLER_BEREGNET_INNTEKT) shouldBe false
        InntektRapportering.AINNTEKT_BEREGNET_12MND.kanBrukesSammenMed(InntektRapportering.YTELSE_FRA_OFFENTLIG_MANUELT_BEREGNET) shouldBe false

        InntektRapportering.KAPITALINNTEKT.kanBrukesSammenMed(InntektRapportering.LIGNINGSINNTEKT) shouldBe true
        InntektRapportering.KAPITALINNTEKT.kanBrukesSammenMed(InntektRapportering.KONTANTSTØTTE) shouldBe true
        InntektRapportering.KAPITALINNTEKT.kanBrukesSammenMed(InntektRapportering.SMÅBARNSTILLEGG) shouldBe true
        InntektRapportering.KAPITALINNTEKT.kanBrukesSammenMed(InntektRapportering.UTVIDET_BARNETRYGD) shouldBe true
        InntektRapportering.KAPITALINNTEKT.kanBrukesSammenMed(InntektRapportering.LØNN_MANUELT_BEREGNET) shouldBe true
        InntektRapportering.KAPITALINNTEKT.kanBrukesSammenMed(InntektRapportering.KAPITALINNTEKT_EGNE_OPPLYSNINGER) shouldBe false
        InntektRapportering.KAPITALINNTEKT.kanBrukesSammenMed(InntektRapportering.NÆRINGSINNTEKT_MANUELT_BEREGNET) shouldBe true
        InntektRapportering.KAPITALINNTEKT.kanBrukesSammenMed(InntektRapportering.PERSONINNTEKT_EGNE_OPPLYSNINGER) shouldBe true
        InntektRapportering.KAPITALINNTEKT.kanBrukesSammenMed(InntektRapportering.SAKSBEHANDLER_BEREGNET_INNTEKT) shouldBe true
        InntektRapportering.KAPITALINNTEKT.kanBrukesSammenMed(InntektRapportering.YTELSE_FRA_OFFENTLIG_MANUELT_BEREGNET) shouldBe true

        InntektRapportering.LIGNINGSINNTEKT.kanBrukesSammenMed(InntektRapportering.KONTANTSTØTTE) shouldBe true
        InntektRapportering.LIGNINGSINNTEKT.kanBrukesSammenMed(InntektRapportering.SMÅBARNSTILLEGG) shouldBe true
        InntektRapportering.LIGNINGSINNTEKT.kanBrukesSammenMed(InntektRapportering.UTVIDET_BARNETRYGD) shouldBe true
        InntektRapportering.LIGNINGSINNTEKT.kanBrukesSammenMed(InntektRapportering.LØNN_MANUELT_BEREGNET) shouldBe false
        InntektRapportering.LIGNINGSINNTEKT.kanBrukesSammenMed(InntektRapportering.KAPITALINNTEKT_EGNE_OPPLYSNINGER) shouldBe true
        InntektRapportering.LIGNINGSINNTEKT.kanBrukesSammenMed(InntektRapportering.NÆRINGSINNTEKT_MANUELT_BEREGNET) shouldBe true
        InntektRapportering.LIGNINGSINNTEKT.kanBrukesSammenMed(InntektRapportering.PERSONINNTEKT_EGNE_OPPLYSNINGER) shouldBe false
        InntektRapportering.LIGNINGSINNTEKT.kanBrukesSammenMed(InntektRapportering.SAKSBEHANDLER_BEREGNET_INNTEKT) shouldBe false
        InntektRapportering.LIGNINGSINNTEKT.kanBrukesSammenMed(InntektRapportering.YTELSE_FRA_OFFENTLIG_MANUELT_BEREGNET) shouldBe false

        InntektRapportering.KONTANTSTØTTE.kanBrukesSammenMed(InntektRapportering.SMÅBARNSTILLEGG) shouldBe true
        InntektRapportering.KONTANTSTØTTE.kanBrukesSammenMed(InntektRapportering.UTVIDET_BARNETRYGD) shouldBe true
        InntektRapportering.KONTANTSTØTTE.kanBrukesSammenMed(InntektRapportering.LØNN_MANUELT_BEREGNET) shouldBe true
        InntektRapportering.KONTANTSTØTTE.kanBrukesSammenMed(InntektRapportering.KAPITALINNTEKT_EGNE_OPPLYSNINGER) shouldBe true
        InntektRapportering.KONTANTSTØTTE.kanBrukesSammenMed(InntektRapportering.NÆRINGSINNTEKT_MANUELT_BEREGNET) shouldBe true
        InntektRapportering.KONTANTSTØTTE.kanBrukesSammenMed(InntektRapportering.PERSONINNTEKT_EGNE_OPPLYSNINGER) shouldBe true
        InntektRapportering.KONTANTSTØTTE.kanBrukesSammenMed(InntektRapportering.SAKSBEHANDLER_BEREGNET_INNTEKT) shouldBe true
        InntektRapportering.KONTANTSTØTTE.kanBrukesSammenMed(InntektRapportering.YTELSE_FRA_OFFENTLIG_MANUELT_BEREGNET) shouldBe true

        InntektRapportering.SMÅBARNSTILLEGG.kanBrukesSammenMed(InntektRapportering.UTVIDET_BARNETRYGD) shouldBe true
        InntektRapportering.SMÅBARNSTILLEGG.kanBrukesSammenMed(InntektRapportering.LØNN_MANUELT_BEREGNET) shouldBe true
        InntektRapportering.SMÅBARNSTILLEGG.kanBrukesSammenMed(InntektRapportering.KAPITALINNTEKT_EGNE_OPPLYSNINGER) shouldBe true
        InntektRapportering.SMÅBARNSTILLEGG.kanBrukesSammenMed(InntektRapportering.NÆRINGSINNTEKT_MANUELT_BEREGNET) shouldBe true
        InntektRapportering.SMÅBARNSTILLEGG.kanBrukesSammenMed(InntektRapportering.PERSONINNTEKT_EGNE_OPPLYSNINGER) shouldBe true
        InntektRapportering.SMÅBARNSTILLEGG.kanBrukesSammenMed(InntektRapportering.SAKSBEHANDLER_BEREGNET_INNTEKT) shouldBe true
        InntektRapportering.SMÅBARNSTILLEGG.kanBrukesSammenMed(InntektRapportering.YTELSE_FRA_OFFENTLIG_MANUELT_BEREGNET) shouldBe true

        InntektRapportering.UTVIDET_BARNETRYGD.kanBrukesSammenMed(InntektRapportering.LØNN_MANUELT_BEREGNET) shouldBe true
        InntektRapportering.UTVIDET_BARNETRYGD.kanBrukesSammenMed(InntektRapportering.KAPITALINNTEKT_EGNE_OPPLYSNINGER) shouldBe true
        InntektRapportering.UTVIDET_BARNETRYGD.kanBrukesSammenMed(InntektRapportering.NÆRINGSINNTEKT_MANUELT_BEREGNET) shouldBe true
        InntektRapportering.UTVIDET_BARNETRYGD.kanBrukesSammenMed(InntektRapportering.PERSONINNTEKT_EGNE_OPPLYSNINGER) shouldBe true
        InntektRapportering.UTVIDET_BARNETRYGD.kanBrukesSammenMed(InntektRapportering.SAKSBEHANDLER_BEREGNET_INNTEKT) shouldBe true
        InntektRapportering.UTVIDET_BARNETRYGD.kanBrukesSammenMed(InntektRapportering.YTELSE_FRA_OFFENTLIG_MANUELT_BEREGNET) shouldBe true

        InntektRapportering.LØNN_MANUELT_BEREGNET.kanBrukesSammenMed(InntektRapportering.KAPITALINNTEKT_EGNE_OPPLYSNINGER) shouldBe true
        InntektRapportering.LØNN_MANUELT_BEREGNET.kanBrukesSammenMed(InntektRapportering.NÆRINGSINNTEKT_MANUELT_BEREGNET) shouldBe true
        InntektRapportering.LØNN_MANUELT_BEREGNET.kanBrukesSammenMed(InntektRapportering.PERSONINNTEKT_EGNE_OPPLYSNINGER) shouldBe false
        InntektRapportering.LØNN_MANUELT_BEREGNET.kanBrukesSammenMed(InntektRapportering.SAKSBEHANDLER_BEREGNET_INNTEKT) shouldBe false
        InntektRapportering.LØNN_MANUELT_BEREGNET.kanBrukesSammenMed(InntektRapportering.YTELSE_FRA_OFFENTLIG_MANUELT_BEREGNET) shouldBe true

        InntektRapportering.KAPITALINNTEKT_EGNE_OPPLYSNINGER.kanBrukesSammenMed(InntektRapportering.NÆRINGSINNTEKT_MANUELT_BEREGNET) shouldBe true
        InntektRapportering.KAPITALINNTEKT_EGNE_OPPLYSNINGER.kanBrukesSammenMed(InntektRapportering.PERSONINNTEKT_EGNE_OPPLYSNINGER) shouldBe true
        InntektRapportering.KAPITALINNTEKT_EGNE_OPPLYSNINGER.kanBrukesSammenMed(InntektRapportering.SAKSBEHANDLER_BEREGNET_INNTEKT) shouldBe true
        InntektRapportering.KAPITALINNTEKT_EGNE_OPPLYSNINGER.kanBrukesSammenMed(InntektRapportering.YTELSE_FRA_OFFENTLIG_MANUELT_BEREGNET) shouldBe true

        InntektRapportering.NÆRINGSINNTEKT_MANUELT_BEREGNET.kanBrukesSammenMed(InntektRapportering.PERSONINNTEKT_EGNE_OPPLYSNINGER) shouldBe true
        InntektRapportering.NÆRINGSINNTEKT_MANUELT_BEREGNET.kanBrukesSammenMed(InntektRapportering.SAKSBEHANDLER_BEREGNET_INNTEKT) shouldBe true
        InntektRapportering.NÆRINGSINNTEKT_MANUELT_BEREGNET.kanBrukesSammenMed(InntektRapportering.YTELSE_FRA_OFFENTLIG_MANUELT_BEREGNET) shouldBe true

        InntektRapportering.PERSONINNTEKT_EGNE_OPPLYSNINGER.kanBrukesSammenMed(InntektRapportering.SAKSBEHANDLER_BEREGNET_INNTEKT) shouldBe false
        InntektRapportering.PERSONINNTEKT_EGNE_OPPLYSNINGER.kanBrukesSammenMed(InntektRapportering.YTELSE_FRA_OFFENTLIG_MANUELT_BEREGNET) shouldBe false

        InntektRapportering.SAKSBEHANDLER_BEREGNET_INNTEKT.kanBrukesSammenMed(InntektRapportering.YTELSE_FRA_OFFENTLIG_MANUELT_BEREGNET) shouldBe false
    }
}
