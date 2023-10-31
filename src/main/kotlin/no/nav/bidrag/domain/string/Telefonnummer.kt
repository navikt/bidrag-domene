@file:Suppress("unused")

package no.nav.bidrag.domain.string

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import no.nav.bidrag.domain.util.trimToNull
import org.springframework.core.convert.converter.Converter

class Telefonnummer(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

class TelefonnummerReadingConverter : Converter<String, Telefonnummer> {
    override fun convert(source: String) = source.trimToNull()?.let { Telefonnummer(source) }
}

class TelefonnummerWritingConverter : Converter<Telefonnummer, String> {
    override fun convert(source: Telefonnummer) = source.verdi
}

class TelefonnummerConverter : AttributeConverter<Telefonnummer, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { Telefonnummer(source) }
    override fun convertToDatabaseColumn(source: Telefonnummer?) = source?.verdi.trimToNull()
}
