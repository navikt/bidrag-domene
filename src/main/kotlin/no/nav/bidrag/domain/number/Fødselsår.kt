@file:Suppress("unused")

package no.nav.bidrag.domain.number

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter

class Fødselsår(override val verdi: Int) : Verdiobjekt<Int>()

class FødselsårReadingConverter : Converter<Int, Fødselsår> {
    override fun convert(source: Int) = Fødselsår(source)
}

class FødselsårWritingConverter : Converter<Fødselsår, Int> {
    override fun convert(source: Fødselsår) = source.verdi
}

class FødselsårConverter : AttributeConverter<Fødselsår, Int> {
    override fun convertToEntityAttribute(source: Int?) = source?.let { Fødselsår(source) }
    override fun convertToDatabaseColumn(source: Fødselsår?) = source?.verdi
}
