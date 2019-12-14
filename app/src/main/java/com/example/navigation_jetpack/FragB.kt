package com.example.navigation_jetpack

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class FragB : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.frag_b, container, false)
        var buttonCancel = view.findViewById<Button>(R.id.buttonCancelB)


        buttonCancel.setOnClickListener {
            activity!!.onBackPressed()
        }

        return view
    }

}