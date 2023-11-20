@file:Suppress("unused")

package no.nav.bidrag.domene.tid

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domene.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter
import java.sql.Date
import java.time.LocalDate

@Deprecated("Bruk LocalDate i stedet")
class TomDato(override val verdi: LocalDate) : Verdiobjekt<LocalDate>() {

    companion object {
        fun of(år: Int, måned: Int, dag: Int): TomDato {
            return TomDato(LocalDate.of(år, måned, dag))
        }
    }
}

@Deprecated("Bruk LocalDate i stedet")
class TomDatoReadingConverter : Converter<Date, TomDato> {
    override fun convert(source: Date) = TomDato(source.toLocalDate())
}

@Deprecated("Bruk LocalDate i stedet")
class TomDatoWritingConverter : Converter<TomDato, Date> {
    override fun convert(source: TomDato) = Date.valueOf(source.verdi)
}

@Deprecated("Bruk LocalDate i stedet")
class TomDatoConverter : AttributeConverter<TomDato, LocalDate> {
    override fun convertToEntityAttribute(source: LocalDate?) = source?.let { TomDato(source) }
    override fun convertToDatabaseColumn(source: TomDato?) = source?.verdi
}
