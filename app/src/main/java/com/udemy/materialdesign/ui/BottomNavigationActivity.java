package com.udemy.materialdesign.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.udemy.materialdesign.R;

import butterknife.ButterKnife;

public class BottomNavigationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);
        ButterKnife.bind(this);
    }
}
