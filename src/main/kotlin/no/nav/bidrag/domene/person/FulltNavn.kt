@file:Suppress("unused")

package no.nav.bidrag.domene.person

import no.nav.bidrag.domene.felles.Verdiobjekt

@Deprecated("Bruk String i stedet")
class FulltNavn(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}