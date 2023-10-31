@file:Suppress("unused")

package no.nav.bidrag.domain.ident

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import no.nav.bidrag.domain.util.trimToNull
import org.springframework.core.convert.converter.Converter

class NavCallId(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

class NavCallIdReadingConverter : Converter<String, NavCallId> {
    override fun convert(source: String) = source.trimToNull()?.let { NavCallId(source) }
}

class NavCallIdWritingConverter : Converter<NavCallId, String> {
    override fun convert(source: NavCallId) = source.verdi.trimToNull()
}

class NavCallIdConverter : AttributeConverter<NavCallId, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { NavCallId(source) }
    override fun convertToDatabaseColumn(source: NavCallId?) = source?.verdi.trimToNull()
}
