package org.acme.classes

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient

@Serializable
data class Option(
    val id: String = "",
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
)