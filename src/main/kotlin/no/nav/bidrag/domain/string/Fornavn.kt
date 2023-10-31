@file:Suppress("unused")

package no.nav.bidrag.domain.string

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import no.nav.bidrag.domain.util.trimToNull
import org.springframework.core.convert.converter.Converter

class Fornavn(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

class FornavnReadingConverter : Converter<String, Fornavn> {
    override fun convert(source: String) = source.trimToNull()?.let { Fornavn(source) }
}

class FornavnWritingConverter : Converter<Fornavn, String> {
    override fun convert(source: Fornavn) = source.verdi
}

class FornavnConverter : AttributeConverter<Fornavn, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { Fornavn(source) }
    override fun convertToDatabaseColumn(source: Fornavn?) = source?.verdi.trimToNull()
}
