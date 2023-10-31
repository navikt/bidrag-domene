@file:Suppress("unused")

package no.nav.bidrag.domain.string

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import no.nav.bidrag.domain.util.trimToNull
import org.springframework.core.convert.converter.Converter

class Husbokstav(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

class HusbokstavReadingConverter : Converter<String, Husbokstav> {
    override fun convert(source: String) = source.trimToNull()?.let { Husbokstav(source) }
}

class HusbokstavWritingConverter : Converter<Husbokstav, String> {
    override fun convert(source: Husbokstav) = source.verdi
}

class HusbokstavConverter : AttributeConverter<Husbokstav, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { Husbokstav(source) }
    override fun convertToDatabaseColumn(source: Husbokstav?) = source?.verdi.trimToNull()
}
