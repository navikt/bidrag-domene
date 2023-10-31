@file:Suppress("unused")

package no.nav.bidrag.domain.bool

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.StringToBooleanConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter

class BegrensetTilgang(override val verdi: Boolean) : Verdiobjekt<Boolean>()

class BegrensetTilgangReadingConverter : Converter<String, BegrensetTilgang> {
    override fun convert(source: String) = BegrensetTilgang(StringToBooleanConverter().convert(source))
}

class BegrensetTilgangWritingConverter : Converter<BegrensetTilgang, Boolean> {
    override fun convert(source: BegrensetTilgang) = source.verdi
}

class BegrensetTilgangConverter : AttributeConverter<BegrensetTilgang, Boolean> {
    override fun convertToEntityAttribute(source: Boolean?) = source?.let { BegrensetTilgang(source) }
    override fun convertToDatabaseColumn(source: BegrensetTilgang?) = source?.verdi
}
