@file:Suppress("unused")

package no.nav.bidrag.domene.tid

import no.nav.bidrag.domene.felles.Verdiobjekt
import java.time.LocalDate

@Deprecated("Bruk LocalDate i stedet")
class Bekreftelsesdato(override val verdi: LocalDate) : Verdiobjekt<LocalDate>() {

    companion object {
        fun of(år: Int, måned: Int, dag: Int): Bekreftelsesdato {
            return Bekreftelsesdato(LocalDate.of(år, måned, dag))
        }
    }
}
