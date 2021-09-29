package com.example.ncl_coding_challenge.model.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import java.util.*

@JsonClass(generateAdapter = true)
data class ShipResponse(
    val shipName: String,
    val code: String,
    val allowedGuestCount: Int,
    val shipDescription: String,
    val accessCode: String,
    val wesbCode: String,
    val recategorizationDate: String,
    val recategorizationDefaultView: String,
    val name: String,
    val legends: List<Legend>,
    val shipFacts: ShipFacts,
    val whatsIncluded: List<String>,
    val highlights: List<String>,
    val features: String,
    val imagePath: List<String>,
    val bgeImagePath: String,
    @get:Json(name = "onboard_phones")
    val onboardPhones: List<OnboardPhone>
)
