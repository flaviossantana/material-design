package com.udemy.materialdesign.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.widget.Toast;

import com.udemy.materialdesign.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DialogsActivity extends AppCompatActivity {

    @BindView(R.id.dialog_btn_alert)
    public AppCompatButton btnDialog;

    public AlertDialog alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogs);
        ButterKnife.bind(this);

        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.AlertDialog);
        builder.setMessage("Deseja ver essa mensagem?");
        builder.setPositiveButton("SIM", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(DialogsActivity.this, "SIM!", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("NÃO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(DialogsActivity.this, "NÃO!", Toast.LENGTH_SHORT).show();
            }
        });


        alertDialog = builder.create();

    }

    @OnClick(R.id.dialog_btn_alert)
    public void onClickDialog(){
        alertDialog.show();
    }

}
