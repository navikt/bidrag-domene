@file:Suppress("unused")

package no.nav.bidrag.domene.string

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domene.felles.Verdiobjekt
import no.nav.bidrag.domene.util.trimToNull
import org.springframework.core.convert.converter.Converter

class Bankkode(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

class BankkodeReadingConverter : Converter<String, Bankkode> {
    override fun convert(source: String) = source.trimToNull()?.let { Bankkode(source) }
}

class BankkodeWritingConverter : Converter<Bankkode, String> {
    override fun convert(source: Bankkode) = source.verdi
}

class BankkodeConverter : AttributeConverter<Bankkode, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { Bankkode(source) }
    override fun convertToDatabaseColumn(source: Bankkode?) = source?.verdi.trimToNull()
}
