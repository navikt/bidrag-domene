@file:Suppress("unused")

package no.nav.bidrag.domain.string

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import no.nav.bidrag.domain.util.trimToNull
import org.springframework.core.convert.converter.Converter

class Swift(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

class SwiftReadingConverter : Converter<String, Swift> {
    override fun convert(source: String) = source.trimToNull()?.let { Swift(source) }
}

class SwiftWritingConverter : Converter<Swift, String> {
    override fun convert(source: Swift) = source.verdi
}

class SwiftConverter : AttributeConverter<Swift, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { Swift(source) }
    override fun convertToDatabaseColumn(source: Swift?) = source?.verdi.trimToNull()
}
