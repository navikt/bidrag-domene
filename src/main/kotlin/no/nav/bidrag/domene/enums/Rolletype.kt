@file:Suppress("unused")

package no.nav.bidrag.domene.enums

import com.fasterxml.jackson.annotation.JsonAlias
import com.fasterxml.jackson.annotation.JsonProperty

enum class Rolletype {
    @JsonProperty("BA")
    @JsonAlias("BARN")
    BARN,

    @JsonProperty("BM")
    @JsonAlias("BIDRAGSMOTTAKER")
    BIDRAGSMOTTAKER,

    @JsonProperty("BP")
    @JsonAlias("BIDRAGSPLIKTIG")
    BIDRAGSPLIKTIG,

    @JsonProperty("FR")
    @JsonAlias("FEILREGISTRERT")
    FEILREGISTRERT,

    @JsonProperty("RM")
    @JsonAlias("REELMOTTAKER")
    REELMOTTAKER,
}
