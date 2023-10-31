@file:Suppress("unused")

package no.nav.bidrag.domain.string

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import no.nav.bidrag.domain.util.trimToNull
import org.springframework.core.convert.converter.Converter

class Enhetstype(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

class EnhetstypeReadingConverter : Converter<String, Enhetstype> {
    override fun convert(source: String) = source.trimToNull()?.let { Enhetstype(source) }
}

class EnhetstypeWritingConverter : Converter<Enhetstype, String> {
    override fun convert(source: Enhetstype) = source.verdi
}

class EnhetstypeConverter : AttributeConverter<Enhetstype, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { Enhetstype(source) }
    override fun convertToDatabaseColumn(source: Enhetstype?) = source?.verdi.trimToNull()
}
