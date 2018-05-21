package com.udemy.materialdesign.ui;

import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.udemy.materialdesign.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SnackbarsToastsActivity extends AppCompatActivity {

    @BindView(R.id.st_add_btn)
    public FloatingActionButton btnFloat;

    @BindView(R.id.st_relative_lay)
    public View relativeLay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snackbars_toasts);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.st_add_btn)
    public void onClickFloat(View view){
        final Snackbar snackbar = Snackbar.make(view, "CLICADO COM SUCESSO.", Snackbar.LENGTH_LONG);
        snackbar.setAction("FECHAR", onClickFecharSnack(snackbar));
        View snackView = snackbar.getView();
        snackView.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
        TextView snackAction = snackView.findViewById(android.support.design.R.id.snackbar_action);
        snackAction.setTextColor(getResources().getColor(R.color.colorSecondaryDark));
        snackbar.show();
    }

    @NonNull
    private View.OnClickListener onClickFecharSnack(final Snackbar snackbar) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackbar.dismiss();
            }
        };
    }

}
