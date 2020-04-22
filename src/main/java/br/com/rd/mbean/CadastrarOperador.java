package br.com.rd.mbean;

import br.com.rd.dao.InMemoryDB;
import br.com.rd.vo.OperadorVO;

public class CadastrarOperador {
    private OperadorVO operador = new OperadorVO();
    private String mensagem;

    public OperadorVO getOperador() {
        return operador;
    }

    public void setOperador(OperadorVO operador) {
        this.operador = operador;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String listar() {
        return "listarOperador";
    }

    public String adicionarOperador() {
        InMemoryDB.listaOperadores.add(operador);
        setMensagem("Adicionado com sucesso");
        operador = new OperadorVO();
        return "cadastrarOperador";
    }
}
