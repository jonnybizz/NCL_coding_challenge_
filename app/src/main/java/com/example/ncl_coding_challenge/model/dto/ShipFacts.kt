package com.example.ncl_coding_challenge.model.dto

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ShipFacts(
    val passengerCapacity: String,
    val grossRegisterTonnage: String,
    val overallLength: String,
    val maxBeam: String,
    val draft: String,
    val engines: String,
    val cruiseSpeed: String,
    val crew: String,
    val inauguralDate: String,
    val remodeledDate: String? = ""
)