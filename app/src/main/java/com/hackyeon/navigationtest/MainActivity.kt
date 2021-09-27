package com.hackyeon.navigationtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.hackyeon.navigationtest.databinding.ActivityMainBinding
import com.hackyeon.navigationtest.fragment.SampleFragmentDirections

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_sample_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        binding.secondButton.setOnClickListener(this)
        binding.thirdButton.setOnClickListener(this)
        binding.activityButton.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        view as Button
        val action = when (view.text) {
            "2" -> SampleFragmentDirections.actionSampleFragmentToSecondFragment()
            "3" -> SampleFragmentDirections.actionSampleFragmentToThirdFragment()
            else -> SampleFragmentDirections.actionSampleFragmentToTestActivity()
        }
        binding.navSampleFragment.findNavController().navigate(action)
    }
}