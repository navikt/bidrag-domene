@file:Suppress("unused")

package no.nav.bidrag.domain.string

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import no.nav.bidrag.domain.util.trimToNull
import org.springframework.core.convert.converter.Converter

class OpprettetAv(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

class OpprettetAvReadingConverter : Converter<String, OpprettetAv> {
    override fun convert(source: String) = source.trimToNull()?.let { OpprettetAv(source) }
}

class OpprettetAvWritingConverter : Converter<OpprettetAv, String> {
    override fun convert(source: OpprettetAv) = source.verdi.trimToNull()
}

class OpprettetAvConverter : AttributeConverter<OpprettetAv, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { OpprettetAv(source) }
    override fun convertToDatabaseColumn(source: OpprettetAv?) = source?.verdi.trimToNull()
}
