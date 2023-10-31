@file:Suppress("unused")

package no.nav.bidrag.domain.string

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import no.nav.bidrag.domain.util.trimToNull
import org.springframework.core.convert.converter.Converter

class GeografiskTilknytning(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

class GeografiskTilknytningReadingConverter : Converter<String, GeografiskTilknytning> {
    override fun convert(source: String) = source.trimToNull()?.let { GeografiskTilknytning(source) }
}

class GeografiskTilknytningWritingConverter : Converter<GeografiskTilknytning, String> {
    override fun convert(source: GeografiskTilknytning) = source.verdi
}

class GeografiskTilknytningConverter : AttributeConverter<GeografiskTilknytning, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { GeografiskTilknytning(source) }
    override fun convertToDatabaseColumn(source: GeografiskTilknytning?) = source?.verdi.trimToNull()
}
