@file:Suppress("unused")

package no.nav.bidrag.domene.sak.bool

import no.nav.bidrag.domene.felles.StringToBooleanConverter
import no.nav.bidrag.domene.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter

@Deprecated("Bruk boolean i stedet")
class LevdeAdskilt(override val verdi: Boolean) : Verdiobjekt<Boolean>()

@Deprecated("Erstatt LevdeAdskilt med boolean")
class LevdeAdskiltReadingConverter : Converter<String, LevdeAdskilt> {
    override fun convert(source: String) = LevdeAdskilt(StringToBooleanConverter().convert(source))
}

@Deprecated("Erstatt LevdeAdskilt med boolean")
class LevdeAdskiltWritingConverter : Converter<LevdeAdskilt, Boolean> {
    override fun convert(source: LevdeAdskilt) = source.verdi
}
