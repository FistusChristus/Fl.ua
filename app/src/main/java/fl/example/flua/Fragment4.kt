package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import fl.example.flua.R
import fl.example.flua.databinding.Fragment4Binding

class Fragment4 : Fragment(R.layout.fragment_4) {

    private lateinit var binding: Fragment4Binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = Fragment4Binding.inflate(layoutInflater, container, false)
        return binding.root
    }

    companion object {
        fun newInstance() = Fragment4()
    }
}