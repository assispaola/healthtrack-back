package br.com.fiap.teste;

import java.util.List;

import br.com.fiap.dao.impl.BairroDAOImpl;
import br.com.fiap.model.Bairro;
import br.com.fiap.model.Endereco;

public class TesteBairro {

	public static void main(String[] args) {
		BairroDAOImpl dao = new BairroDAOImpl();
		List<Bairro> lista = dao.listarTodos();

		Bairro bairro1 = new Bairro();
		bairro1.setDsBairro("Morro do Dende");
		dao.cadastrar(bairro1);
		
		Bairro bairro2 = new Bairro();
		bairro2.setDsBairro("Morro do Zé Lelé");
		dao.cadastrar(bairro2);
		
		Bairro bairro3 = new Bairro();
		bairro3.setDsBairro("Barranqueiro");
		dao.cadastrar(bairro3);
		
		Bairro bairro4 = new Bairro();
		bairro4.setDsBairro("Limoeiro da Turminha");
		dao.cadastrar(bairro4);
		
		Bairro bairro5 = new Bairro();
		bairro5.setDsBairro("Morro do Cacique");
		dao.cadastrar(bairro5);
		
		System.out.println("Cadastrei...");
		
		for (Bairro Bairro : lista) {

			System.out.println(Bairro.getIdBairro() + " - Bairro: " + Bairro.getDsBairro());
		}
	}

}
