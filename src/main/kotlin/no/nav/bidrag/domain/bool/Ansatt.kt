@file:Suppress("unused")

package no.nav.bidrag.domain.bool

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.StringToBooleanConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter

class Ansatt(override val verdi: Boolean) : Verdiobjekt<Boolean>()

class AnsattReadingConverter : Converter<String, Ansatt> {
    override fun convert(source: String) = Ansatt(StringToBooleanConverter().convert(source))
}

class AnsattWritingConverter : Converter<Ansatt, Boolean> {
    override fun convert(source: Ansatt) = source.verdi
}

class AnsattConverter : AttributeConverter<Ansatt, Boolean> {
    override fun convertToEntityAttribute(source: Boolean?) = source?.let { Ansatt(source) }
    override fun convertToDatabaseColumn(source: Ansatt?) = source?.verdi
}
