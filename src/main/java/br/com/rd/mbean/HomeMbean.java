package br.com.rd.mbean;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "homeBean")
public class HomeMbean {

    private String mensagem = "Bem vindo a Home";

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
