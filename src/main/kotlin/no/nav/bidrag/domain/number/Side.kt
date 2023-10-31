@file:Suppress("unused")

package no.nav.bidrag.domain.number

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter

class Side(override val verdi: Int) : Verdiobjekt<Int>()

class SideReadingConverter : Converter<Int, Side> {
    override fun convert(source: Int) = Side(source)
}

class SideWritingConverter : Converter<Side, Int> {
    override fun convert(source: Side) = source.verdi
}

class SideConverter : AttributeConverter<Side, Int> {
    override fun convertToEntityAttribute(source: Int?) = source?.let { Side(source) }
    override fun convertToDatabaseColumn(source: Side?) = source?.verdi
}
