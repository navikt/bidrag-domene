@file:Suppress("unused")

package no.nav.bidrag.domene.tid

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domene.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter
import java.sql.Date
import java.time.LocalDate

@Deprecated("Bruk LocalDate i stedet")
class Fødselsdato(override val verdi: LocalDate) : Verdiobjekt<LocalDate>() {

    companion object {
        fun of(år: Int, måned: Int, dag: Int): Fødselsdato {
            return Fødselsdato(LocalDate.of(år, måned, dag))
        }
    }
}

@Deprecated("Bruk LocalDate i stedet")
class FødselsdatoReadingConverter : Converter<Date, Fødselsdato> {
    override fun convert(source: Date) = Fødselsdato(source.toLocalDate())
}

@Deprecated("Bruk LocalDate i stedet")
class FødselsdatoWritingConverter : Converter<Fødselsdato, Date> {
    override fun convert(source: Fødselsdato) = Date.valueOf(source.verdi)
}

@Deprecated("Bruk LocalDate i stedet")
class FødselsdatoConverter : AttributeConverter<Fødselsdato, LocalDate> {
    override fun convertToEntityAttribute(source: LocalDate?) = source?.let { Fødselsdato(source) }
    override fun convertToDatabaseColumn(source: Fødselsdato?) = source?.verdi
}
