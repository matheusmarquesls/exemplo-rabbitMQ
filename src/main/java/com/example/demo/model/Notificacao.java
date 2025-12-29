package com.example.demo.model;

import java.io.Serializable;

public class Notificacao implements Serializable {

    private String usuario;
    private String mensagem;

    public Notificacao() {
    }

    public Notificacao(String usuario, String mensagem) {
        this.usuario = usuario;
        this.mensagem = mensagem;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
