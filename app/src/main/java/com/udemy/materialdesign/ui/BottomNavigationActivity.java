package com.udemy.materialdesign.ui;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.udemy.materialdesign.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BottomNavigationActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @BindView(R.id.bn_BottomNav)
    public BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);
        ButterKnife.bind(this);
        navigationView.setOnNavigationItemSelectedListener(this);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case (R.id.bn_menu_carrinho) :
                Toast.makeText(BottomNavigationActivity.this, "Clicou no Carinho", Toast.LENGTH_LONG).show();
                break;
            case (R.id.bn_menu_favorito) :
                Toast.makeText(BottomNavigationActivity.this, "Clicou em favorito", Toast.LENGTH_LONG).show();
                break;
            case (R.id.bn_menu_localizacao) :
                Toast.makeText(BottomNavigationActivity.this, "Clicou em localizacao", Toast.LENGTH_LONG).show();
                break;
        }

        return false;
    }
}
