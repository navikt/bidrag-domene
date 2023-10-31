@file:Suppress("unused")

package no.nav.bidrag.domain.tid

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter
import java.sql.Date
import java.time.LocalDate
import java.time.YearMonth

class TilMåned(override val verdi: YearMonth) : Verdiobjekt<YearMonth>()

class TilMånedReadingConverter : Converter<Date, TilMåned> {
    override fun convert(source: Date) = TilMåned(YearMonth.from(source.toLocalDate()))
}

class TilMånedWritingConverter : Converter<TilMåned, Date> {
    override fun convert(source: TilMåned) = Date.valueOf(source.verdi.atEndOfMonth())
}

class TilMånedConverter : AttributeConverter<TilMåned, LocalDate> {
    override fun convertToEntityAttribute(source: LocalDate?) = source?.let { TilMåned(YearMonth.from(source)) }
    override fun convertToDatabaseColumn(source: TilMåned?) = source?.verdi?.atEndOfMonth()
}
