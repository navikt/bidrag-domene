@file:Suppress("unused")

package no.nav.bidrag.domain.string

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import no.nav.bidrag.domain.util.trimToNull
import org.springframework.core.convert.converter.Converter

class Språkkode(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

class SpråkkodeReadingConverter : Converter<String, Språkkode> {
    override fun convert(source: String) = source.trimToNull()?.let { Språkkode(source) }
}

class SpråkkodeWritingConverter : Converter<Språkkode, String> {
    override fun convert(source: Språkkode) = source.verdi
}

class SpråkkodeConverter : AttributeConverter<Språkkode, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { Språkkode(source) }
    override fun convertToDatabaseColumn(source: Språkkode?) = source?.verdi.trimToNull()
}
