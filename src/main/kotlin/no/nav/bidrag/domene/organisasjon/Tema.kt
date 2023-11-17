@file:Suppress("unused")

package no.nav.bidrag.domene.organisasjon

import no.nav.bidrag.domene.felles.Verdiobjekt

@Deprecated("Bruk String eller enum i stedet")
class Tema(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

val TEMA_BIDRAG = Tema("BID")
