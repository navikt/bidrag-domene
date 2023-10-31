@file:Suppress("unused")

package no.nav.bidrag.domain.string

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import no.nav.bidrag.domain.util.trimToNull
import org.springframework.core.convert.converter.Converter

class NorskKontonummer(override val verdi: String) : Verdiobjekt<String>() {
    override fun gyldig(): Boolean {
        return verdi.isNotBlank()
    }
}

class NorskKontonummerReadingConverter : Converter<String, NorskKontonummer> {
    override fun convert(source: String) = source.trimToNull()?.let { NorskKontonummer(source) }
}

class NorskKontonummerWritingConverter : Converter<NorskKontonummer, String> {
    override fun convert(source: NorskKontonummer) = source.verdi
}

class NorskKontonummerConverter : AttributeConverter<NorskKontonummer, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { NorskKontonummer(source) }
    override fun convertToDatabaseColumn(source: NorskKontonummer?) = source?.verdi.trimToNull()
}
