@file:Suppress("unused")

package no.nav.bidrag.domain.number

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter

class MatrikkelId(override val verdi: Long) : Verdiobjekt<Long>()

class MatrikkelIdReadingConverter : Converter<Long, MatrikkelId> {
    override fun convert(source: Long) = MatrikkelId(source)
}

class MatrikkelIdWritingConverter : Converter<MatrikkelId, Long> {
    override fun convert(source: MatrikkelId) = source.verdi
}

class MatrikkelIdConverter : AttributeConverter<MatrikkelId, Long> {
    override fun convertToEntityAttribute(source: Long?) = source?.let { MatrikkelId(source) }
    override fun convertToDatabaseColumn(source: MatrikkelId?) = source?.verdi
}
