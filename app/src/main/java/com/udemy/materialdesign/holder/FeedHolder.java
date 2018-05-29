package com.udemy.materialdesign.holder;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

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

    public Uri url;

    public FeedHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    @OnClick(R.id.rv_btn_acessar)
    public void onClickBtnAcessar(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, this.url);
        itemView.getContext().startActivity(intent);

    }

}
