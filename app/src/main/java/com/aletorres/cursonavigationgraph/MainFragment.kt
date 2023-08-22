package com.aletorres.cursonavigationgraph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.aletorres.cursonavigationgraph.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        binding.goToFirstFragment.setOnClickListener{
            findNavController().navigate(R.id.action_mainFragment_to_firstFragment) // This function makes possible the navigation
        }
        binding.goToSecondFragment.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_secondFragment) // This function makes possible the navigation
        }
        return binding.root
    }
}