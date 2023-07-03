package com.example.casino.ui.host

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.casino.R

class HostFragmentFragment : Fragment() {

    companion object {
        fun newInstance() = HostFragmentFragment()
    }

    private lateinit var viewModel: HostViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_host, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HostViewModel::class.java)
        // TODO: Use the ViewModel
    }

}