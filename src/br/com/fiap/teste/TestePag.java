package br.com.fiap.teste;

import java.util.List;

import br.com.fiap.dao.impl.PagamentoDAOImpl;
import br.com.fiap.model.Pag;

public class TestePag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PagamentoDAOImpl dao = new PagamentoDAOImpl();
		List<Pag> lista = dao.listarTodos();
		
		for (Pag pag: lista) {
			
			System.out.println(pag.getVlTotal() + pag.getIdUsuario());
		}
	}

}
