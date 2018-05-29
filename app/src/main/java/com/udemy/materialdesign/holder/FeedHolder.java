package com.udemy.materialdesign.holder;


import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

import com.udemy.materialdesign.R;

public class FeedHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.rv_imagem)
    public ImageView imagem;

    @BindView(R.id.rv_titulo)
    public TextView titulo;

    @BindView(R.id.rv_subtitulo)
    public TextView subtitulo;

    @BindView(R.id.rv_btn_acessar)
    public AppCompatButton btnAcessar;

    public FeedHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
