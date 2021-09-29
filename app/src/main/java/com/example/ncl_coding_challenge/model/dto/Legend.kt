package com.example.ncl_coding_challenge.model.dto

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Legend(
    val legendWeight: String,
    val name: String,
    val description: String,
    val legendImageLink: String
)
