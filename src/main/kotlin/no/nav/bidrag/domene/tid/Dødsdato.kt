@file:Suppress("unused")

package no.nav.bidrag.domene.tid

import no.nav.bidrag.domene.felles.Verdiobjekt
import java.time.LocalDate

@Deprecated("Bruk LocalDate i stedet")
class Dødsdato(override val verdi: LocalDate) : Verdiobjekt<LocalDate>() {

    companion object {
        fun of(år: Int, måned: Int, dag: Int): Dødsdato {
            return Dødsdato(LocalDate.of(år, måned, dag))
        }
    }
}
