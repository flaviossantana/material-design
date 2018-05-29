package com.udemy.materialdesign.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.udemy.materialdesign.R;
import com.udemy.materialdesign.holder.ConteudoHolder;
import com.udemy.materialdesign.listener.ItemConteudoClickListner;
import com.udemy.materialdesign.model.Conteudo;
import com.udemy.materialdesign.ui.ListaConteudoActivity;
import com.udemy.materialdesign.util.ImagemUtil;

import java.util.List;

public class ItemConteudoRecycleAdapter extends RecyclerView.Adapter<ConteudoHolder> {

    private final Context context;
    private final List<Conteudo> conteudos;
    private ItemConteudoClickListner onClickListner;

    public ItemConteudoRecycleAdapter(Context context, List<Conteudo> conteudos) {
        this.context = context;
        this.conteudos = conteudos;
    }

    @NonNull
    @Override
    public ConteudoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_conteudo, parent, false);
        return new ConteudoHolder(view, onClickListner);
    }

    @Override
    public void onBindViewHolder(@NonNull ConteudoHolder holder, int posicao) {
        Conteudo conteudo = conteudos.get(posicao);
        holder.secao.setText(conteudo.getSecao());
        holder.conteudo.setText(conteudo.getConteudo());
        holder.id = conteudo.getId();
        recuperarImagem(conteudo, holder);

    }

    @Override
    public int getItemCount() {
        return conteudos.size();
    }

    private void recuperarImagem(Conteudo pacote, ConteudoHolder holder) {
        Drawable drawable = ImagemUtil.recuperarImagem(context, pacote.getImagem());
        Drawable resizeDrawble = ImagemUtil.resize(context, drawable);
        holder.imagem.setImageDrawable(resizeDrawble);
    }

    public void setOnClickListner(ItemConteudoClickListner onClickListner) {
        this.onClickListner = onClickListner;
    }
}
