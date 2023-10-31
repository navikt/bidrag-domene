@file:Suppress("unused")

package no.nav.bidrag.domain.string

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import no.nav.bidrag.domain.util.trimToNull
import org.springframework.core.convert.converter.Converter

class Resultat(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

class ResultatReadingConverter : Converter<String, Resultat> {
    override fun convert(source: String) = source.trimToNull()?.let { Resultat(source) }
}

class ResultatWritingConverter : Converter<Resultat, String> {
    override fun convert(source: Resultat) = source.verdi.trimToNull()
}

class ResultatConverter : AttributeConverter<Resultat, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { Resultat(source) }
    override fun convertToDatabaseColumn(source: Resultat?) = source?.verdi.trimToNull()
}
