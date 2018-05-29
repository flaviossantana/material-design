package com.udemy.materialdesign.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.pkmmte.pkrss.Article;
import com.pkmmte.pkrss.Callback;
import com.pkmmte.pkrss.PkRSS;
import com.udemy.materialdesign.R;
import com.udemy.materialdesign.adapter.FeedAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecyclerViewActivity extends AppCompatActivity implements Callback {

    @BindView(R.id.rv_recyclerView)
    public RecyclerView recyclerView;

    private FeedAdapter feedAdapter;
    private List<Article> feeds = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        ButterKnife.bind(this);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        feedAdapter = new FeedAdapter(feeds);
        recyclerView.setAdapter(feedAdapter);

        PkRSS.with(this).load("https://rss.tecmundo.com.br/feed").skipCache().callback(this).async();

    }

    @Override
    public void onPreload() {

    }

    @Override
    public void onLoaded(List<Article> newArticles) {
        feeds.clear();
        feeds.addAll(newArticles);
        feedAdapter.notifyDataSetChanged();
    }

    @Override
    public void onLoadFailed() {

    }
}
