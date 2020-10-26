package br.com.fiap.teste;

import java.util.List;

import br.com.fiap.dao.impl.UfDAOImpl;
import br.com.fiap.model.Uf;

public class TesteUf {

	public static void main(String[] args) {
		UfDAOImpl dao = new UfDAOImpl();
		List<Uf> lista = dao.listarTodos();

		for (Uf Uf : lista) {

			System.out.println(Uf.getIdUf() + " - Uf: " + Uf.getDsUf());
		}
	}

}


