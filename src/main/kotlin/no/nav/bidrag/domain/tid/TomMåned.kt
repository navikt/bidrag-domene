@file:Suppress("unused")

package no.nav.bidrag.domain.tid

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter
import java.sql.Date
import java.time.LocalDate
import java.time.YearMonth

class TomMåned(override val verdi: YearMonth) : Verdiobjekt<YearMonth>()

class TomMånedReadingConverter : Converter<Date, TomMåned> {
    override fun convert(source: Date) = TomMåned(YearMonth.from(source.toLocalDate()))
}

class TomMånedWritingConverter : Converter<TomMåned, Date> {
    override fun convert(source: TomMåned) = Date.valueOf(source.verdi.atEndOfMonth())
}

class TomMånedConverter : AttributeConverter<TomMåned, LocalDate> {
    override fun convertToEntityAttribute(source: LocalDate?) = source?.let { TomMåned(YearMonth.from(source)) }
    override fun convertToDatabaseColumn(source: TomMåned?) = source?.verdi?.atEndOfMonth()
}
