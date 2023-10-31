@file:Suppress("unused")

package no.nav.bidrag.domain.ident

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import no.nav.bidrag.domain.util.trimToNull
import org.springframework.core.convert.converter.Converter

class OffentligId(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

class OffentligIdReadingConverter : Converter<String, OffentligId> {
    override fun convert(source: String) = source.trimToNull()?.let { OffentligId(source) }
}

class OffentligIdWritingConverter : Converter<OffentligId, String> {
    override fun convert(source: OffentligId) = source.verdi
}

class OffentligIdConverter : AttributeConverter<OffentligId, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { OffentligId(source) }
    override fun convertToDatabaseColumn(source: OffentligId?) = source?.verdi.trimToNull()
}
