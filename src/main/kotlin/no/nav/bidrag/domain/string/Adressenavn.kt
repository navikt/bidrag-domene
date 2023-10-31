@file:Suppress("unused")

package no.nav.bidrag.domain.string

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import no.nav.bidrag.domain.util.trimToNull
import org.springframework.core.convert.converter.Converter

class Adressenavn(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

class AdressenavnReadingConverter : Converter<String, Adressenavn> {
    override fun convert(source: String) = source.trimToNull()?.let { Adressenavn(source) }
}

class AdressenavnWritingConverter : Converter<Adressenavn, String> {
    override fun convert(source: Adressenavn) = source.verdi
}

class AdressenavnConverter : AttributeConverter<Adressenavn, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { Adressenavn(source) }
    override fun convertToDatabaseColumn(source: Adressenavn?) = source?.verdi.trimToNull()
}
