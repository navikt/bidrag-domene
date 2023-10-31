@file:Suppress("unused")

package no.nav.bidrag.domain.string

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import no.nav.bidrag.domain.util.trimToNull
import org.springframework.core.convert.converter.Converter

class Kontaktperson(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

class KontaktpersonReadingConverter : Converter<String, Kontaktperson> {
    override fun convert(source: String) = source.trimToNull()?.let { Kontaktperson(source) }
}

class KontaktpersonWritingConverter : Converter<Kontaktperson, String> {
    override fun convert(source: Kontaktperson) = source.verdi
}

class KontaktpersonConverter : AttributeConverter<Kontaktperson, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { Kontaktperson(source) }
    override fun convertToDatabaseColumn(source: Kontaktperson?) = source?.verdi.trimToNull()
}
