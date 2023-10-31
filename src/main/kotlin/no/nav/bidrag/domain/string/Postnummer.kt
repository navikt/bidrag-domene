@file:Suppress("unused")

package no.nav.bidrag.domain.string

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import no.nav.bidrag.domain.util.trimToNull
import org.springframework.core.convert.converter.Converter

class Postnummer(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

class PostnummerReadingConverter : Converter<String, Postnummer> {
    override fun convert(source: String) = source.trimToNull()?.let { Postnummer(source) }
}

class PostnummerWritingConverter : Converter<Postnummer, String> {
    override fun convert(source: Postnummer) = source.verdi
}

class PostnummerConverter : AttributeConverter<Postnummer, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { Postnummer(source) }
    override fun convertToDatabaseColumn(source: Postnummer?) = source?.verdi.trimToNull()
}
