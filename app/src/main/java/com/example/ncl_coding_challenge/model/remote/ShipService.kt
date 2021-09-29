package com.example.ncl_coding_challenge.model.remote

import com.example.ncl_coding_challenge.model.dto.ShipResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ShipService {

    @GET("{ship}")
    suspend fun getShipInfo(
        @Path("ship") shipName : String,
    ) : Response<ShipResponse>

}