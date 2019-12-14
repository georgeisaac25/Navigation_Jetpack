package com.example.navigation_jetpack

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation

class FragA : Fragment() {
    lateinit var navController: NavController


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.frag_a, container, false)
        var buttonNext = view.findViewById<Button>(R.id.buttonNext)
        var buttonCancel = view.findViewById<Button>(R.id.buttonCancel)


        buttonNext.setOnClickListener {
            val bundle = bundleOf("myString" to "Isaac", "amount" to Money(10))
            navController.navigate(R.id.action_fragA_to_fragB,bundle)
        }

        buttonCancel.setOnClickListener {
            activity!!.onBackPressed()
        }

        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
    }

}