package com.udemy.materialdesign.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.transition.Slide;
import android.view.Gravity;

import com.udemy.materialdesign.R;

import butterknife.ButterKnife;

public class AnimacaoDetalhesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animacao_detalhes);
        ButterKnife.bind(this);

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            Slide slide = new Slide(Gravity.BOTTOM);
            getWindow().setEnterTransition(new Explode());
        }

    }
}
