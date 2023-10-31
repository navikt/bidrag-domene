@file:Suppress("unused")

package no.nav.bidrag.domene.streng

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domene.felles.Verdiobjekt
import no.nav.bidrag.domene.util.trimToNull
import org.springframework.core.convert.converter.Converter

class Bruksenhetsnummer(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

class BruksenhetsnummerReadingConverter : Converter<String, Bruksenhetsnummer> {
    override fun convert(source: String) = source.trimToNull()?.let { Bruksenhetsnummer(source) }
}

class BruksenhetsnummerWritingConverter : Converter<Bruksenhetsnummer, String> {
    override fun convert(source: Bruksenhetsnummer) = source.verdi
}

class BruksenhetsnummerConverter : AttributeConverter<Bruksenhetsnummer, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { Bruksenhetsnummer(source) }
    override fun convertToDatabaseColumn(source: Bruksenhetsnummer?) = source?.verdi.trimToNull()
}
