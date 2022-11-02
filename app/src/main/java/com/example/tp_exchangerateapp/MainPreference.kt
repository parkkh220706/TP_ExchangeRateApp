package com.example.tp_exchangerateapp

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat

class MainPreference : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        addPreferencesFromResource(R.xml.preference)
    }
}