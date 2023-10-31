@file:Suppress("unused")

package no.nav.bidrag.domene.streng

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domene.felles.Verdiobjekt
import no.nav.bidrag.domene.util.trimToNull
import org.springframework.core.convert.converter.Converter

class Enhetsnavn(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

class EnhetsnavnReadingConverter : Converter<String, Enhetsnavn> {
    override fun convert(source: String) = source.trimToNull()?.let { Enhetsnavn(source) }
}

class EnhetsnavnWritingConverter : Converter<Enhetsnavn, String> {
    override fun convert(source: Enhetsnavn) = source.verdi
}

class EnhetsnavnConverter : AttributeConverter<Enhetsnavn, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { Enhetsnavn(source) }
    override fun convertToDatabaseColumn(source: Enhetsnavn?) = source?.verdi.trimToNull()
}
