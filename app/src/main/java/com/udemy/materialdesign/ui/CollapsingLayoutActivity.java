package com.udemy.materialdesign.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import com.udemy.materialdesign.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CollapsingLayoutActivity extends AppCompatActivity {


    @BindView(R.id.cl_toolbar)
    public Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing_layout);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.cl_toolbar_menu, menu);

        return true;
    }
}
