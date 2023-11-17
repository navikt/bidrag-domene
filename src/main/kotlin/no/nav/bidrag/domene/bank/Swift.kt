@file:Suppress("unused")

package no.nav.bidrag.domene.bank

import no.nav.bidrag.domene.felles.Verdiobjekt

@Deprecated("Bruk String i stedet")
class Swift(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}
