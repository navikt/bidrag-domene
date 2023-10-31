@file:Suppress("unused")

package no.nav.bidrag.domain.bool

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.StringToBooleanConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter

class UkjentPart(override val verdi: Boolean) : Verdiobjekt<Boolean>()

class UkjentPartReadingConverter : Converter<String, UkjentPart> {
    override fun convert(source: String) = UkjentPart(StringToBooleanConverter().convert(source))
}

class UkjentPartWritingConverter : Converter<UkjentPart, Boolean> {
    override fun convert(source: UkjentPart) = source.verdi
}

class UkjentPartConverter : AttributeConverter<UkjentPart, Boolean> {
    override fun convertToEntityAttribute(source: Boolean?) = source?.let { UkjentPart(source) }
    override fun convertToDatabaseColumn(source: UkjentPart?) = source?.verdi
}
