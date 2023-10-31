package no.nav.bidrag.domain.enum

import io.kotest.matchers.shouldBe
import no.nav.bidrag.domain.enums.InntektRapportering
import no.nav.bidrag.domain.enums.InntektType
import no.nav.bidrag.domain.enums.InntektType.Companion.inngårIInntektRapporteringer
import org.junit.jupiter.api.Test

class InntektTypeTest {

    @Test
    fun `skal hente alle inntektRapporteringer som inneholder en gitt inntektType`() {
        InntektType.AAP.inngårIInntektRapporteringer() shouldBe listOf(
            InntektRapportering.AINNTEKT,
            InntektRapportering.AINNTEKT_BEREGNET_3MND,
            InntektRapportering.AINNTEKT_BEREGNET_12MND,
            InntektRapportering.LIGNINGSINNTEKT,
            InntektRapportering.PERSONINNTEKT_EGNE_OPPLYSNINGER,
            InntektRapportering.SAKSBEHANDLER_BEREGNET_INNTEKT,
            InntektRapportering.YTELSE_FRA_OFFENTLIG_MANUELT_BEREGNET,
        )

        InntektType.DAGPENGER.inngårIInntektRapporteringer() shouldBe listOf(
            InntektRapportering.AINNTEKT,
            InntektRapportering.AINNTEKT_BEREGNET_3MND,
            InntektRapportering.AINNTEKT_BEREGNET_12MND,
            InntektRapportering.LIGNINGSINNTEKT,
            InntektRapportering.PERSONINNTEKT_EGNE_OPPLYSNINGER,
            InntektRapportering.SAKSBEHANDLER_BEREGNET_INNTEKT,
            InntektRapportering.YTELSE_FRA_OFFENTLIG_MANUELT_BEREGNET,
        )

        InntektType.FØDSEL_ADOPSJON.inngårIInntektRapporteringer() shouldBe listOf(
            InntektRapportering.AINNTEKT,
            InntektRapportering.AINNTEKT_BEREGNET_3MND,
            InntektRapportering.AINNTEKT_BEREGNET_12MND,
            InntektRapportering.LIGNINGSINNTEKT,
            InntektRapportering.PERSONINNTEKT_EGNE_OPPLYSNINGER,
            InntektRapportering.SAKSBEHANDLER_BEREGNET_INNTEKT,
            InntektRapportering.YTELSE_FRA_OFFENTLIG_MANUELT_BEREGNET,
        )

        InntektType.PENSJON.inngårIInntektRapporteringer() shouldBe listOf(
            InntektRapportering.AINNTEKT,
            InntektRapportering.AINNTEKT_BEREGNET_3MND,
            InntektRapportering.AINNTEKT_BEREGNET_12MND,
            InntektRapportering.LIGNINGSINNTEKT,
            InntektRapportering.PERSONINNTEKT_EGNE_OPPLYSNINGER,
            InntektRapportering.SAKSBEHANDLER_BEREGNET_INNTEKT,
            InntektRapportering.YTELSE_FRA_OFFENTLIG_MANUELT_BEREGNET,
        )

        InntektType.SYKEPENGER.inngårIInntektRapporteringer() shouldBe listOf(
            InntektRapportering.AINNTEKT,
            InntektRapportering.AINNTEKT_BEREGNET_3MND,
            InntektRapportering.AINNTEKT_BEREGNET_12MND,
            InntektRapportering.LIGNINGSINNTEKT,
            InntektRapportering.PERSONINNTEKT_EGNE_OPPLYSNINGER,
            InntektRapportering.SAKSBEHANDLER_BEREGNET_INNTEKT,
            InntektRapportering.YTELSE_FRA_OFFENTLIG_MANUELT_BEREGNET,
        )

        InntektType.LØNNSINNTEKT.inngårIInntektRapporteringer() shouldBe listOf(
            InntektRapportering.AINNTEKT,
            InntektRapportering.AINNTEKT_BEREGNET_3MND,
            InntektRapportering.AINNTEKT_BEREGNET_12MND,
            InntektRapportering.LIGNINGSINNTEKT,
            InntektRapportering.PERSONINNTEKT_EGNE_OPPLYSNINGER,
            InntektRapportering.SAKSBEHANDLER_BEREGNET_INNTEKT,
            InntektRapportering.LØNN_MANUELT_BEREGNET,
        )

        InntektType.NÆRINGSINNTEKT.inngårIInntektRapporteringer() shouldBe listOf(
            InntektRapportering.NÆRINGSINNTEKT_MANUELT_BEREGNET,
        )

        InntektType.KAPITALINNTEKT.inngårIInntektRapporteringer() shouldBe listOf(
            InntektRapportering.KAPITALINNTEKT,
            InntektRapportering.KAPITALINNTEKT_EGNE_OPPLYSNINGER,
        )

        InntektType.OVERGANGSSTØNAD.inngårIInntektRapporteringer() shouldBe listOf(
            InntektRapportering.AINNTEKT,
            InntektRapportering.AINNTEKT_BEREGNET_3MND,
            InntektRapportering.AINNTEKT_BEREGNET_12MND,
            InntektRapportering.LIGNINGSINNTEKT,
            InntektRapportering.PERSONINNTEKT_EGNE_OPPLYSNINGER,
            InntektRapportering.SAKSBEHANDLER_BEREGNET_INNTEKT,
            InntektRapportering.YTELSE_FRA_OFFENTLIG_MANUELT_BEREGNET,
        )

        InntektType.KONTANTSTØTTE.inngårIInntektRapporteringer() shouldBe listOf(
            InntektRapportering.KONTANTSTØTTE,
        )

        InntektType.UTVIDET_BARNETRYGD.inngårIInntektRapporteringer() shouldBe listOf(
            InntektRapportering.UTVIDET_BARNETRYGD,
        )

        InntektType.SMÅBARNSTILLEGG.inngårIInntektRapporteringer() shouldBe listOf(
            InntektRapportering.SMÅBARNSTILLEGG,
        )
    }
}
