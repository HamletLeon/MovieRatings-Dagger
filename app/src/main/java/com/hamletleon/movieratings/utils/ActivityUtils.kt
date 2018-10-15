package com.hamletleon.movieratings.utils

import android.support.annotation.IdRes
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager

fun FragmentManager.replaceFragmentInActivity(@IdRes frameLayoutId: Int, fragment: Fragment) {
    this.beginTransaction().replace(frameLayoutId, fragment).commitNow()
}