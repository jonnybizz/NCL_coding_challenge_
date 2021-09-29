package com.example.ncl_coding_challenge.ui.feature.shipinfo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.ncl_coding_challenge.model.repository.ShipRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Inject

@HiltViewModel
class ShipViewModel @Inject constructor(
    private val shipRepository: ShipRepository,
    private val dispatcher: CoroutineDispatcher
) : ViewModel() {
    fun getSkyInfo(shipName : String) = shipRepository.getSkyInfo(shipName).asLiveData(dispatcher)

    fun getBlissInfo(shipName: String) = shipRepository.getBlissInfo(shipName).asLiveData(dispatcher)

    fun getEscapeInfo(shipName: String) = shipRepository.getEscapeInfo(shipName).asLiveData(dispatcher)
}