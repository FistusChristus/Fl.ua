package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import fl.example.flua.R
import fl.example.flua.databinding.Fragment2Binding

class Fragment2 : Fragment(R.layout.fragment_2) {

    private lateinit var binding: Fragment2Binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = Fragment2Binding.inflate(layoutInflater, container, false)
        return binding.root
    }

    companion object {
        fun newInstance() = Fragment2()
    }
}