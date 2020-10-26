package br.com.fiap.teste;

import java.util.List;

import br.com.fiap.dao.impl.EnderecoDAOImpl;
import br.com.fiap.model.Endereco;

public class TesteEndereco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnderecoDAOImpl dao = new EnderecoDAOImpl();
		List<Endereco> lista = dao.listarTodos();
		
		for (Endereco endereco: lista) {
			
			System.out.println ("Ds Endereço: " + endereco.getDsEndereco() + " número: " + endereco.getNrEndereco() + " ID: " + endereco.getIdEndereco() );
		}
	}

}