package com.br.julianovincedecampos.cachorros.view

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import com.br.julianovincedecampos.cachorros.R

class SettingsFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preferences, rootKey)
    }
}