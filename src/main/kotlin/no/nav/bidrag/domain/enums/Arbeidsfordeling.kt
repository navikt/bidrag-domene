@file:Suppress("unused")

package no.nav.bidrag.domene.enums

import no.nav.bidrag.domene.string.Behandlingstema

enum class Arbeidsfordeling(
    private val beskrivelse: String,
    val behandlingstema: Behandlingstema?,
) {

    BBF("Barnebortføring", Behandlingstema("ab0323")),
    EEN("Eierenhet", null),
    EFS("Ektefellesak", Behandlingstema("ab0325")),
    FRS("Farskap", Behandlingstema("ab0322")),
    INH("Settekontor", null),
    OPS("Oppfostringssak", Behandlingstema("ab0324)")),
}
