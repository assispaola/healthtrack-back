package br.com.fiap.teste;

import java.util.List;

import br.com.fiap.dao.impl.CidadeDAOImpl;
import br.com.fiap.model.Cidade;

public class TesteCidade {

	public static void main(String[] args) {
		CidadeDAOImpl dao = new CidadeDAOImpl();
		List<Cidade> lista = dao.listarTodos();

		for (Cidade cidade : lista) {

			System.out.println(cidade.getIdCidade() + " - Cidade: " + cidade.getDsCidade());
		}
	}
}
