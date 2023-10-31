@file:Suppress("unused")

package no.nav.bidrag.domain.string

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import no.nav.bidrag.domain.util.trimToNull
import org.springframework.core.convert.converter.Converter

class Adresselinje2(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

class Adresselinje2ReadingConverter : Converter<String, Adresselinje2> {
    override fun convert(source: String) = source.trimToNull()?.let { Adresselinje2(source) }
}

class Adresselinje2WritingConverter : Converter<Adresselinje2, String> {
    override fun convert(source: Adresselinje2) = source.verdi
}

class Adresselinje2Converter : AttributeConverter<Adresselinje2, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { Adresselinje2(source) }
    override fun convertToDatabaseColumn(source: Adresselinje2?) = source?.verdi.trimToNull()
}
