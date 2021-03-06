package com.rightel.momir.android.jetpacknavigationlibrary

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_second.*




class SecondFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val name = SecondFragmentArgs.fromBundle(arguments!!).name
        val family = SecondFragmentArgs.fromBundle(arguments!!).family
        welcomeName.text = "Welcome $name! $family!"


        btnGoToDetailFragment.setOnClickListener {
            val action = SecondFragmentDirections.actionSecondFragmentToDetailFragment()
            action.name = "Mohammad"
            findNavController().navigate(action)
        }

//        another way to call onclick
//        btnGoToDetailFragment.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.secondFragment, null))


    }


}
