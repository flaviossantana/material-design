package com.udemy.materialdesign.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.udemy.materialdesign.R;
import com.udemy.materialdesign.model.Conteudo;
import com.udemy.materialdesign.util.ImagemUtil;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class ItemConteudoAdapter extends BaseAdapter {

    private final Context context;
    private final List<Conteudo> listaPacotes;

    public ItemConteudoAdapter(Context context, List<Conteudo> listaPacotes) {
        this.context = context;
        this.listaPacotes = listaPacotes;
    }

    @Override
    public int getCount() {
        return this.listaPacotes.size();
    }

    @Override
    public Conteudo getItem(int index) {
        return this.listaPacotes.get(index);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int index, View view, ViewGroup paarent) {

        View itemPacoteView = LayoutInflater.from(context).inflate(R.layout.item_conteudo, paarent, false);

        Conteudo pacote = getItem(index);

        PacoteHolder pacoteHolder = new PacoteHolder(itemPacoteView);
        pacoteHolder.secao.setText(pacote.getSecao());
        pacoteHolder.conteudo.setText(pacote.getConteudo());
        recuperarImagem(pacote, pacoteHolder);

        return itemPacoteView;
    }

    private void recuperarImagem(Conteudo pacote, PacoteHolder pacoteHolder) {
        Drawable drawable = ImagemUtil.recuperarImagem(context, pacote.getImagem());
        pacoteHolder.imagem.setImageDrawable(drawable);
    }


    public Context getContext() {
        return context;
    }


    static class PacoteHolder {

        @BindView(R.id.item_local)
        TextView secao;

        @BindView(R.id.item_valor)
        TextView conteudo;

        @BindView(R.id.item_foto)
        ImageView imagem;

        public PacoteHolder(View view) {
            ButterKnife.bind(this, view);
        }

    }

}
