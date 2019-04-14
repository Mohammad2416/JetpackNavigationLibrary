package com.rightel.momir.android.jetpacknavigationlibrary

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_detail.*


class DetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //we should got the default value for id.
        var id = DetailFragmentArgs.fromBundle(arguments!!).userId
        var name = DetailFragmentArgs.fromBundle(arguments!!).name

        detailTestView.text = "User ID: $id, Name: $name"

// a fragment can call himself
        btnGoToDetailFragmentLoop.setOnClickListener {
            val action = DetailFragmentDirections.actionDetailFragmentSelf()
            action.name = "Ehsan"
            findNavController().navigate(action)
        }
    }

}
