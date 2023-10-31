@file:Suppress("unused")

package no.nav.bidrag.domain.string

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import no.nav.bidrag.domain.util.trimToNull
import org.springframework.core.convert.converter.Converter

class Enhetsnummer(override val verdi: String) : Verdiobjekt<String>() {

    override fun gyldig() = verdi.matches(ENHET_REGEX)

    companion object {
        private val ENHET_REGEX = Regex("^\\d{4}$")
    }
}

class EnhetsnummerReadingConverter : Converter<String, Enhetsnummer> {
    override fun convert(source: String) = source.trimToNull()?.let { Enhetsnummer(source) }
}

class EnhetsnummerWritingConverter : Converter<Enhetsnummer, String> {
    override fun convert(source: Enhetsnummer) = source.verdi.trimToNull()
}

class EnhetsnummerConverter : AttributeConverter<Enhetsnummer, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { Enhetsnummer(source) }
    override fun convertToDatabaseColumn(source: Enhetsnummer?) = source?.verdi.trimToNull()
}
