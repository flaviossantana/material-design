package com.udemy.materialdesign.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.udemy.materialdesign.R;
import com.udemy.materialdesign.adapter.ItemConteudoAdapter;
import com.udemy.materialdesign.model.Conteudo;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnItemClick;

public class ListaConteudoActivity extends AppCompatActivity {

    @BindView(R.id.lista_pacotes_listview)
    public ListView listaPacoteView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_conteudo);
        ButterKnife.bind(this);

        List<Conteudo> conteudos = new ArrayList<Conteudo>();
        conteudos.add(new Conteudo(1, "Seção: 04", "TextField", "img_01"));
        conteudos.add(new Conteudo(2, "Seção: 05", "Buttons", "img_02"));
        conteudos.add(new Conteudo(3, "Seção: 06", "Toolbar", "img_03"));
        conteudos.add(new Conteudo(4, "Seção: 07", "Navigation Drawer", "img_04"));

        listaPacoteView.setAdapter(new ItemConteudoAdapter(this, conteudos));
    }

    @OnItemClick(R.id.lista_pacotes_listview)
    public void onClikListaPacoteListView(int posicao) {
        Conteudo pacote = (Conteudo) listaPacoteView.getItemAtPosition(posicao);


        switch (pacote.getId()) {
            case 1: {
                goActivity(TextFieldActivity.class);
                break;
            }
            case 2: {
                goActivity(BotoesActivity.class);
                break;
            }
            case 3: {
                goActivity(ToolbarActivity.class);
                break;
            }
        }

    }

    private void goActivity(Class aClass) {
        Intent irActivity = new Intent(ListaConteudoActivity.this, aClass);
        startActivity(irActivity);
    }

}
