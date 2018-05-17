package com.udemy.materialdesign;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.main_email_il)
    public TextInputLayout emailIL;

    @BindView(R.id.main_senha_il)
    public TextInputLayout senhaIL;

    @BindView(R.id.main_email)
    public AppCompatEditText email;

    @BindView(R.id.main_senha)
    public AppCompatEditText senha;

    @BindView(R.id.main_btn_login)
    public Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);



    }

    @OnClick(R.id.main_btn_login)
    public void onClickLogin(){

        validarLogin();

    }

    private void validarLogin(){

        emailIL.setErrorEnabled(false);
        senhaIL.setErrorEnabled(false);

        if(email.getText().toString().isEmpty()){
            emailIL.setErrorEnabled(true);
            emailIL.setError("Preencha com o seu email.");
        }

        if(senha.getText().toString().isEmpty()){
            senhaIL.setErrorEnabled(true);
            senhaIL.setError("Preencha com a sua senha.");
        }

    }

}
