@file:Suppress("unused")

package no.nav.bidrag.domain.tid

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter
import java.sql.Timestamp
import java.time.LocalDateTime

class Vedtakstidspunkt(override val verdi: LocalDateTime) : Verdiobjekt<LocalDateTime>()

class VedtakstidspunktReadingConverter : Converter<Timestamp, Vedtakstidspunkt> {
    override fun convert(source: Timestamp) = Vedtakstidspunkt(source.toLocalDateTime())
}

class VedtakstidspunktWritingConverter : Converter<Vedtakstidspunkt, Timestamp> {
    override fun convert(source: Vedtakstidspunkt) = Timestamp.valueOf(source.verdi)
}

class VedtakstidspunktConverter : AttributeConverter<Vedtakstidspunkt, LocalDateTime> {
    override fun convertToEntityAttribute(source: LocalDateTime?) = source?.let { Vedtakstidspunkt(source) }
    override fun convertToDatabaseColumn(source: Vedtakstidspunkt?) = source?.verdi
}
