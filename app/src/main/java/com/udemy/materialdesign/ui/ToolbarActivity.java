package com.udemy.materialdesign.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.udemy.materialdesign.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnItemSelected;

public class ToolbarActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    public Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.menu_buscar : {
                Toast.makeText(ToolbarActivity.this, "Buscando item...", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.menu_carrinho  : {
                Toast.makeText(ToolbarActivity.this, "Indo para carrinho...", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.menu_configuracao  : {
                Toast.makeText(ToolbarActivity.this, "Indo para configuração...", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.menu_sobre  : {
                Toast.makeText(ToolbarActivity.this, "Sobre nosso app...", Toast.LENGTH_SHORT).show();
                break;
            }
        }

        return super.onOptionsItemSelected(item);
    }
}
