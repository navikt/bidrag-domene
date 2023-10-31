@file:Suppress("unused")

package no.nav.bidrag.domain.string

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import no.nav.bidrag.domain.util.trimToNull
import org.springframework.core.convert.converter.Converter

class FulltNavn(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

class FulltNavnReadingConverter : Converter<String, FulltNavn> {
    override fun convert(source: String) = source.trimToNull()?.let { FulltNavn(source) }
}

class FulltNavnWritingConverter : Converter<FulltNavn, String> {
    override fun convert(source: FulltNavn) = source.verdi
}

class FulltNavnConverter : AttributeConverter<FulltNavn, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { FulltNavn(source) }
    override fun convertToDatabaseColumn(source: FulltNavn?) = source?.verdi.trimToNull()
}
