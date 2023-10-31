@file:Suppress("unused")

package no.nav.bidrag.domain.tid

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter
import java.sql.Date
import java.time.LocalDate

class SanertDato(override val verdi: LocalDate) : Verdiobjekt<LocalDate>() {

    companion object {
        fun of(år: Int, måned: Int, dag: Int): SanertDato {
            return SanertDato(LocalDate.of(år, måned, dag))
        }
    }
}

class SanertDatoReadingConverter : Converter<Date, SanertDato> {
    override fun convert(source: Date) = SanertDato(source.toLocalDate())
}

class SanertDatoWritingConverter : Converter<SanertDato, Date> {
    override fun convert(source: SanertDato) = Date.valueOf(source.verdi)
}

class SanertDatoConverter : AttributeConverter<SanertDato, LocalDate> {
    override fun convertToEntityAttribute(source: LocalDate?) = source?.let { SanertDato(source) }
    override fun convertToDatabaseColumn(source: SanertDato?) = source?.verdi
}
