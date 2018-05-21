package com.udemy.materialdesign.ui;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.udemy.materialdesign.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SnackbarsToastsActivity extends AppCompatActivity {

    @BindView(R.id.st_add_btn)
    public FloatingActionButton btnFloat;

    @BindView(R.id.st_relative_lay)
    public View relativeLay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snackbars_toasts);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.st_add_btn)
    public void onClickFloat(View view){
        Snackbar.make(relativeLay,"Clicado com sucesso.", Snackbar.LENGTH_LONG).show();
    }

}
