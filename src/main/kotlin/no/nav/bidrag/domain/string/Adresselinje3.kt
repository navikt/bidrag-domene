@file:Suppress("unused")

package no.nav.bidrag.domain.string

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import no.nav.bidrag.domain.util.trimToNull
import org.springframework.core.convert.converter.Converter

class Adresselinje3(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

class Adresselinje3ReadingConverter : Converter<String, Adresselinje3> {
    override fun convert(source: String) = source.trimToNull()?.let { Adresselinje3(source) }
}

class Adresselinje3WritingConverter : Converter<Adresselinje3, String> {
    override fun convert(source: Adresselinje3) = source.verdi
}

class Adresselinje3Converter : AttributeConverter<Adresselinje3, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { Adresselinje3(source) }
    override fun convertToDatabaseColumn(source: Adresselinje3?) = source?.verdi.trimToNull()
}
