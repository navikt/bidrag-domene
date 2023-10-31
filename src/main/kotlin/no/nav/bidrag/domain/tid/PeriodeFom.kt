@file:Suppress("unused")

package no.nav.bidrag.domain.tid

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter
import java.sql.Date
import java.time.LocalDate

class PeriodeFom(override val verdi: LocalDate) : Verdiobjekt<LocalDate>() {

    companion object {
        fun of(år: Int, måned: Int, dag: Int): PeriodeFom {
            return PeriodeFom(LocalDate.of(år, måned, dag))
        }
    }
}

class PeriodeFomReadingConverter : Converter<Date, PeriodeFom> {
    override fun convert(source: Date) = PeriodeFom(source.toLocalDate())
}

class PeriodeFomWritingConverter : Converter<PeriodeFom, Date> {
    override fun convert(source: PeriodeFom) = Date.valueOf(source.verdi)
}

class PeriodeFomConverter : AttributeConverter<PeriodeFom, LocalDate> {
    override fun convertToEntityAttribute(source: LocalDate?) = source?.let { PeriodeFom(source) }
    override fun convertToDatabaseColumn(source: PeriodeFom?) = source?.verdi
}
