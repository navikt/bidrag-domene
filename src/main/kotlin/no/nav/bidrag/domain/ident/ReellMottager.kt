@file:Suppress("unused")

package no.nav.bidrag.domain.ident

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import no.nav.bidrag.domain.util.trimToNull
import org.springframework.core.convert.converter.Converter

class ReellMottager(override val verdi: String) : Verdiobjekt<String>() {

    override fun gyldig(): Boolean {
        return PersonIdent(verdi).gyldig() || SamhandlerId(verdi).gyldig()
    }

    fun erPersonIdent() = PersonIdent(verdi).gyldig()

    fun erSamhandlerId() = SamhandlerId(verdi).gyldig()

    fun personIdent() = if (erPersonIdent()) PersonIdent(verdi) else null

    fun samhandlerId() = if (erSamhandlerId()) SamhandlerId(verdi) else null
}

class ReellMottagerReadingConverter : Converter<String, ReellMottager> {
    override fun convert(source: String) = source.trimToNull()?.let { ReellMottager(source) }
}

class ReellMottagerWritingConverter : Converter<ReellMottager, String> {

    override fun convert(source: ReellMottager) = source.verdi.trimToNull()
}

class ReellMottagerConverter : AttributeConverter<ReellMottager, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { ReellMottager(source) }
    override fun convertToDatabaseColumn(source: ReellMottager?) = source?.verdi.trimToNull()
}
