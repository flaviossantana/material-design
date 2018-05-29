package com.udemy.materialdesign.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pkmmte.pkrss.Article;
import com.udemy.materialdesign.R;
import com.udemy.materialdesign.holder.FeedHolder;
import com.udemy.materialdesign.task.DownloadImageTask;
import com.udemy.materialdesign.util.ImagemUtil;

import java.util.List;

public class FeedAdapter extends RecyclerView.Adapter<FeedHolder> {

    private List<Article> feeds;

    public FeedAdapter(List<Article> feeds) {
        this.feeds = feeds;
    }

    @NonNull
    @Override
    public FeedHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_view, parent, false);
        return new FeedHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FeedHolder holder, int position) {
        Article feed = feeds.get(position);
        holder.titulo.setText(feed.getTitle());
        holder.subtitulo.setText(feed.getAuthor());

        if(feed.getEnclosure() != null){
            new DownloadImageTask(holder.imagem).execute(feed.getEnclosure().getUrl());
        }

    }

    @Override
    public int getItemCount() {
        return feeds.size();
    }



}
