package com.udemy.materialdesign.holder;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.udemy.materialdesign.R;
import com.udemy.materialdesign.listener.ItemConteudoClickListner;
import com.udemy.materialdesign.model.Conteudo;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ConteudoHolder extends RecyclerView.ViewHolder {

    public Integer id;

    @BindView(R.id.item_local)
    public TextView secao;

    @BindView(R.id.item_valor)
    public TextView conteudo;

    @BindView(R.id.item_foto)
    public ImageView imagem;

    public ConteudoHolder(View itemView, final ItemConteudoClickListner onClickListner) {
        super(itemView);
        ButterKnife.bind(this, itemView);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickListner.onItemClick(getAdapterPosition(), new Conteudo(id));
            }
        });
    }

}
