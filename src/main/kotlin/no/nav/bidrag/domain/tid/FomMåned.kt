@file:Suppress("unused")

package no.nav.bidrag.domain.tid

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter
import java.sql.Date
import java.time.LocalDate
import java.time.YearMonth

class FomMåned(override val verdi: YearMonth) : Verdiobjekt<YearMonth>()

class FomMånedReadingConverter : Converter<Date, FomMåned> {
    override fun convert(source: Date) = FomMåned(YearMonth.from(source.toLocalDate()))
}

class FomMånedWritingConverter : Converter<FomMåned, Date> {
    override fun convert(source: FomMåned) = Date.valueOf(source.verdi.atDay(1))
}

class FomMånedConverter : AttributeConverter<FomMåned, LocalDate> {
    override fun convertToEntityAttribute(source: LocalDate?) = source?.let { FomMåned(YearMonth.from(source)) }
    override fun convertToDatabaseColumn(source: FomMåned?) = source?.verdi?.atDay(1)
}
