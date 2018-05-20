package com.udemy.materialdesign.ui;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

import com.udemy.materialdesign.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NavigationDrawerActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @BindView(R.id.tolbar_nav_draw)
    public Toolbar toolbar;

    @BindView(R.id.nav_DrawerLayout)
    public DrawerLayout drawerLayout;

    @BindView(R.id.nav_NavigationView)
    public NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.abrir, R.string.fechar);
        drawerLayout.addDrawerListener(toggle);

        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {

        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
            return;
        }

        super.onBackPressed();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.menu_nav_inbox : {
                goActivity(TextFieldActivity.class);
                Toast.makeText(this, "Clicou no inbox", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.menu_nav_favoritos : {
                Toast.makeText(this, "Clicou em favoritos", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.menu_nav_email_enviados : {
                Toast.makeText(this, "Clicou em enviados", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.menu_nav_lixeira : {
                Toast.makeText(this, "Clicou na lixeira", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.menu_nav_spam : {
                Toast.makeText(this, "Clicou em spam", Toast.LENGTH_SHORT).show();
                break;
            }
        }

        drawerLayout.closeDrawer(GravityCompat.START);

        return true;
    }

    private void goActivity(Class aClass) {
        Intent irActivity = new Intent(NavigationDrawerActivity.this, aClass);
        startActivity(irActivity);
    }

}
