package com.udemy.materialdesign.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.udemy.materialdesign.R;

import butterknife.ButterKnife;

public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        ButterKnife.bind(this);
    }
}
