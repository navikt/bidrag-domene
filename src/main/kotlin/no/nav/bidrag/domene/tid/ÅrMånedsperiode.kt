@file:Suppress("unused")

package no.nav.bidrag.domene.tid

import java.time.LocalDate
import java.time.YearMonth

data class ÅrMånedsperiode(override val fom: YearMonth, override val til: YearMonth?) : Periode<YearMonth>() {

    init {
        validate()
    }

    constructor(fom: LocalDate, til: LocalDate?) : this(YearMonth.from(fom), til?.let { YearMonth.from(til) })

    constructor(fom: String, til: String) : this(YearMonth.parse(fom), YearMonth.parse(til))

    constructor(periode: Pair<String, String>) : this(periode.first, periode.second)

    override fun lagPeriode(fom: YearMonth, til: YearMonth?): ÅrMånedsperiode {
        return ÅrMånedsperiode(fom, til)
    }

    override infix fun union(annen: Periode<YearMonth>): ÅrMånedsperiode {
        return super.union(annen) as ÅrMånedsperiode
    }

    override infix fun snitt(annen: Periode<YearMonth>): ÅrMånedsperiode? {
        return super.snitt(annen) as ÅrMånedsperiode?
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
