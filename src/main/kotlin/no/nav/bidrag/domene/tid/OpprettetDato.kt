@file:Suppress("unused")

package no.nav.bidrag.domene.tid

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domene.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter
import java.sql.Date
import java.time.LocalDate

@Deprecated("Bruk LocalDate i stedet")
class OpprettetDato(override val verdi: LocalDate) : Verdiobjekt<LocalDate>() {

    companion object {
        fun of(år: Int, måned: Int, dag: Int): OpprettetDato {
            return OpprettetDato(LocalDate.of(år, måned, dag))
        }
    }
}

@Deprecated("Bruk LocalDate i stedet")
class OpprettetDatoReadingConverter : Converter<Date, OpprettetDato> {
    override fun convert(source: Date) = OpprettetDato(source.toLocalDate())
}

@Deprecated("Bruk LocalDate i stedet")
class OpprettetDatoWritingConverter : Converter<OpprettetDato, Date> {
    override fun convert(source: OpprettetDato) = Date.valueOf(source.verdi)
}

@Deprecated("Bruk LocalDate i stedet")
class OpprettetDatoConverter : AttributeConverter<OpprettetDato, LocalDate> {
    override fun convertToEntityAttribute(source: LocalDate?) = source?.let { OpprettetDato(source) }
    override fun convertToDatabaseColumn(source: OpprettetDato?) = source?.verdi
}
