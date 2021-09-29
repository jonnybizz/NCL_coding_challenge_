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
    fun getSkyInfo() = shipRepository.getSkyInfo().asLiveData(dispatcher)

    fun getBlissInfo() = shipRepository.getBlissInfo().asLiveData(dispatcher)

    fun getEscapeInfo() = shipRepository.getEscapeInfo().asLiveData(dispatcher)
}