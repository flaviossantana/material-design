package com.udemy.materialdesign.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

    private List<Conteudo> conteudos = new ArrayList<Conteudo>();

    @BindView(R.id.lista_pacotes_listview)
    public ListView listaPacoteView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_conteudo);
        ButterKnife.bind(this);

        novoConteudo(1, "Seção: 04", "TextField", "img_01");
        novoConteudo(2, "Seção: 05", "Buttons", "img_02");
        novoConteudo(3, "Seção: 06", "Toolbar", "img_03");
        novoConteudo(4, "Seção: 07", "Navigation Drawer", "img_04");
        novoConteudo(5, "Seção: 08", "Selection Controls", "img_05");
        novoConteudo(6, "Seção: 09", "Dialogs", "img_06");
        novoConteudo(7, "Seção: 10", "Snackbars & Toasts", "img_07");


        listaPacoteView.setAdapter(new ItemConteudoAdapter(this, conteudos));
    }

    private void novoConteudo(int id, String secao, String descricao, String imagem) {
        conteudos.add(new Conteudo(id, secao, descricao, imagem));
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
            case 4: {
                goActivity(NavigationDrawerActivity.class);
                break;
            }
            case 5: {
                goActivity(SelectionControlsActivity.class);
                break;
            }
            case 6: {
                goActivity(DialogsActivity.class);
                break;
            }
            case 7: {
                goActivity(SnackbarsToastsActivity.class);
                break;
            }
        }

    }

    private void goActivity(Class aClass) {
        Intent irActivity = new Intent(ListaConteudoActivity.this, aClass);
        startActivity(irActivity);
    }

}
