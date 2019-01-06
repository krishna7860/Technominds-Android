package com.udacity.krishna.newsapp.ui;


import android.os.Bundle;
import android.support.v14.preference.PreferenceFragment;

import com.udacity.krishna.newsapp.R;

public class SettingsFragment extends PreferenceFragment {
    @Override
    public void onCreatePreferences(Bundle bundle, String s) {
        addPreferencesFromResource(R.xml.preferences);
    }
}
