@file:Suppress("unused")

package no.nav.bidrag.domain.tid

import java.time.LocalDate
import java.time.YearMonth

data class Månedsperiode(override val fom: YearMonth, override val til: YearMonth?) : Periode<YearMonth>() {

    init {
        validate()
    }

    val fomMåned get() = FomMåned(fom)
    val tilMåned get() = til?.let { TilMåned(it) }
    val fomDato get() = FomDato(fom.atDay(1))
    val tilDato get() = til?.let { TilDato(it.atEndOfMonth()) }

    constructor(fom: LocalDate, til: LocalDate?) : this(YearMonth.from(fom), til?.let { YearMonth.from(til) })

    constructor(fomMåned: FomMåned, tilMåned: TilMåned? = null) : this(fomMåned.verdi, tilMåned?.verdi)

    constructor(fom: String, til: String) : this(YearMonth.parse(fom), YearMonth.parse(til))

    constructor(periode: Pair<String, String>) : this(periode.first, periode.second)

    override fun lagPeriode(fom: YearMonth, til: YearMonth?): Månedsperiode {
        return Månedsperiode(fom, til)
    }

    override infix fun union(annen: Periode<YearMonth>): Månedsperiode {
        return super.union(annen) as Månedsperiode
    }

    override infix fun snitt(annen: Periode<YearMonth>): Månedsperiode? {
        return super.snitt(annen) as Månedsperiode?
    }

    override infix fun påfølgesAv(påfølgende: Periode<YearMonth>): Boolean {
        return this.til?.plusMonths(1) == påfølgende.fom
    }

    override fun tilEllerMax(): YearMonth {
        return til ?: YearMonth.from(LocalDate.MAX)
    }

    override fun lengdeIHeleMåneder(): Long {
        return (tilEllerMax().minusMonths(1).year * 12 + tilEllerMax().monthValue) - (fom.year * 12 + fom.monthValue) + 1L
    }

    fun toDatoperiode() = Datoperiode(fom, til)
}
