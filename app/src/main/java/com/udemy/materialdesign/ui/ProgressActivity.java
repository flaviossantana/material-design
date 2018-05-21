package com.udemy.materialdesign.ui;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.udemy.materialdesign.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProgressActivity extends AppCompatActivity {

    @BindView(R.id.progess_circular)
    public ProgressBar circularProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);
        ButterKnife.bind(this);

        circularProgress.setVisibility(View.GONE);

        new AsyncProgess().execute();
    }

    public class AsyncProgess extends AsyncTask {

        @Override
        protected void onPreExecute() {
            circularProgress.setVisibility(View.VISIBLE);
        }

        @Override
        protected Object doInBackground(Object[] objects) {

            for (int i = 0; i < 100; i++){
                try {
                    Thread.sleep(150);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            return null;
        }

        @Override
        protected void onPostExecute(Object o) {
            circularProgress.setVisibility(View.GONE);
        }
    }

}
