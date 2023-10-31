@file:Suppress("unused")

package no.nav.bidrag.domain.tid

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter
import java.sql.Date
import java.time.LocalDate

class Dødsdato(override val verdi: LocalDate) : Verdiobjekt<LocalDate>() {

    companion object {
        fun of(år: Int, måned: Int, dag: Int): Dødsdato {
            return Dødsdato(LocalDate.of(år, måned, dag))
        }
    }
}

class DødsdatoReadingConverter : Converter<Date, Dødsdato> {
    override fun convert(source: Date) = Dødsdato(source.toLocalDate())
}

class DødsdatoWritingConverter : Converter<Dødsdato, Date> {
    override fun convert(source: Dødsdato) = Date.valueOf(source.verdi)
}

class DødsdatoConverter : AttributeConverter<Dødsdato, LocalDate> {
    override fun convertToEntityAttribute(source: LocalDate?) = source?.let { Dødsdato(source) }
    override fun convertToDatabaseColumn(source: Dødsdato?) = source?.verdi
}
