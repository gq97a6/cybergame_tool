package classes

import availableOptions
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable

@Serializable
data class Option(
    val id: String = "",
    @JsonIgnore
    var cost: Int = 0,
    @JsonIgnore
    var name: String = "",
    @JsonIgnore
    var des: String = "",
    @get:JsonProperty("isRecommended")
    var isRecommended: Boolean = false,
    @get:JsonProperty("isOwned")
    var isOwned: Boolean = false,
    @get:JsonProperty("isSelected")
    var isSelected: Boolean = false,
    @get:JsonProperty("isMarked")
    var isMarked: Boolean = false
) {
    fun copyParams() = availableOptions.find { it.id == id }?.let {
        cost = it.cost
        name = it.name
        des = it.des
    }
}