package com.udemy.materialdesign.model;

import java.io.Serializable;

public class Conteudo implements Serializable {

    private Integer id;
    private String secao;
    private String imagem;
    private String conteudo;

    public Conteudo(Integer id, String secao, String conteudo, String imagem) {
        this.id = id;
        this.secao = secao;
        this.imagem = imagem;
        this.conteudo = conteudo;
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


}