@file:Suppress("unused")

package no.nav.bidrag.domain.string

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import no.nav.bidrag.domain.util.trimToNull
import org.springframework.core.convert.converter.Converter

class Kommunenummer(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

class KommunenummerReadingConverter : Converter<String, Kommunenummer> {
    override fun convert(source: String) = source.trimToNull()?.let { Kommunenummer(source) }
}

class KommunenummerWritingConverter : Converter<Kommunenummer, String> {
    override fun convert(source: Kommunenummer) = source.verdi
}

class KommunenummerConverter : AttributeConverter<Kommunenummer, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { Kommunenummer(source) }
    override fun convertToDatabaseColumn(source: Kommunenummer?) = source?.verdi.trimToNull()
}
