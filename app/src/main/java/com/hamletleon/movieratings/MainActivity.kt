package com.hamletleon.movieratings

import android.os.Bundle

import com.hamletleon.movieratings.ui.main.MainFragment
import com.hamletleon.movieratings.utils.replaceFragmentInActivity
import dagger.android.support.DaggerAppCompatActivity

class MainActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        supportFragmentManager.replaceFragmentInActivity(R.id.container, MainFragment.newInstance())
    }
}
