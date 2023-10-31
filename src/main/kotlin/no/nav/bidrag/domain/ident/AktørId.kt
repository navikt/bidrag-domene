@file:Suppress("unused")

package no.nav.bidrag.domain.ident

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import no.nav.bidrag.domain.util.trimToNull
import org.springframework.core.convert.converter.Converter

class AktørId(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

class AktørIdReadingConverter : Converter<String, AktørId> {
    override fun convert(source: String) = source.trimToNull()?.let { AktørId(source) }
}

class AktørIdWritingConverter : Converter<AktørId, String> {
    override fun convert(source: AktørId) = source.verdi
}

class AktørIdConverter : AttributeConverter<AktørId, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { AktørId(source) }
    override fun convertToDatabaseColumn(source: AktørId?) = source?.verdi.trimToNull()
}
