@file:Suppress("unused")

package no.nav.bidrag.domain.bool

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.StringToBooleanConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter

class Skjermet(override val verdi: Boolean) : Verdiobjekt<Boolean>()

class SkjermetReadingConverter : Converter<String, Skjermet> {
    override fun convert(source: String) = Skjermet(StringToBooleanConverter().convert(source))
}

class SkjermetWritingConverter : Converter<Skjermet, Boolean> {
    override fun convert(source: Skjermet) = source.verdi
}

class SkjermetConverter : AttributeConverter<Skjermet, Boolean> {
    override fun convertToEntityAttribute(source: Boolean?) = source?.let { Skjermet(source) }
    override fun convertToDatabaseColumn(source: Skjermet?) = source?.verdi
}
