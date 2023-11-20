@file:Suppress("unused")

package no.nav.bidrag.domene.adresse

import no.nav.bidrag.domene.felles.Verdiobjekt

@Deprecated("Bruk String i stedet")
class Adresselinje3(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}
