package com.example.ncl_coding_challenge.model.remote

import com.example.ncl_coding_challenge.model.dto.ShipResponse
import retrofit2.Response
import retrofit2.http.GET

interface ShipService {

    @GET("SKY")
    suspend fun getSkyInfo() : Response<ShipResponse>

    @GET("BLISS")
    suspend fun getBlissInfo() : Response<ShipResponse>

    @GET("ESCAPE")
    suspend fun getEscapeInfo() : Response<ShipResponse>

}