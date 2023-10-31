@file:Suppress("unused")

package no.nav.bidrag.domain.string

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import no.nav.bidrag.domain.util.trimToNull
import org.springframework.core.convert.converter.Converter

class Landkode3(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig() = verdi.length == 3
}

class Landkode3ReadingConverter : Converter<String, Landkode3> {
    override fun convert(source: String) = source.trimToNull()?.let { Landkode3(source) }
}

class Landkode3WritingConverter : Converter<Landkode3, String> {
    override fun convert(source: Landkode3) = source.verdi
}

class Landkode3Converter : AttributeConverter<Landkode3, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { Landkode3(source) }
    override fun convertToDatabaseColumn(source: Landkode3?) = source?.verdi.trimToNull()
}
