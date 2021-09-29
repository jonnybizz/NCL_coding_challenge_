package com.example.ncl_coding_challenge.model.dto

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OnboardPhone(
    val name: String,
    val mobileName: String,
    val token: String,
    val phone: String,
    val locationSharingEnabled: Boolean,
    val venueCode: String
)