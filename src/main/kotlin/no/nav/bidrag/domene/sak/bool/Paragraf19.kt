@file:Suppress("unused")

package no.nav.bidrag.domene.sak.bool

import no.nav.bidrag.domene.felles.StringToBooleanConverter
import no.nav.bidrag.domene.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter

@Deprecated("Bruk boolean i stedet")
class Paragraf19(override val verdi: Boolean) : Verdiobjekt<Boolean>()

@Deprecated("Erstatt Paragraf19 med boolean")
class Paragraf19ReadingConverter : Converter<String, Paragraf19> {
    override fun convert(source: String) = Paragraf19(StringToBooleanConverter().convert(source))
}

@Deprecated("Erstatt Paragraf19 med boolean")
class Paragraf19WritingConverter : Converter<Paragraf19, Boolean> {
    override fun convert(source: Paragraf19) = source.verdi
}
