package br.com.fiap.teste;

import java.util.List;

import br.com.fiap.dao.impl.EnderecoDAOImpl;
import br.com.fiap.model.Endereco;

public class TesteEndereco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnderecoDAOImpl dao = new EnderecoDAOImpl();
		List<Endereco> lista = dao.listarTodos();
		
		Endereco endereco1 = new Endereco();
		endereco1.setDsEndereco("Autonomistas");
		endereco1.setNrEndereco(1089);
		dao.cadastrar(endereco1);
		
		Endereco endereco2 = new Endereco();
		endereco2.setDsEndereco("Marechal Deodoro");
		endereco2.setNrEndereco(520);
		dao.cadastrar(endereco2);
		
		Endereco endereco3 = new Endereco();
		endereco3.setDsEndereco("Analise Sakatauskas");
		endereco3.setNrEndereco(58);
		dao.cadastrar(endereco3);
		
		Endereco endereco4 = new Endereco();
		endereco4.setDsEndereco("Estados Unidos");
		endereco4.setNrEndereco(89);
		dao.cadastrar(endereco4);
		
		Endereco endereco5 = new Endereco();
		endereco5.setDsEndereco("Antonio Carlos Costa");
		endereco5.setNrEndereco(1048);
		dao.cadastrar(endereco5);
		
		System.out.println("Cadastrei...");
		
		
		for (Endereco endereco: lista) {
			
			System.out.println ("Ds Endereço: " + endereco.getDsEndereco() + " número: " + endereco.getNrEndereco() + " ID: " + endereco.getIdEndereco() );
		}
	}

}