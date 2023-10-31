@file:Suppress("unused")

package no.nav.bidrag.domain.bool

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.StringToBooleanConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter

class Inhabilitet(override val verdi: Boolean) : Verdiobjekt<Boolean>()

class InhabilitetReadingConverter : Converter<String, Inhabilitet> {
    override fun convert(source: String) = Inhabilitet(StringToBooleanConverter().convert(source))
}

class InhabilitetWritingConverter : Converter<Inhabilitet, Boolean> {
    override fun convert(source: Inhabilitet) = source.verdi
}

class InhabilitetConverter : AttributeConverter<Inhabilitet, Boolean> {
    override fun convertToEntityAttribute(source: Boolean?) = source?.let { Inhabilitet(source) }
    override fun convertToDatabaseColumn(source: Inhabilitet?) = source?.verdi
}
