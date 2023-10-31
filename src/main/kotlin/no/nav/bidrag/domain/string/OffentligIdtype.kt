@file:Suppress("unused")

package no.nav.bidrag.domene.string

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domene.felles.Verdiobjekt
import no.nav.bidrag.domene.util.trimToNull
import org.springframework.core.convert.converter.Converter

class OffentligIdtype(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

class OffentligIdtypeReadingConverter : Converter<String, OffentligIdtype> {
    override fun convert(source: String) = source.trimToNull()?.let { OffentligIdtype(source) }
}

class OffentligIdtypeWritingConverter : Converter<OffentligIdtype, String> {
    override fun convert(source: OffentligIdtype) = source.verdi
}

class OffentligIdtypeConverter : AttributeConverter<OffentligIdtype, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { OffentligIdtype(source) }
    override fun convertToDatabaseColumn(source: OffentligIdtype?) = source?.verdi.trimToNull()
}
