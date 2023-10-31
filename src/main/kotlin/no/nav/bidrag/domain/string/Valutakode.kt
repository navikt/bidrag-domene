@file:Suppress("unused")

package no.nav.bidrag.domain.string

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import no.nav.bidrag.domain.util.trimToNull
import org.springframework.core.convert.converter.Converter

class Valutakode(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

class ValutakodeReadingConverter : Converter<String, Valutakode> {
    override fun convert(source: String) = source.trimToNull()?.let { Valutakode(source) }
}

class ValutakodeWritingConverter : Converter<Valutakode, String> {
    override fun convert(source: Valutakode) = source.verdi
}

class ValutakodeConverter : AttributeConverter<Valutakode, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { Valutakode(source) }
    override fun convertToDatabaseColumn(source: Valutakode?) = source?.verdi.trimToNull()
}
