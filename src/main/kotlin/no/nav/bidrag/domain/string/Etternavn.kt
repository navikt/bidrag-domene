@file:Suppress("unused")

package no.nav.bidrag.domain.string

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import no.nav.bidrag.domain.util.trimToNull
import org.springframework.core.convert.converter.Converter

class Etternavn(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

class EtternavnReadingConverter : Converter<String, Etternavn> {
    override fun convert(source: String) = source.trimToNull()?.let { Etternavn(source) }
}

class EtternavnWritingConverter : Converter<Etternavn, String> {
    override fun convert(source: Etternavn) = source.verdi
}

class EtternavnConverter : AttributeConverter<Etternavn, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { Etternavn(source) }
    override fun convertToDatabaseColumn(source: Etternavn?) = source?.verdi.trimToNull()
}
