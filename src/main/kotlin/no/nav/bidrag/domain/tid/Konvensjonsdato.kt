@file:Suppress("unused")

package no.nav.bidrag.domain.tid

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter
import java.sql.Date
import java.time.LocalDate

class Konvensjonsdato(override val verdi: LocalDate) : Verdiobjekt<LocalDate>() {

    companion object {
        fun of(år: Int, måned: Int, dag: Int): Konvensjonsdato {
            return Konvensjonsdato(LocalDate.of(år, måned, dag))
        }
    }
}

class KonvensjonsdatoReadingConverter : Converter<Date, Konvensjonsdato> {
    override fun convert(source: Date) = Konvensjonsdato(source.toLocalDate())
}

class KonvensjonsdatoWritingConverter : Converter<Konvensjonsdato, Date> {
    override fun convert(source: Konvensjonsdato) = Date.valueOf(source.verdi)
}

class KonvensjonsdatoConverter : AttributeConverter<Konvensjonsdato, LocalDate> {
    override fun convertToEntityAttribute(source: LocalDate?) = source?.let { Konvensjonsdato(source) }
    override fun convertToDatabaseColumn(source: Konvensjonsdato?) = source?.verdi
}
