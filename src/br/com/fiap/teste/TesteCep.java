package br.com.fiap.teste;


import java.util.List;

import br.com.fiap.dao.impl.CepDAOImpl;
import br.com.fiap.model.Cep;


public class TesteCep {

	public static void main(String[] args) {
		CepDAOImpl dao = new CepDAOImpl();
		List<Cep> lista = dao.listarTodos();
		
		for (Cep cep : lista) {
			
			System.out.println(" ID CEP: " + cep.getIdCep() + " NR CEP: " + cep.getNrCep() + " ID LOGRADOURO: " + cep.getIdLogradouro() + " ID ENDERECO: " + cep.getIdEndereco() + " ID UF: " + cep.getIdUf() + " ID CIDADE: " + cep.getIdCidade() + " ID COMPL: " + cep.getIdCompl() + " ID BAIRRO: " + cep.getIdBairro());
	}

	}
}
