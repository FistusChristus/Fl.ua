package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import fl.example.flua.R
import fl.example.flua.databinding.Fragment3Binding

class Fragment3 : Fragment(R.layout.fragment_4) {

    private lateinit var binding: Fragment3Binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = Fragment3Binding.inflate(layoutInflater, container, false)
        return binding.root
    }

    companion object {
        fun newInstance() = Fragment3()
    }
}