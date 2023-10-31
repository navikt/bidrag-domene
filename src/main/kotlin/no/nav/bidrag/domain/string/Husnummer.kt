@file:Suppress("unused")

package no.nav.bidrag.domain.string

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import no.nav.bidrag.domain.util.trimToNull
import org.springframework.core.convert.converter.Converter

class Husnummer(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

class HusnummerReadingConverter : Converter<String, Husnummer> {
    override fun convert(source: String) = source.trimToNull()?.let { Husnummer(source) }
}

class HusnummerWritingConverter : Converter<Husnummer, String> {
    override fun convert(source: Husnummer) = source.verdi
}

class HusnummerConverter : AttributeConverter<Husnummer, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { Husnummer(source) }
    override fun convertToDatabaseColumn(source: Husnummer?) = source?.verdi.trimToNull()
}
