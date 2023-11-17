@file:Suppress("unused")

package no.nav.bidrag.domene.tid

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domene.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter
import java.sql.Timestamp
import java.time.LocalDateTime

@Deprecated("Bruk LocalDateTime i stedet")
class OpprettetTidspunkt(override val verdi: LocalDateTime) : Verdiobjekt<LocalDateTime>()

@Deprecated("Bruk LocalDateTime i stedet")
class OpprettetTidspunktReadingConverter : Converter<Timestamp, OpprettetTidspunkt> {
    override fun convert(source: Timestamp) = OpprettetTidspunkt(source.toLocalDateTime())
}

@Deprecated("Bruk LocalDateTime i stedet")
class OpprettetTidspunktWritingConverter : Converter<OpprettetTidspunkt, Timestamp> {
    override fun convert(source: OpprettetTidspunkt) = Timestamp.valueOf(source.verdi)
}

@Deprecated("Bruk LocalDateTime i stedet")
class OpprettetTidspunktConverter : AttributeConverter<OpprettetTidspunkt, LocalDateTime> {
    override fun convertToEntityAttribute(source: LocalDateTime?) = source?.let { OpprettetTidspunkt(source) }
    override fun convertToDatabaseColumn(source: OpprettetTidspunkt?) = source?.verdi
}
