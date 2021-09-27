package com.hackyeon.navigationtest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hackyeon.navigationtest.R
import com.hackyeon.navigationtest.databinding.FragmentSampleBinding


class SampleFragment : Fragment() {
    private lateinit var binding: FragmentSampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSampleBinding.inflate(inflater, container, false)
        return binding.root
    }

}