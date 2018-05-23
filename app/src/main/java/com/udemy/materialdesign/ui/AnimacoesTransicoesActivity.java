package com.udemy.materialdesign.ui;

import android.os.Bundle;
import android.support.transition.AutoTransition;
import android.support.transition.ChangeTransform;
import android.support.transition.Explode;
import android.support.transition.Fade;
import android.support.transition.Slide;
import android.support.transition.TransitionManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.udemy.materialdesign.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AnimacoesTransicoesActivity extends AppCompatActivity {

    @BindView(R.id.at_root)
    public ViewGroup root;

    @BindView(R.id.at_imagem)
    public ImageView imageView;

    @BindView(R.id.at_btn_acao)
    public Button btnAcao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animacoes_transicoes);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.at_btn_acao)
    public void onClickbtnAcao(View view){

        TransitionManager.beginDelayedTransition(root, new Fade());
        imageView.setVisibility(imageView.getVisibility() == View.INVISIBLE ? View.VISIBLE: View.INVISIBLE);


    }

}
