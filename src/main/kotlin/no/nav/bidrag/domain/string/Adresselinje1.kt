@file:Suppress("unused")

package no.nav.bidrag.domain.string

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import no.nav.bidrag.domain.util.trimToNull
import org.springframework.core.convert.converter.Converter

class Adresselinje1(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

class Adresselinje1ReadingConverter : Converter<String, Adresselinje1> {
    override fun convert(source: String) = source.trimToNull()?.let { Adresselinje1(source) }
}

class Adresselinje1WritingConverter : Converter<Adresselinje1, String> {
    override fun convert(source: Adresselinje1) = source.verdi
}

class Adresselinje1Converter : AttributeConverter<Adresselinje1, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { Adresselinje1(source) }
    override fun convertToDatabaseColumn(source: Adresselinje1?) = source?.verdi.trimToNull()
}
