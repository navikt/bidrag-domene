@file:Suppress("unused")

package no.nav.bidrag.domain.ident

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import no.nav.bidrag.domain.util.trimToNull
import org.springframework.core.convert.converter.Converter

class TssId(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

class TssIdReadingConverter : Converter<String, TssId> {
    override fun convert(source: String) = source.trimToNull()?.let { TssId(source) }
}

class TssIdWritingConverter : Converter<TssId, String> {
    override fun convert(source: TssId) = source.verdi
}

class TssIdConverter : AttributeConverter<TssId, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { TssId(source) }
    override fun convertToDatabaseColumn(source: TssId?) = source?.verdi.trimToNull()
}
