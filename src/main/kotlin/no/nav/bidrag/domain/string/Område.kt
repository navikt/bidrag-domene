@file:Suppress("unused")

package no.nav.bidrag.domain.string

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import no.nav.bidrag.domain.util.trimToNull
import org.springframework.core.convert.converter.Converter

class Område(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

class OmrådeReadingConverter : Converter<String, Område> {
    override fun convert(source: String) = source.trimToNull()?.let { Område(source) }
}

class OmrådeWritingConverter : Converter<Område, String> {
    override fun convert(source: Område) = source.verdi
}

class OmrådeConverter : AttributeConverter<Område, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { Område(source) }
    override fun convertToDatabaseColumn(source: Område?) = source?.verdi.trimToNull()
}
