package com.example.ncl_coding_challenge.model.repository

import com.example.ncl_coding_challenge.model.remote.ShipService
import com.example.ncl_coding_challenge.utils.Resource
import kotlinx.coroutines.flow.flow

class ShipRepository(private val shipService: ShipService) {

    fun getSkyInfo(shipName : String) = flow {
        emit(Resource.Loading)
        val resource = try {
            val response = shipService.getShipInfo(shipName)
            if (response.isSuccessful && response.body() != null) {
                Resource.Success(response.body()!!)
            } else {
                Resource.Error("Failed to get sky info.")
            }
        } catch (ex: Exception) {
            Resource.Error(ex.toString())
        }
        emit(resource)
    }

    fun getBlissInfo(shipName: String) = flow {
        emit(Resource.Loading)
        val resource = try {
            val response = shipService.getShipInfo(shipName)
            if (response.isSuccessful && response.body() != null) {
                Resource.Success(response.body()!!)
            } else {
                Resource.Error("Failed to get bliss info.")
            }
        } catch (ex: Exception) {
            Resource.Error(ex.toString())
        }
        emit(resource)
    }

    fun getEscapeInfo(shipName: String) = flow {
        emit(Resource.Loading)
        val resource = try {
            val response = shipService.getShipInfo(shipName)
            if (response.isSuccessful && response.body() != null) {
                Resource.Success(response.body()!!)
            } else {
                Resource.Error("Failed to get escape info.")
            }
        } catch (ex: Exception) {
            Resource.Error(ex.toString())
        }
        emit(resource)
    }
}