package com.example.ncl_coding_challenge.ui.feature.shipinfo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.ncl_coding_challenge.R
import com.example.ncl_coding_challenge.databinding.FragmentShipBinding
import com.example.ncl_coding_challenge.ui.utils.configureButton
import com.example.ncl_coding_challenge.ui.utils.handleIsEnabled
import com.example.ncl_coding_challenge.ui.utils.handleVisibility
import com.example.ncl_coding_challenge.ui.utils.showToast
import com.example.ncl_coding_challenge.utils.Resource
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ShipInfoFragment : Fragment() {

    private var _binding: FragmentShipBinding? = null
    private val binding: FragmentShipBinding get() = _binding!!

    private val viewModel: ShipViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentShipBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            containerSky.apply {
                btnAction.configureButton(getString(R.string.sky_btn_text)) {
                    viewModel.getSkyInfo().observe(viewLifecycleOwner) { resource ->
                        progressBar.handleVisibility(resource)
                        btnAction.handleIsEnabled(resource)
                        when (resource) {
                            is Resource.Loading -> {
                                // no-op
                            }
                            is Resource.Success -> {
                                tvShipName.text = resource.data.shipName
                                tvPassengerCapacity.text = resource.data.shipFacts.passengerCapacity
                                tvCrew.text = resource.data.shipFacts.crew
                                tvInauguralDate.text = resource.data.shipFacts.inauguralDate
                            }
                            is Resource.Error -> {
                                showToast(resource.message)
                            }
                        }
                    }
                }
            }
            containerBliss.apply {
                btnAction.configureButton(getString(R.string.bliss_btn_text)) {
                    viewModel.getBlissInfo().observe(viewLifecycleOwner) { resource ->
                        progressBar.handleVisibility(resource)
                        btnAction.handleIsEnabled(resource)
                        when (resource) {
                            is Resource.Loading -> {
                                // no-op
                            }
                            is Resource.Success -> {
                                tvShipName.text = resource.data.shipName
                                tvPassengerCapacity.text = resource.data.shipFacts.passengerCapacity
                                tvCrew.text = resource.data.shipFacts.crew
                                tvInauguralDate.text = resource.data.shipFacts.inauguralDate
                            }
                            is Resource.Error -> {
                                showToast(resource.message)
                            }
                            else -> {
                                showToast(getString(R.string.unexpected_error))
                            }
                        }
                    }
                }
            }
            containerEscape.apply {
                btnAction.configureButton(getString(R.string.escape_btn_text)) {
                    viewModel.getEscapeInfo().observe(viewLifecycleOwner) { resource ->
                        progressBar.handleVisibility(resource)
                        btnAction.handleIsEnabled(resource)
                        when (resource) {
                            is Resource.Loading -> {
                                // no-op
                            }
                            is Resource.Success -> {
                                tvShipName.text = resource.data.shipName
                                tvPassengerCapacity.text = resource.data.shipFacts.passengerCapacity
                                tvCrew.text = resource.data.shipFacts.crew
                                tvInauguralDate.text = resource.data.shipFacts.inauguralDate
                            }
                            is Resource.Error -> {
                                showToast(resource.message)
                            }
                        }
                    }
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}