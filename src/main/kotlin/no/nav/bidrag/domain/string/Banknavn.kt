@file:Suppress("unused")

package no.nav.bidrag.domain.string

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import no.nav.bidrag.domain.util.trimToNull
import org.springframework.core.convert.converter.Converter

class Banknavn(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

class BanknavnReadingConverter : Converter<String, Banknavn> {
    override fun convert(source: String) = source.trimToNull()?.let { Banknavn(source) }
}

class BanknavnWritingConverter : Converter<Banknavn, String> {
    override fun convert(source: Banknavn) = source.verdi
}

class BanknavnConverter : AttributeConverter<Banknavn, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { Banknavn(source) }
    override fun convertToDatabaseColumn(source: Banknavn?) = source?.verdi.trimToNull()
}
