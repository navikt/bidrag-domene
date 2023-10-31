package no.nav.bidrag.domain.ident

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test
import java.time.LocalDate

internal class PersonIdentTest {

    @Test
    fun `skal anonmisere personIdent`() {
        PersonIdent("15507600333").toString() shouldBe "*5*0*6*0*3*"
        PersonIdent("29422059278").toString() shouldBe "*9*2*0*9*7*"
        PersonIdent("07420450952").toString() shouldBe "*7*2*4*0*5*"

        PersonIdent("15507600333").toString() shouldBe "*5*0*6*0*3*"
        PersonIdent("29422059278").toString() shouldBe "*9*2*0*9*7*"
    }

    @Test
    fun `skal tillate helsyntetiske nummer fra dolly`() {
        val listeAvBrukere = listOf(
            SyntetiskBruker("15507600333", "55507608360", "Mann", LocalDate.of(1976, 10, 15)),
            SyntetiskBruker("29422059278", "69422056629", "Kvinne", LocalDate.of(2020, 2, 29)),
            SyntetiskBruker("15507600333", "55507608360", "Mann", LocalDate.of(1976, 10, 15)),
            SyntetiskBruker("29422059278", "69422056629", "Kvinne", LocalDate.of(2020, 2, 29)),
            SyntetiskBruker("05440355678", "45440356293", "Kvinne", LocalDate.of(2003, 4, 5)),
            SyntetiskBruker("12429400544", "52429405181", "Mann", LocalDate.of(1994, 2, 12)),
            SyntetiskBruker("12505209719", "52505209540", "Mann", LocalDate.of(1952, 10, 12)),
            SyntetiskBruker("21483609245", "61483601467", "Kvinne", LocalDate.of(1936, 8, 21)),
            SyntetiskBruker("17912099997", "57912075186", "Mann", LocalDate.of(2020, 11, 17)),
            SyntetiskBruker("29822099635", "69822075096", "Kvinne", LocalDate.of(2020, 2, 29)),
            SyntetiskBruker("05840399895", "45840375084", "Kvinne", LocalDate.of(2003, 4, 5)),
            SyntetiskBruker("12829499914", "52829400197", "Mann", LocalDate.of(1994, 2, 12)),
            SyntetiskBruker("12905299938", "52905200100", "Mann", LocalDate.of(1952, 10, 12)),
            SyntetiskBruker("21883649874", "61883600222", "Kvinne", LocalDate.of(1936, 8, 21)),
        )

        listeAvBrukere.forEach {
            PersonIdent(it.fnr).verdi shouldBe it.fnr
            PersonIdent(it.dnr).verdi shouldBe it.dnr
            PersonIdent(it.fnr).fødselsdato() shouldBe it.fødselsdato
            PersonIdent(it.dnr).fødselsdato() shouldBe it.fødselsdato
            PersonIdent(it.fnr).erDNummer() shouldBe false
            PersonIdent(it.dnr).erDNummer() shouldBe true
        }
    }

    @Test
    fun `skal ikke tolke samhandlere som personidenter`() {
        PersonIdent("80000000000").gyldig() shouldBe false
        PersonIdent("80000000000").erDNummer() shouldBe false
        PersonIdent("80000000000").erSkattSyntetisk() shouldBe false
        PersonIdent("80000000000").erNAVSyntetisk() shouldBe false
        PersonIdent("90000000000").gyldig() shouldBe false
        PersonIdent("90000000000").erDNummer() shouldBe false
        PersonIdent("90000000000").erSkattSyntetisk() shouldBe false
        PersonIdent("90000000000").erNAVSyntetisk() shouldBe false
    }

    data class SyntetiskBruker(val fnr: String, val dnr: String, val kjønn: String, val fødselsdato: LocalDate)
}
