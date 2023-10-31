@file:Suppress("unused")

package no.nav.bidrag.domene.streng

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domene.felles.Verdiobjekt
import no.nav.bidrag.domene.util.trimToNull
import org.springframework.core.convert.converter.Converter

class Tema(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

class TemaReadingConverter : Converter<String, Tema> {
    override fun convert(source: String) = source.trimToNull()?.let { Tema(source) }
}

class TemaWritingConverter : Converter<Tema, String> {
    override fun convert(source: Tema) = source.verdi
}

class TemaConverter : AttributeConverter<Tema, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { Tema(source) }
    override fun convertToDatabaseColumn(source: Tema?) = source?.verdi.trimToNull()
}

val TEMA_BIDRAG = Tema("BID")
