@file:Suppress("unused")

package no.nav.bidrag.domene.sak.bool

import no.nav.bidrag.domene.felles.Verdiobjekt

@Deprecated("Bruk boolean i stedet")
class BegrensetTilgang(override val verdi: Boolean) : Verdiobjekt<Boolean>()
