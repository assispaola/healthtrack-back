package br.com.fiap.teste;

import java.util.List;

import br.com.fiap.dao.impl.ComplementoDAOImpl;
import br.com.fiap.model.Complemento;

public class TesteComplemento {

	public static void main(String[] args) {

		ComplementoDAOImpl dao = new ComplementoDAOImpl();
		List<Complemento> lista = dao.listarTodos();

		// INSERT COMPLEMENTO 1
		Complemento comp1 = new Complemento();
		comp1.setDsCompl("APTO 15");
		dao.cadastrar(comp1);
		System.out.println("CADASTRO EFETUADO COM SUCESSO");

		// INSERT COMPLEMENTO 2
		Complemento comp2 = new Complemento();
		comp2.setDsCompl("TORRE A - APTO 63");
		dao.cadastrar(comp2);
		System.out.println("CADASTRO EFETUADO COM SUCESSO");

		// INSERT COMPLEMENTO 3
		Complemento comp3 = new Complemento();
		comp3.setDsCompl("APTO 52");
		dao.cadastrar(comp3);
		System.out.println("CADASTRO EFETUADO COM SUCESSO");

		// INSERT COMPLEMENTO 4
		Complemento comp4 = new Complemento();
		comp4.setDsCompl("Bloco B - APTO 112");
		dao.cadastrar(comp4);
		System.out.println("CADASTRO EFETUADO COM SUCESSO");

		// INSERT COMPLEMENTO 5
		Complemento comp5 = new Complemento();
		comp5.setDsCompl("APTO 11");
		dao.cadastrar(comp5);
		System.out.println("CADASTRO EFETUADO COM SUCESSO");

		for (Complemento complemento : lista) {

			System.out.println(" ID COMPL: " + complemento.getIdCompl() + " DS COMPL: " + complemento.getDsCompl());
		}

	}

}
