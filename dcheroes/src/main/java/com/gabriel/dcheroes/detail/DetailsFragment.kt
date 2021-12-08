package com.gabriel.dcheroes.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gabriel.dcheroes.R
import com.gabriel.dcheroes.databinding.FragmentDetailsBinding

class DetailsFragment : Fragment() {

    private lateinit var detailsBinding: FragmentDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        detailsBinding = FragmentDetailsBinding.inflate(inflater,container,false)
        return detailsBinding.root
    }

}