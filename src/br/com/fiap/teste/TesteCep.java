package br.com.fiap.teste;


import java.util.List;

import br.com.fiap.dao.impl.CepDAOImpl;
import br.com.fiap.model.Cep;


public class TesteCep {

	public static void main(String[] args) {
		CepDAOImpl dao = new CepDAOImpl();
		List<Cep> lista = dao.listarTodos();

//		
//		Cep cep1 = new Cep();
//		cep1.setNrCep(84951285);
//		cep1.setIdLogradouro(2);
//		cep1.setIdEndereco(1016);
//		cep1.setIdUf(2);
//		cep1.setIdCidade(2);
//		cep1.setIdCompl(2);
//		cep1.setIdBairro(2);
//		dao.cadastrar(cep1);
		
//		Cep cep2 = new Cep();
//		cep2.setNrCep(24567389);
//		cep2.setIdLogradouro(3);
//		cep2.setIdEndereco(3);
//		cep2.setIdUf(3);
//		cep2.setIdCidade(3);
//		cep2.setIdCompl(3);
//		cep2.setIdBairro(3);
//		dao.cadastrar(cep2);
//			
//		Cep cep3 = new Cep();
//		cep3.setNrCep(85976320);
//		cep3.setIdLogradouro(4);
//		cep3.setIdEndereco(4);
//		cep3.setIdUf(4);
//		cep3.setIdCidade(4);
//		cep3.setIdCompl(4);
//		cep3.setIdBairro(4);
//		dao.cadastrar(cep3);
//			
//		Cep cep4 = new Cep();
//		cep4.setNrCep(20456973);
//		cep4.setIdLogradouro(5);
//		cep4.setIdEndereco(5);
//		cep4.setIdUf(5);
//		cep4.setIdCidade(5);
//		cep4.setIdCompl(5);
//		cep4.setIdBairro(5);
//		dao.cadastrar(cep4);
//			
//		Cep cep5 = new Cep();
//		cep5.setNrCep(52407382);
//		cep5.setIdLogradouro(6);
//		cep5.setIdEndereco(6);
//		cep5.setIdUf(6);
//		cep5.setIdCidade(6);
//		cep5.setIdCompl(6);
//		cep5.setIdBairro(6);
//		dao.cadastrar(cep5);
//			
//		System.out.println("Cadastrei...");

		for (Cep cep : lista) {
			
			System.out.println(" ID CEP: " + cep.getIdCep() + " NR CEP: " + cep.getNrCep() + " ID LOGRADOURO: " + cep.getIdLogradouro() + " ID ENDERECO: " + cep.getIdEndereco() + " ID UF: " + cep.getIdUf() + " ID CIDADE: " + cep.getIdCidade() + " ID COMPL: " + cep.getIdCompl() + " ID BAIRRO: " + cep.getIdBairro());
	}

	}
}
