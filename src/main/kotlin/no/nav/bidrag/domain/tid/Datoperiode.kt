@file:Suppress("unused")

package no.nav.bidrag.domain.tid

import java.time.LocalDate
import java.time.YearMonth

data class Datoperiode(override val fom: LocalDate, override val til: LocalDate?) : Periode<LocalDate>() {

    init {
        validate()
    }

    val fomMåned get() = FomMåned(YearMonth.from(fom))
    val tilMåned get() = til?.let { FomMåned(YearMonth.from(it)) }

    val fomDato get() = FomDato(fom)
    val tilDato get() = til?.let { TilDato(it) }

    constructor(fom: YearMonth, til: YearMonth?) : this(fom.atDay(1), til?.atEndOfMonth())
    constructor(fom: String, til: String) : this(LocalDate.parse(fom), LocalDate.parse(til))
    constructor(periode: Pair<String, String>) : this(periode.first, periode.second)

    override fun lagPeriode(fom: LocalDate, til: LocalDate?): Datoperiode {
        return Datoperiode(fom, til)
    }

    override infix fun union(annen: Periode<LocalDate>): Datoperiode {
        return super.union(annen) as Datoperiode
    }

    override infix fun snitt(annen: Periode<LocalDate>): Datoperiode? {
        return super.snitt(annen) as Datoperiode?
    }

    override infix fun påfølgesAv(påfølgende: Periode<LocalDate>): Boolean {
        return this.til?.plusDays(1) == påfølgende.fom
    }

    override fun tilEllerMax() = til ?: LocalDate.MAX

    override fun lengdeIHeleMåneder(): Long {
        require(fom.dayOfMonth == 1 && til == YearMonth.from(tilEllerMax()).atDay(1)) {
            "Forsøk på å beregne lengde i hele måneder for en periode som ikke er hele måneder: $fom - $til"
        }
        return (tilEllerMax().year * 12 + tilEllerMax().monthValue) - (fom.year * 12 + fom.monthValue).toLong()
    }

    fun toMånedsperiode() = Månedsperiode(fom, til)
}
