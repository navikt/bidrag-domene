@file:Suppress("unused")

package no.nav.bidrag.domain.string

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import no.nav.bidrag.domain.util.trimToNull
import org.springframework.core.convert.converter.Converter

class Landnavn(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

class LandnavnReadingConverter : Converter<String, Landnavn> {
    override fun convert(source: String) = source.trimToNull()?.let { Landnavn(source) }
}

class LandnavnWritingConverter : Converter<Landnavn, String> {
    override fun convert(source: Landnavn) = source.verdi
}

class LandnavnConverter : AttributeConverter<Landnavn, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { Landnavn(source) }
    override fun convertToDatabaseColumn(source: Landnavn?) = source?.verdi.trimToNull()
}
