package br.com.rd.mbean;

import br.com.rd.dao.InMemoryDB;
import br.com.rd.vo.OperadorVO;

import javax.faces.bean.ManagedBean;
import java.util.List;

@ManagedBean(name = "listarMBean")
public class ListarOperador {
    public List<OperadorVO> getListaOperadores() {
        return InMemoryDB.listaOperadores;
    }

    public String adicionar() {
        return "cadastrarOperador";
    }
}
