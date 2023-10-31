@file:Suppress("unused")

package no.nav.bidrag.domain.string

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import no.nav.bidrag.domain.util.trimToNull
import org.springframework.core.convert.converter.Converter

class FfuReferansenr(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

class FfuReferansenrReadingConverter : Converter<String, FfuReferansenr> {
    override fun convert(source: String) = source.trimToNull()?.let { FfuReferansenr(source) }
}

class FfuReferansenrWritingConverter : Converter<FfuReferansenr, String> {
    override fun convert(source: FfuReferansenr) = source.verdi.trimToNull()
}

class FfuReferansenrConverter : AttributeConverter<FfuReferansenr, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { FfuReferansenr(source) }
    override fun convertToDatabaseColumn(source: FfuReferansenr?) = source?.verdi.trimToNull()
}
