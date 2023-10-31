@file:Suppress("unused")

package no.nav.bidrag.domene.enums

enum class Bidragssakstatus(val beskrivelse: String) {
    AK("Aktiv"),
    IN("Inaktiv"),
    NY("Journalsak"),
    SA("Sanert"),
    SO("Åpensøknad"),
}
