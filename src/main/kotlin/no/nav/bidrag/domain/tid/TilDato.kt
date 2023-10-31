@file:Suppress("unused")

package no.nav.bidrag.domain.tid

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter
import java.sql.Date
import java.time.LocalDate

class TilDato(override val verdi: LocalDate) : Verdiobjekt<LocalDate>() {

    companion object {
        fun of(år: Int, måned: Int, dag: Int): TilDato {
            return TilDato(LocalDate.of(år, måned, dag))
        }
    }
}

class TilDatoReadingConverter : Converter<Date, TilDato> {
    override fun convert(source: Date) = TilDato(source.toLocalDate())
}

class TilDatoWritingConverter : Converter<TilDato, Date> {
    override fun convert(source: TilDato) = Date.valueOf(source.verdi)
}

class TilDatoConverter : AttributeConverter<TilDato, LocalDate> {
    override fun convertToEntityAttribute(source: LocalDate?) = source?.let { TilDato(source) }
    override fun convertToDatabaseColumn(source: TilDato?) = source?.verdi
}
