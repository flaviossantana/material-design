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

    @BindView(R.id.progess_linear)
    public ProgressBar linearProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);
        ButterKnife.bind(this);

        circularProgress.setVisibility(View.GONE);

        linearProgress.setProgress(0);
        linearProgress.setSecondaryProgress(0);
        linearProgress.setMax(100);

        new AsyncProgess().execute();
    }

    public class AsyncProgess extends AsyncTask<Void, Integer, Void> {

        @Override
        protected void onPreExecute() {
            circularProgress.setVisibility(View.VISIBLE);
        }

        @Override
        protected Void doInBackground(Void... objects) {

            for (int i = 0; i < 100; i++){
                try {
                    publishProgress(i+1);
                    Thread.sleep(150);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            linearProgress.setProgress(values[0]);
            linearProgress.setSecondaryProgress(values[0]+10);
        }

        @Override
        protected void onPostExecute(Void o) {
            circularProgress.setVisibility(View.GONE);
        }
    }

}
