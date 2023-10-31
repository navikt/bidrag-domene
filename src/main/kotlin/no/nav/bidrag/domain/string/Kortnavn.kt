@file:Suppress("unused")

package no.nav.bidrag.domain.string

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import no.nav.bidrag.domain.util.trimToNull
import org.springframework.core.convert.converter.Converter

class Kortnavn(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

class KortnavnReadingConverter : Converter<String, Kortnavn> {
    override fun convert(source: String) = source.trimToNull()?.let { Kortnavn(source) }
}

class KortnavnWritingConverter : Converter<Kortnavn, String> {
    override fun convert(source: Kortnavn) = source.verdi
}

class KortnavnConverter : AttributeConverter<Kortnavn, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { Kortnavn(source) }
    override fun convertToDatabaseColumn(source: Kortnavn?) = source?.verdi.trimToNull()
}
