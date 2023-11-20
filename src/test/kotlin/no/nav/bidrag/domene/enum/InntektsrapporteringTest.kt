package no.nav.bidrag.domene.enum

import io.kotest.matchers.shouldBe
import no.nav.bidrag.domene.enums.inntekt.Inntektsrapportering
import no.nav.bidrag.domene.enums.inntekt.Inntektsrapportering.Companion.kanBrukesSammenMed
import org.junit.jupiter.api.Test

class InntektsrapporteringTest {

    @Test
    fun `skal sjekke om to inntektsrapporteringer kan opptre samtidig`() {
        Inntektsrapportering.AINNTEKT.kanBrukesSammenMed(Inntektsrapportering.AINNTEKT_BEREGNET_3MND) shouldBe false
        Inntektsrapportering.AINNTEKT.kanBrukesSammenMed(Inntektsrapportering.AINNTEKT_BEREGNET_12MND) shouldBe false
        Inntektsrapportering.AINNTEKT.kanBrukesSammenMed(Inntektsrapportering.KAPITALINNTEKT) shouldBe true
        Inntektsrapportering.AINNTEKT.kanBrukesSammenMed(Inntektsrapportering.LIGNINGSINNTEKT) shouldBe false
        Inntektsrapportering.AINNTEKT.kanBrukesSammenMed(Inntektsrapportering.KONTANTSTØTTE) shouldBe true
        Inntektsrapportering.AINNTEKT.kanBrukesSammenMed(Inntektsrapportering.SMÅBARNSTILLEGG) shouldBe true
        Inntektsrapportering.AINNTEKT.kanBrukesSammenMed(Inntektsrapportering.UTVIDET_BARNETRYGD) shouldBe true
        Inntektsrapportering.AINNTEKT.kanBrukesSammenMed(Inntektsrapportering.LØNN_MANUELT_BEREGNET) shouldBe false
        Inntektsrapportering.AINNTEKT.kanBrukesSammenMed(Inntektsrapportering.KAPITALINNTEKT_EGNE_OPPLYSNINGER) shouldBe true
        Inntektsrapportering.AINNTEKT.kanBrukesSammenMed(Inntektsrapportering.NÆRINGSINNTEKT_MANUELT_BEREGNET) shouldBe true
        Inntektsrapportering.AINNTEKT.kanBrukesSammenMed(Inntektsrapportering.PERSONINNTEKT_EGNE_OPPLYSNINGER) shouldBe false
        Inntektsrapportering.AINNTEKT.kanBrukesSammenMed(Inntektsrapportering.SAKSBEHANDLER_BEREGNET_INNTEKT) shouldBe false
        Inntektsrapportering.AINNTEKT.kanBrukesSammenMed(Inntektsrapportering.YTELSE_FRA_OFFENTLIG_MANUELT_BEREGNET) shouldBe false

        Inntektsrapportering.AINNTEKT_BEREGNET_3MND.kanBrukesSammenMed(Inntektsrapportering.AINNTEKT_BEREGNET_12MND) shouldBe false
        Inntektsrapportering.AINNTEKT_BEREGNET_3MND.kanBrukesSammenMed(Inntektsrapportering.KAPITALINNTEKT) shouldBe true
        Inntektsrapportering.AINNTEKT_BEREGNET_3MND.kanBrukesSammenMed(Inntektsrapportering.LIGNINGSINNTEKT) shouldBe false
        Inntektsrapportering.AINNTEKT_BEREGNET_3MND.kanBrukesSammenMed(Inntektsrapportering.KONTANTSTØTTE) shouldBe true
        Inntektsrapportering.AINNTEKT_BEREGNET_3MND.kanBrukesSammenMed(Inntektsrapportering.SMÅBARNSTILLEGG) shouldBe true
        Inntektsrapportering.AINNTEKT_BEREGNET_3MND.kanBrukesSammenMed(Inntektsrapportering.UTVIDET_BARNETRYGD) shouldBe true
        Inntektsrapportering.AINNTEKT_BEREGNET_3MND.kanBrukesSammenMed(Inntektsrapportering.LØNN_MANUELT_BEREGNET) shouldBe false
        Inntektsrapportering.AINNTEKT_BEREGNET_3MND.kanBrukesSammenMed(Inntektsrapportering.KAPITALINNTEKT_EGNE_OPPLYSNINGER) shouldBe true
        Inntektsrapportering.AINNTEKT_BEREGNET_3MND.kanBrukesSammenMed(Inntektsrapportering.NÆRINGSINNTEKT_MANUELT_BEREGNET) shouldBe true
        Inntektsrapportering.AINNTEKT_BEREGNET_3MND.kanBrukesSammenMed(Inntektsrapportering.PERSONINNTEKT_EGNE_OPPLYSNINGER) shouldBe false
        Inntektsrapportering.AINNTEKT_BEREGNET_3MND.kanBrukesSammenMed(Inntektsrapportering.SAKSBEHANDLER_BEREGNET_INNTEKT) shouldBe false
        Inntektsrapportering.AINNTEKT_BEREGNET_3MND.kanBrukesSammenMed(Inntektsrapportering.YTELSE_FRA_OFFENTLIG_MANUELT_BEREGNET) shouldBe false

        Inntektsrapportering.AINNTEKT_BEREGNET_12MND.kanBrukesSammenMed(Inntektsrapportering.KAPITALINNTEKT) shouldBe true
        Inntektsrapportering.AINNTEKT_BEREGNET_12MND.kanBrukesSammenMed(Inntektsrapportering.LIGNINGSINNTEKT) shouldBe false
        Inntektsrapportering.AINNTEKT_BEREGNET_12MND.kanBrukesSammenMed(Inntektsrapportering.KONTANTSTØTTE) shouldBe true
        Inntektsrapportering.AINNTEKT_BEREGNET_12MND.kanBrukesSammenMed(Inntektsrapportering.SMÅBARNSTILLEGG) shouldBe true
        Inntektsrapportering.AINNTEKT_BEREGNET_12MND.kanBrukesSammenMed(Inntektsrapportering.UTVIDET_BARNETRYGD) shouldBe true
        Inntektsrapportering.AINNTEKT_BEREGNET_12MND.kanBrukesSammenMed(Inntektsrapportering.LØNN_MANUELT_BEREGNET) shouldBe false
        Inntektsrapportering.AINNTEKT_BEREGNET_12MND.kanBrukesSammenMed(Inntektsrapportering.KAPITALINNTEKT_EGNE_OPPLYSNINGER) shouldBe true
        Inntektsrapportering.AINNTEKT_BEREGNET_12MND.kanBrukesSammenMed(Inntektsrapportering.NÆRINGSINNTEKT_MANUELT_BEREGNET) shouldBe true
        Inntektsrapportering.AINNTEKT_BEREGNET_12MND.kanBrukesSammenMed(Inntektsrapportering.PERSONINNTEKT_EGNE_OPPLYSNINGER) shouldBe false
        Inntektsrapportering.AINNTEKT_BEREGNET_12MND.kanBrukesSammenMed(Inntektsrapportering.SAKSBEHANDLER_BEREGNET_INNTEKT) shouldBe false
        Inntektsrapportering.AINNTEKT_BEREGNET_12MND.kanBrukesSammenMed(Inntektsrapportering.YTELSE_FRA_OFFENTLIG_MANUELT_BEREGNET) shouldBe false

        Inntektsrapportering.KAPITALINNTEKT.kanBrukesSammenMed(Inntektsrapportering.LIGNINGSINNTEKT) shouldBe true
        Inntektsrapportering.KAPITALINNTEKT.kanBrukesSammenMed(Inntektsrapportering.KONTANTSTØTTE) shouldBe true
        Inntektsrapportering.KAPITALINNTEKT.kanBrukesSammenMed(Inntektsrapportering.SMÅBARNSTILLEGG) shouldBe true
        Inntektsrapportering.KAPITALINNTEKT.kanBrukesSammenMed(Inntektsrapportering.UTVIDET_BARNETRYGD) shouldBe true
        Inntektsrapportering.KAPITALINNTEKT.kanBrukesSammenMed(Inntektsrapportering.LØNN_MANUELT_BEREGNET) shouldBe true
        Inntektsrapportering.KAPITALINNTEKT.kanBrukesSammenMed(Inntektsrapportering.KAPITALINNTEKT_EGNE_OPPLYSNINGER) shouldBe false
        Inntektsrapportering.KAPITALINNTEKT.kanBrukesSammenMed(Inntektsrapportering.NÆRINGSINNTEKT_MANUELT_BEREGNET) shouldBe true
        Inntektsrapportering.KAPITALINNTEKT.kanBrukesSammenMed(Inntektsrapportering.PERSONINNTEKT_EGNE_OPPLYSNINGER) shouldBe true
        Inntektsrapportering.KAPITALINNTEKT.kanBrukesSammenMed(Inntektsrapportering.SAKSBEHANDLER_BEREGNET_INNTEKT) shouldBe true
        Inntektsrapportering.KAPITALINNTEKT.kanBrukesSammenMed(Inntektsrapportering.YTELSE_FRA_OFFENTLIG_MANUELT_BEREGNET) shouldBe true

        Inntektsrapportering.LIGNINGSINNTEKT.kanBrukesSammenMed(Inntektsrapportering.KONTANTSTØTTE) shouldBe true
        Inntektsrapportering.LIGNINGSINNTEKT.kanBrukesSammenMed(Inntektsrapportering.SMÅBARNSTILLEGG) shouldBe true
        Inntektsrapportering.LIGNINGSINNTEKT.kanBrukesSammenMed(Inntektsrapportering.UTVIDET_BARNETRYGD) shouldBe true
        Inntektsrapportering.LIGNINGSINNTEKT.kanBrukesSammenMed(Inntektsrapportering.LØNN_MANUELT_BEREGNET) shouldBe false
        Inntektsrapportering.LIGNINGSINNTEKT.kanBrukesSammenMed(Inntektsrapportering.KAPITALINNTEKT_EGNE_OPPLYSNINGER) shouldBe true
        Inntektsrapportering.LIGNINGSINNTEKT.kanBrukesSammenMed(Inntektsrapportering.NÆRINGSINNTEKT_MANUELT_BEREGNET) shouldBe true
        Inntektsrapportering.LIGNINGSINNTEKT.kanBrukesSammenMed(Inntektsrapportering.PERSONINNTEKT_EGNE_OPPLYSNINGER) shouldBe false
        Inntektsrapportering.LIGNINGSINNTEKT.kanBrukesSammenMed(Inntektsrapportering.SAKSBEHANDLER_BEREGNET_INNTEKT) shouldBe false
        Inntektsrapportering.LIGNINGSINNTEKT.kanBrukesSammenMed(Inntektsrapportering.YTELSE_FRA_OFFENTLIG_MANUELT_BEREGNET) shouldBe false

        Inntektsrapportering.KONTANTSTØTTE.kanBrukesSammenMed(Inntektsrapportering.SMÅBARNSTILLEGG) shouldBe true
        Inntektsrapportering.KONTANTSTØTTE.kanBrukesSammenMed(Inntektsrapportering.UTVIDET_BARNETRYGD) shouldBe true
        Inntektsrapportering.KONTANTSTØTTE.kanBrukesSammenMed(Inntektsrapportering.LØNN_MANUELT_BEREGNET) shouldBe true
        Inntektsrapportering.KONTANTSTØTTE.kanBrukesSammenMed(Inntektsrapportering.KAPITALINNTEKT_EGNE_OPPLYSNINGER) shouldBe true
        Inntektsrapportering.KONTANTSTØTTE.kanBrukesSammenMed(Inntektsrapportering.NÆRINGSINNTEKT_MANUELT_BEREGNET) shouldBe true
        Inntektsrapportering.KONTANTSTØTTE.kanBrukesSammenMed(Inntektsrapportering.PERSONINNTEKT_EGNE_OPPLYSNINGER) shouldBe true
        Inntektsrapportering.KONTANTSTØTTE.kanBrukesSammenMed(Inntektsrapportering.SAKSBEHANDLER_BEREGNET_INNTEKT) shouldBe true
        Inntektsrapportering.KONTANTSTØTTE.kanBrukesSammenMed(Inntektsrapportering.YTELSE_FRA_OFFENTLIG_MANUELT_BEREGNET) shouldBe true

        Inntektsrapportering.SMÅBARNSTILLEGG.kanBrukesSammenMed(Inntektsrapportering.UTVIDET_BARNETRYGD) shouldBe true
        Inntektsrapportering.SMÅBARNSTILLEGG.kanBrukesSammenMed(Inntektsrapportering.LØNN_MANUELT_BEREGNET) shouldBe true
        Inntektsrapportering.SMÅBARNSTILLEGG.kanBrukesSammenMed(Inntektsrapportering.KAPITALINNTEKT_EGNE_OPPLYSNINGER) shouldBe true
        Inntektsrapportering.SMÅBARNSTILLEGG.kanBrukesSammenMed(Inntektsrapportering.NÆRINGSINNTEKT_MANUELT_BEREGNET) shouldBe true
        Inntektsrapportering.SMÅBARNSTILLEGG.kanBrukesSammenMed(Inntektsrapportering.PERSONINNTEKT_EGNE_OPPLYSNINGER) shouldBe true
        Inntektsrapportering.SMÅBARNSTILLEGG.kanBrukesSammenMed(Inntektsrapportering.SAKSBEHANDLER_BEREGNET_INNTEKT) shouldBe true
        Inntektsrapportering.SMÅBARNSTILLEGG.kanBrukesSammenMed(Inntektsrapportering.YTELSE_FRA_OFFENTLIG_MANUELT_BEREGNET) shouldBe true

        Inntektsrapportering.UTVIDET_BARNETRYGD.kanBrukesSammenMed(Inntektsrapportering.LØNN_MANUELT_BEREGNET) shouldBe true
        Inntektsrapportering.UTVIDET_BARNETRYGD.kanBrukesSammenMed(Inntektsrapportering.KAPITALINNTEKT_EGNE_OPPLYSNINGER) shouldBe true
        Inntektsrapportering.UTVIDET_BARNETRYGD.kanBrukesSammenMed(Inntektsrapportering.NÆRINGSINNTEKT_MANUELT_BEREGNET) shouldBe true
        Inntektsrapportering.UTVIDET_BARNETRYGD.kanBrukesSammenMed(Inntektsrapportering.PERSONINNTEKT_EGNE_OPPLYSNINGER) shouldBe true
        Inntektsrapportering.UTVIDET_BARNETRYGD.kanBrukesSammenMed(Inntektsrapportering.SAKSBEHANDLER_BEREGNET_INNTEKT) shouldBe true
        Inntektsrapportering.UTVIDET_BARNETRYGD.kanBrukesSammenMed(Inntektsrapportering.YTELSE_FRA_OFFENTLIG_MANUELT_BEREGNET) shouldBe true

        Inntektsrapportering.LØNN_MANUELT_BEREGNET.kanBrukesSammenMed(Inntektsrapportering.KAPITALINNTEKT_EGNE_OPPLYSNINGER) shouldBe true
        Inntektsrapportering.LØNN_MANUELT_BEREGNET.kanBrukesSammenMed(Inntektsrapportering.NÆRINGSINNTEKT_MANUELT_BEREGNET) shouldBe true
        Inntektsrapportering.LØNN_MANUELT_BEREGNET.kanBrukesSammenMed(Inntektsrapportering.PERSONINNTEKT_EGNE_OPPLYSNINGER) shouldBe false
        Inntektsrapportering.LØNN_MANUELT_BEREGNET.kanBrukesSammenMed(Inntektsrapportering.SAKSBEHANDLER_BEREGNET_INNTEKT) shouldBe false
        Inntektsrapportering.LØNN_MANUELT_BEREGNET.kanBrukesSammenMed(Inntektsrapportering.YTELSE_FRA_OFFENTLIG_MANUELT_BEREGNET) shouldBe true

        Inntektsrapportering.KAPITALINNTEKT_EGNE_OPPLYSNINGER.kanBrukesSammenMed(Inntektsrapportering.NÆRINGSINNTEKT_MANUELT_BEREGNET) shouldBe true
        Inntektsrapportering.KAPITALINNTEKT_EGNE_OPPLYSNINGER.kanBrukesSammenMed(Inntektsrapportering.PERSONINNTEKT_EGNE_OPPLYSNINGER) shouldBe true
        Inntektsrapportering.KAPITALINNTEKT_EGNE_OPPLYSNINGER.kanBrukesSammenMed(Inntektsrapportering.SAKSBEHANDLER_BEREGNET_INNTEKT) shouldBe true
        Inntektsrapportering.KAPITALINNTEKT_EGNE_OPPLYSNINGER.kanBrukesSammenMed(Inntektsrapportering.YTELSE_FRA_OFFENTLIG_MANUELT_BEREGNET) shouldBe true

        Inntektsrapportering.NÆRINGSINNTEKT_MANUELT_BEREGNET.kanBrukesSammenMed(Inntektsrapportering.PERSONINNTEKT_EGNE_OPPLYSNINGER) shouldBe true
        Inntektsrapportering.NÆRINGSINNTEKT_MANUELT_BEREGNET.kanBrukesSammenMed(Inntektsrapportering.SAKSBEHANDLER_BEREGNET_INNTEKT) shouldBe true
        Inntektsrapportering.NÆRINGSINNTEKT_MANUELT_BEREGNET.kanBrukesSammenMed(Inntektsrapportering.YTELSE_FRA_OFFENTLIG_MANUELT_BEREGNET) shouldBe true

        Inntektsrapportering.PERSONINNTEKT_EGNE_OPPLYSNINGER.kanBrukesSammenMed(Inntektsrapportering.SAKSBEHANDLER_BEREGNET_INNTEKT) shouldBe false
        Inntektsrapportering.PERSONINNTEKT_EGNE_OPPLYSNINGER.kanBrukesSammenMed(Inntektsrapportering.YTELSE_FRA_OFFENTLIG_MANUELT_BEREGNET) shouldBe false

        Inntektsrapportering.SAKSBEHANDLER_BEREGNET_INNTEKT.kanBrukesSammenMed(Inntektsrapportering.YTELSE_FRA_OFFENTLIG_MANUELT_BEREGNET) shouldBe false
    }
}
