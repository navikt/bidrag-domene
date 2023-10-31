@file:Suppress("unused")

package no.nav.bidrag.domain.bool

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.StringToBooleanConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter

class Utland(override val verdi: Boolean) : Verdiobjekt<Boolean>()

class UtlandReadingConverter : Converter<String, Utland> {
    override fun convert(source: String) = Utland(StringToBooleanConverter().convert(source))
}

class UtlandWritingConverter : Converter<Utland, Boolean> {
    override fun convert(source: Utland) = source.verdi
}

class UtlandConverter : AttributeConverter<Utland, Boolean> {
    override fun convertToEntityAttribute(source: Boolean?) = source?.let { Utland(source) }
    override fun convertToDatabaseColumn(source: Utland?) = source?.verdi
}
