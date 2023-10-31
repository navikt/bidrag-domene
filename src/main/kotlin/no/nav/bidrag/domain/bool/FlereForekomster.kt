@file:Suppress("unused")

package no.nav.bidrag.domain.bool

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.StringToBooleanConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter

class FlereForekomster(override val verdi: Boolean) : Verdiobjekt<Boolean>()

class FlereForekomsterReadingConverter : Converter<String, FlereForekomster> {
    override fun convert(source: String) = FlereForekomster(StringToBooleanConverter().convert(source))
}

class FlereForekomsterWritingConverter : Converter<FlereForekomster, Boolean> {
    override fun convert(source: FlereForekomster) = source.verdi
}

class FlereForekomsterConverter : AttributeConverter<FlereForekomster, Boolean> {
    override fun convertToEntityAttribute(source: Boolean?) = source?.let { FlereForekomster(source) }
    override fun convertToDatabaseColumn(source: FlereForekomster?) = source?.verdi
}
