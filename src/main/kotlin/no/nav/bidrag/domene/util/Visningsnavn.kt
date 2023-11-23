package no.nav.bidrag.domene.util

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory
import com.fasterxml.jackson.module.kotlin.readValue
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import no.nav.bidrag.domene.enums.beregning.ResultatkodeBarnebidrag
import no.nav.bidrag.domene.enums.beregning.ResultatkodeForskudd
import no.nav.bidrag.domene.enums.beregning.ResultatkodeSærtilskudd
import no.nav.bidrag.domene.enums.diverse.Språk
import no.nav.bidrag.domene.enums.inntekt.Inntektsrapportering
import no.nav.bidrag.domene.enums.person.Bostatuskode
import no.nav.bidrag.domene.enums.person.Sivilstandskode
import java.net.URL

typealias VisningsnavnKodeMap = Map<String, Visningsnavn>
private val objectmapper = ObjectMapper(YAMLFactory()).findAndRegisterModules().registerKotlinModule()
private val visningsnavnCache: Map<String, VisningsnavnKodeMap> = emptyMap()
data class Visningsnavn(
    val intern: String,
    val bruker: Map<Språk, String>,
)
val Inntektsrapportering.visningsnavn get() = lastVisningsnavnFraFil("inntekttype.yaml")[name]
fun Inntektsrapportering.visningsnavnIntern(årstall: Int?) = "${visningsnavn?.intern} $årstall".trim()
val Sivilstandskode.visningsnavn get() = lastVisningsnavnFraFil("sivilstand.yaml")[name]
val Bostatuskode.visningsnavnForskudd get() = lastVisningsnavnFraFil("bostatus.yaml", "FORSKUDD")[name]
val Bostatuskode.visningsnavn get() = lastVisningsnavnFraFil("bostatus.yaml", "ELLERS")[name]
val ResultatkodeForskudd.visningsnavn get() = lastVisningsnavnFraFil("resultat.yaml", "FORSKUDD")[name]
val ResultatkodeBarnebidrag.visningsnavn get() = lastVisningsnavnFraFil("resultat.yaml", "BARNEBIDRAG")[name]
val ResultatkodeSærtilskudd.visningsnavn get() = lastVisningsnavnFraFil("resultat.yaml", "SÆRTILSKUDD")[name]

private fun lastVisningsnavnFraFil(filnavn: String, category: String? = null): VisningsnavnKodeMap {
    val fil = hentFil("/kodeverk/visningsnavn/$filnavn")
    return visningsnavnCache.getOrDefault(filnavn, if (category != null) lastVisningsnavnFraFilForNøkkel(fil, category) else objectmapper.readValue(fil))
}

private fun lastVisningsnavnFraFilForNøkkel(fil: URL, category: String): VisningsnavnKodeMap {
    val jsonNode: Map<String, VisningsnavnKodeMap> = objectmapper.readValue(fil)
    return jsonNode[category] ?: throw RuntimeException("Fant ikke visningsnavn for kategory $category i filsti $fil")
}

private fun hentFil(filsti: String) = Visningsnavn::class.java.getResource(filsti) ?: throw RuntimeException("Fant ingen fil på sti $filsti")
