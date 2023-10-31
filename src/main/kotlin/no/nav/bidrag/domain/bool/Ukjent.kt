@file:Suppress("unused")

package no.nav.bidrag.domain.bool

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.StringToBooleanConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter

class Ukjent(override val verdi: Boolean) : Verdiobjekt<Boolean>()

class UkjentReadingConverter : Converter<String, Ukjent> {
    override fun convert(source: String) = Ukjent(StringToBooleanConverter().convert(source))
}

class UkjentWritingConverter : Converter<Ukjent, Boolean> {
    override fun convert(source: Ukjent) = source.verdi
}

class UkjentConverter : AttributeConverter<Ukjent, Boolean> {
    override fun convertToEntityAttribute(source: Boolean?) = source?.let { Ukjent(source) }
    override fun convertToDatabaseColumn(source: Ukjent?) = source?.verdi
}
