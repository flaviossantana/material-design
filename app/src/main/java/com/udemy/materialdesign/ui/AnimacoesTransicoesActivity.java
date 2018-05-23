package com.udemy.materialdesign.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.transition.Fade;
import android.support.transition.Scene;
import android.support.transition.Transition;
import android.support.transition.TransitionInflater;
import android.support.transition.TransitionManager;
import android.support.v4.app.ActivityOptionsCompat;
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

    private Scene cena1;
    private Scene cena2;

    private boolean start = true;

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

        cena1 = Scene.getSceneForLayout(root, R.layout.activity_animacoes_transicoes, this);
        cena2 = Scene.getSceneForLayout(root, R.layout.activity_animacoes_transicoes_dois, this);

    }

    @OnClick(R.id.at_btn_acao)
    public void onClickbtnAcao(View view){
        TransitionManager.beginDelayedTransition(root, new Fade());
        imageView.setVisibility(imageView.getVisibility() == View.INVISIBLE ? View.VISIBLE: View.INVISIBLE);
    }

    @OnClick(R.id.at_imagem)
    public void onClickImagem(View view){
        Bundle bundle = ActivityOptionsCompat.makeSceneTransitionAnimation(AnimacoesTransicoesActivity.this).toBundle();
        Intent intent = new Intent(AnimacoesTransicoesActivity.this, AnimacaoDetalhesActivity.class);
        startActivity(intent, bundle);
    }

    public void changeScene(View view){

        Transition transition = TransitionInflater.from(this).inflateTransition(R.transition.custom);
        Transition transitions = TransitionInflater.from(this).inflateTransition(R.transition.custom_dois);


        if(start){
            TransitionManager.go(cena2, transition);
            start = false;
        } else {
            TransitionManager.go(cena1, transitions);
            start = true;

        }

    }

}
