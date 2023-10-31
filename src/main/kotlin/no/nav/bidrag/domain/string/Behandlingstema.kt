@file:Suppress("unused")

package no.nav.bidrag.domain.string

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import no.nav.bidrag.domain.util.trimToNull
import org.springframework.core.convert.converter.Converter

class Behandlingstema(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

class BehandlingstemaReadingConverter : Converter<String, Behandlingstema> {
    override fun convert(source: String) = source.trimToNull()?.let { Behandlingstema(source) }
}

class BehandlingstemaWritingConverter : Converter<Behandlingstema, String> {
    override fun convert(source: Behandlingstema) = source.verdi
}

class BehandlingstemaConverter : AttributeConverter<Behandlingstema, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { Behandlingstema(source) }
    override fun convertToDatabaseColumn(source: Behandlingstema?) = source?.verdi.trimToNull()
}
