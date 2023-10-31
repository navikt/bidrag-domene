@file:Suppress("unused")

package no.nav.bidrag.domain.string

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import no.nav.bidrag.domain.util.trimToNull
import org.springframework.core.convert.converter.Converter

class Poststed(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

class PoststedReadingConverter : Converter<String, Poststed> {
    override fun convert(source: String) = source.trimToNull()?.let { Poststed(source) }
}

class PoststedWritingConverter : Converter<Poststed, String> {
    override fun convert(source: Poststed) = source.verdi
}

class PoststedConverter : AttributeConverter<Poststed, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { Poststed(source) }
    override fun convertToDatabaseColumn(source: Poststed?) = source?.verdi.trimToNull()
}
