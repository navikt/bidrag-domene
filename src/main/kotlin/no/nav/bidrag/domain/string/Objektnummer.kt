@file:Suppress("unused")

package no.nav.bidrag.domain.string

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import no.nav.bidrag.domain.util.trimToNull
import org.springframework.core.convert.converter.Converter

class Objektnummer(override val verdi: String) : Verdiobjekt<String>() {

    override fun gyldig() = verdi.matches(OBJEKTNUMMER_REGEX)

    companion object {
        private val OBJEKTNUMMER_REGEX = Regex("^\\d{2}$")
    }
}

class ObjektnummerReadingConverter : Converter<String, Objektnummer> {
    override fun convert(source: String) = source.trimToNull()?.let { Objektnummer(source) }
}

class ObjektnummerWritingConverter : Converter<Objektnummer, String> {
    override fun convert(source: Objektnummer) = source.verdi.trimToNull()
}

class ObjektnummerConverter : AttributeConverter<Objektnummer, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { Objektnummer(source) }
    override fun convertToDatabaseColumn(source: Objektnummer?) = source?.verdi.trimToNull()
}
