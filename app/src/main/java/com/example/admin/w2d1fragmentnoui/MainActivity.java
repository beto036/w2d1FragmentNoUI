package com.example.admin.w2d1fragmentnoui;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final String MY_TAG = "MY_FRAGMENT_TAG";
    private BlankFragment blankFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blankFragment = new BlankFragment();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().add(blankFragment, MY_TAG).commit();
    }
}
