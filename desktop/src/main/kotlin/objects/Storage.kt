package objects

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

object Storage {
    val mapper: ObjectMapper = jacksonObjectMapper()
        .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)

    //Serialize object to string
    fun Any.asJson(): String = mapper.writeValueAsString(this)

    //Deserialize object from string
    inline fun <reified T> parseJson(save: String): T? =
        try {
            mapper.readValue(save, T::class.java)
        } catch (e: Exception) {
            null
        }

    //Deserialize collection of objects from string
    inline fun <reified T> parseJsonList(save: String): MutableList<T> =
        try {
            mapper.readerForListOf(T::class.java).readValue(save)
        } catch (e: Exception) {
            mutableListOf()
        }
}