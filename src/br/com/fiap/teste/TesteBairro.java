package br.com.fiap.teste;

import java.util.List;

import br.com.fiap.dao.impl.BairroDAOImpl;
import br.com.fiap.model.Bairro;

public class TesteBairro {

	public static void main(String[] args) {
		BairroDAOImpl dao = new BairroDAOImpl();
		List<Bairro> lista = dao.listarTodos();

		for (Bairro Bairro : lista) {

			System.out.println(Bairro.getIdBairro() + " - Bairro: " + Bairro.getDsBairro());
		}
	}

}
