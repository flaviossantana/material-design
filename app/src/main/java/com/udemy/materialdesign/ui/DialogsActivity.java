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

    public AlertDialog alertDialog;
    public AlertDialog alertDialogItens;
    public AlertDialog alertDialogMultChoice;

    @BindView(R.id.dialog_btn_alert)
    public AppCompatButton btnDialog;

    @BindView(R.id.dialog_btn_itens)
    public AppCompatButton btnDialogItens;

    @BindView(R.id.dialog_btn_mutiple_choice)
    public AppCompatButton btnDialogMultiple;

    private String[] items = {"OPÇÃO 1", "OPÇÃO 2", "OPÇÃO 3", "OPÇÃO 4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogs);
        ButterKnife.bind(this);

        createDialog();
        createDialogSingleChoice();
        createDialogMultipleChoice();

    }

    private void createDialogSingleChoice() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Selecione uma opção:");
        builder.setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(DialogsActivity.this, items[i], Toast.LENGTH_SHORT).show();
            }
        });
        builder.setPositiveButton("OK", null);
        builder.setNegativeButton("CANCELAR", null);

        alertDialogItens = builder.create();
    }

    private void createDialogMultipleChoice() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Selecione uma opção:");
        builder.setMultiChoiceItems(items, null, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int idx, boolean isChecked) {
                Toast.makeText(DialogsActivity.this, items[idx] + ":" + isChecked, Toast.LENGTH_SHORT).show();
            }
        });
        builder.setPositiveButton("OK", null);
        builder.setNegativeButton("CANCELAR", null);

        alertDialogMultChoice = builder.create();
    }

    private void createDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.AlertDialog);
        builder.setTitle("Deseja ver essa mensagem?");
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

    @OnClick(R.id.dialog_btn_itens)
    public void onClickDialogItens(){
        alertDialogItens.show();
    }

    @OnClick(R.id.dialog_btn_mutiple_choice)
    public void onClickDialogMultChoice(){
        alertDialogMultChoice.show();
    }

}
