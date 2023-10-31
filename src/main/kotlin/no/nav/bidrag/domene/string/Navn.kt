@file:Suppress("unused")

package no.nav.bidrag.domene.string

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domene.felles.Verdiobjekt
import no.nav.bidrag.domene.util.trimToNull
import org.springframework.core.convert.converter.Converter

class Navn(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

class NavnReadingConverter : Converter<String, Navn> {
    override fun convert(source: String) = source.trimToNull()?.let { Navn(source) }
}

class NavnWritingConverter : Converter<Navn, String> {
    override fun convert(source: Navn) = source.verdi
}

class NavnConverter : AttributeConverter<Navn, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { Navn(source) }
    override fun convertToDatabaseColumn(source: Navn?) = source?.verdi.trimToNull()
}
