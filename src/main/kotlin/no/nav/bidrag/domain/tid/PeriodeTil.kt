@file:Suppress("unused")

package no.nav.bidrag.domain.tid

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter
import java.sql.Date
import java.time.LocalDate

class PeriodeTil(override val verdi: LocalDate) : Verdiobjekt<LocalDate>() {

    companion object {
        fun of(år: Int, måned: Int, dag: Int): PeriodeTil {
            return PeriodeTil(LocalDate.of(år, måned, dag))
        }
    }
}

class PeriodeTilDatoReadingConverter : Converter<Date, PeriodeTil> {
    override fun convert(source: Date) = PeriodeTil(source.toLocalDate())
}

class PeriodeTilDatoWritingConverter : Converter<PeriodeTil, Date> {
    override fun convert(source: PeriodeTil) = Date.valueOf(source.verdi)
}

class PeriodeTilDatoConverter : AttributeConverter<PeriodeTil, LocalDate> {
    override fun convertToEntityAttribute(source: LocalDate?) = source?.let { PeriodeTil(source) }
    override fun convertToDatabaseColumn(source: PeriodeTil?) = source?.verdi
}
