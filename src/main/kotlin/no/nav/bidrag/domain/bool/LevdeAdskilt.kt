@file:Suppress("unused")

package no.nav.bidrag.domain.bool

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.StringToBooleanConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter

class LevdeAdskilt(override val verdi: Boolean) : Verdiobjekt<Boolean>()

class LevdeAdskiltReadingConverter : Converter<String, LevdeAdskilt> {
    override fun convert(source: String) = LevdeAdskilt(StringToBooleanConverter().convert(source))
}

class LevdeAdskiltWritingConverter : Converter<LevdeAdskilt, Boolean> {
    override fun convert(source: LevdeAdskilt) = source.verdi
}

class LevdeAdskiltConverter : AttributeConverter<LevdeAdskilt, Boolean> {
    override fun convertToEntityAttribute(source: Boolean?) = source?.let { LevdeAdskilt(source) }
    override fun convertToDatabaseColumn(source: LevdeAdskilt?) = source?.verdi
}
