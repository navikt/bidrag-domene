@file:Suppress("unused")

package no.nav.bidrag.domene.person.bool

import no.nav.bidrag.domene.felles.Verdiobjekt

@Deprecated("Bruk boolean i stedet")
class Utland(override val verdi: Boolean) : Verdiobjekt<Boolean>()
