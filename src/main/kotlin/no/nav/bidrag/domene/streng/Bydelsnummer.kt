@file:Suppress("unused")

package no.nav.bidrag.domene.streng

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domene.felles.Verdiobjekt
import no.nav.bidrag.domene.util.trimToNull
import org.springframework.core.convert.converter.Converter

class Bydelsnummer(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

class BydelsnummerReadingConverter : Converter<String, Bydelsnummer> {
    override fun convert(source: String) = source.trimToNull()?.let { Bydelsnummer(source) }
}

class BydelsnummerWritingConverter : Converter<Bydelsnummer, String> {
    override fun convert(source: Bydelsnummer) = source.verdi
}

class BydelsnummerConverter : AttributeConverter<Bydelsnummer, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { Bydelsnummer(source) }
    override fun convertToDatabaseColumn(source: Bydelsnummer?) = source?.verdi.trimToNull()
}
