@file:Suppress("unused")

package no.nav.bidrag.domain.ident

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import no.nav.bidrag.domain.util.trimToNull
import org.springframework.core.convert.converter.Converter

class SaksbehandlerId(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

class SaksbehandlerIdReadingConverter : Converter<String, SaksbehandlerId> {
    override fun convert(source: String) = source.trimToNull()?.let { SaksbehandlerId(source) }
}

class SaksbehandlerIdWritingConverter : Converter<SaksbehandlerId, String> {
    override fun convert(source: SaksbehandlerId) = source.verdi
}

class SaksbehandlerIdConverter : AttributeConverter<SaksbehandlerId, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { SaksbehandlerId(source) }
    override fun convertToDatabaseColumn(source: SaksbehandlerId?) = source?.verdi.trimToNull()
}
