@file:Suppress("unused")

package no.nav.bidrag.domene.streng

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domene.felles.Verdiobjekt
import no.nav.bidrag.domene.util.trimToNull
import org.springframework.core.convert.converter.Converter

class Mellomnavn(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

class MellomnavnReadingConverter : Converter<String, Mellomnavn> {
    override fun convert(source: String) = source.trimToNull()?.let { Mellomnavn(source) }
}

class MellomnavnWritingConverter : Converter<Mellomnavn, String> {
    override fun convert(source: Mellomnavn) = source.verdi
}

class MellomnavnConverter : AttributeConverter<Mellomnavn, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { Mellomnavn(source) }
    override fun convertToDatabaseColumn(source: Mellomnavn?) = source?.verdi.trimToNull()
}
