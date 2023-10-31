@file:Suppress("unused")

package no.nav.bidrag.domain.bool

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.StringToBooleanConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter

class Paragraf19(override val verdi: Boolean) : Verdiobjekt<Boolean>()

class Paragraf19ReadingConverter : Converter<String, Paragraf19> {
    override fun convert(source: String) = Paragraf19(StringToBooleanConverter().convert(source))
}

class Paragraf19WritingConverter : Converter<Paragraf19, Boolean> {
    override fun convert(source: Paragraf19) = source.verdi
}

class Paragraf19Converter : AttributeConverter<Paragraf19, Boolean> {
    override fun convertToEntityAttribute(source: Boolean?) = source?.let { Paragraf19(source) }
    override fun convertToDatabaseColumn(source: Paragraf19?) = source?.verdi
}
