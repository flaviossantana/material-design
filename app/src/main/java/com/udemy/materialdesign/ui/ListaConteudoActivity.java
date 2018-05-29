package com.udemy.materialdesign.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.udemy.materialdesign.R;
import com.udemy.materialdesign.adapter.ItemConteudoRecycleAdapter;
import com.udemy.materialdesign.listener.ItemConteudoClickListner;
import com.udemy.materialdesign.model.Conteudo;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ListaConteudoActivity extends AppCompatActivity {

    @BindView(R.id.lista_recyclerView)
    public RecyclerView listaConteudo;

    private List<Conteudo> conteudos = new ArrayList<Conteudo>();

    private ItemConteudoRecycleAdapter itemConteudoRecycleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_conteudo);
        ButterKnife.bind(this);

        addConteudo();
        contedoAdapter();
    }

    private void addConteudo() {
        novoConteudo(4, "Seção: 04", "TextField", "img_01", TextFieldActivity.class);
        novoConteudo(5, "Seção: 05", "Buttons", "img_02", BotoesActivity.class);
        novoConteudo(6, "Seção: 06", "Toolbar", "img_03", ToolbarActivity.class);
        novoConteudo(7, "Seção: 07", "Navigation Drawer", "img_04", NavigationDrawerActivity.class);
        novoConteudo(8, "Seção: 08", "Selection Controls", "img_05", SelectionControlsActivity.class);
        novoConteudo(9, "Seção: 09", "Dialogs", "img_06", DialogsActivity.class);
        novoConteudo(10, "Seção: 10", "Snackbars & Toasts", "img_07", SnackbarsToastsActivity.class);
        novoConteudo(11, "Seção: 11", "Progress & Activity", "img_08", ProgressActivity.class);
        novoConteudo(13, "Seção: 13", "Collapsing Layout", "img_11", CollapsingLayoutActivity.class);
        novoConteudo(14, "Seção: 14", "Lists (RecyclerView)", "img_04", RecyclerViewActivity.class);
        novoConteudo(15, "Seção: 15", "Bottom Navigation", "img_07", BottomNavigationActivity.class);
        novoConteudo(17, "Seção: 17", "Animações & Transições", "img_10", AnimacoesTransicoesActivity.class);
    }

    private void novoConteudo(int id, String secao, String descricao, String imagem, Class<? extends AppCompatActivity> activityClass) {
        conteudos.add(new Conteudo(id, secao, descricao, imagem, activityClass));
    }

    private void contedoAdapter() {
        itemConteudoRecycleAdapter = new ItemConteudoRecycleAdapter(this, conteudos);
        listaConteudo.setLayoutManager(new LinearLayoutManager(this));
        listaConteudo.setAdapter(itemConteudoRecycleAdapter);
        itemConteudoRecycleAdapter.setOnClickListner(new ItemConteudoClickListner() {
            @Override
            public void onItemClick(int posicao, Conteudo conteudo) {
                irParaConteudoSelecionado(posicao, conteudo);
            }
        });
    }

    public void irParaConteudoSelecionado(int posicao, Conteudo conteudo) {

        switch (conteudo.getId()) {
            case 4: {
                goActivity(TextFieldActivity.class);
                break;
            }
            case 5: {
                goActivity(BotoesActivity.class);
                break;
            }
            case 6: {
                goActivity(ToolbarActivity.class);
                break;
            }
            case 7: {
                goActivity(NavigationDrawerActivity.class);
                break;
            }
            case 8: {
                goActivity(SelectionControlsActivity.class);
                break;
            }
            case 9: {
                goActivity(DialogsActivity.class);
                break;
            }
            case 10: {
                goActivity(SnackbarsToastsActivity.class);
                break;
            }
            case 11: {
                goActivity(ProgressActivity.class);
                break;
            }
            case 13: {
                goActivity(CollapsingLayoutActivity.class);
                break;
            }
            case 14: {
                goActivity(RecyclerViewActivity.class);
                break;
            }
            case 15: {
                goActivity(BottomNavigationActivity.class);
                break;
            }
            case 17: {
                goActivity(AnimacoesTransicoesActivity.class);
                break;
            }
        }

    }

    private void goActivity(Class aClass) {
        Intent irActivity = new Intent(this, aClass);
        startActivity(irActivity);
    }

}
