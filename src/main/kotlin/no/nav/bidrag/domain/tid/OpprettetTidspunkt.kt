@file:Suppress("unused")

package no.nav.bidrag.domain.tid

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter
import java.sql.Timestamp
import java.time.LocalDateTime

class OpprettetTidspunkt(override val verdi: LocalDateTime) : Verdiobjekt<LocalDateTime>()

class OpprettetTidspunktReadingConverter : Converter<Timestamp, OpprettetTidspunkt> {
    override fun convert(source: Timestamp) = OpprettetTidspunkt(source.toLocalDateTime())
}

class OpprettetTidspunktWritingConverter : Converter<OpprettetTidspunkt, Timestamp> {
    override fun convert(source: OpprettetTidspunkt) = Timestamp.valueOf(source.verdi)
}

class OpprettetTidspunktConverter : AttributeConverter<OpprettetTidspunkt, LocalDateTime> {
    override fun convertToEntityAttribute(source: LocalDateTime?) = source?.let { OpprettetTidspunkt(source) }
    override fun convertToDatabaseColumn(source: OpprettetTidspunkt?) = source?.verdi
}
