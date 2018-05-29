package com.udemy.materialdesign.model;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;

import com.udemy.materialdesign.ui.TextFieldActivity;

import java.io.Serializable;

public class Conteudo implements Serializable {

    private Integer id;
    private String secao;
    private String imagem;
    private String conteudo;
    private Class<? extends AppCompatActivity> activityClass;

    public Conteudo() {
        super();
    }

    public Conteudo(Integer id) {
        this.id = id;
    }

    public Conteudo(Integer id, String secao, String conteudo, String imagem, Class<? extends AppCompatActivity> activityClass ) {
        this.id = id;
        this.secao = secao;
        this.imagem = imagem;
        this.conteudo = conteudo;
        this.activityClass = activityClass;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Class<? extends AppCompatActivity> getActivityClass() {
        return activityClass;
    }

    public void setActivityClass(Class<? extends AppCompatActivity> activityClass) {
        this.activityClass = activityClass;
    }
}