package org.acme.classes

import kotlinx.serialization.Serializable

@Serializable
class Packet(val type: String, val data: String = "")