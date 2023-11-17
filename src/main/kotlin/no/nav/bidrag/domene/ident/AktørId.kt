@file:Suppress("unused")

package no.nav.bidrag.domene.ident

import no.nav.bidrag.domene.felles.Verdiobjekt

@Deprecated("Bruk String i stedet")
class AktørId(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}
