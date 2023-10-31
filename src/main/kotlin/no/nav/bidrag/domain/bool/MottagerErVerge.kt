@file:Suppress("unused")

package no.nav.bidrag.domain.bool

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.StringToBooleanConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter

class MottagerErVerge(override val verdi: Boolean) : Verdiobjekt<Boolean>()

class MottagerErVergeReadingConverter : Converter<String, MottagerErVerge> {
    override fun convert(source: String) = MottagerErVerge(StringToBooleanConverter().convert(source))
}

class MottagerErVergeWritingConverter : Converter<MottagerErVerge, Boolean> {
    override fun convert(source: MottagerErVerge) = source.verdi
}

class MottagerErVergeConverter : AttributeConverter<MottagerErVerge, Boolean> {
    override fun convertToEntityAttribute(source: Boolean?) = source?.let { MottagerErVerge(source) }
    override fun convertToDatabaseColumn(source: MottagerErVerge?) = source?.verdi
}
