package com.hamletleon.movieratings.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.hamletleon.movieratings.R
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class MainFragment: DaggerFragment() {
    @Inject lateinit var mViewModel: MainViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    companion object {
        fun newInstance(): MainFragment = MainFragment()
    }
}
