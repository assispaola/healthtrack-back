package br.com.fiap.teste;

import java.util.List;

import br.com.fiap.dao.impl.CidadeDAOImpl;
import br.com.fiap.model.Cidade;

public class TesteCidade {

	public static void main(String[] args) {
		CidadeDAOImpl dao = new CidadeDAOImpl();
		List<Cidade> lista = dao.listarTodos();
		
		Cidade cidade1=new Cidade();
		cidade1.setDsCidade("Porto Alegre");
	    dao.cadastrar(cidade1);
	    
	    Cidade cidade2=new Cidade();
		cidade2.setDsCidade("Vitória");
	    dao.cadastrar(cidade2);
	    
	    Cidade cidade3=new Cidade();
		cidade3.setDsCidade("Caxias do Sul");
	    dao.cadastrar(cidade3);
	    
	    Cidade cidade4=new Cidade();
		cidade4.setDsCidade("Embu das Artes");
	    dao.cadastrar(cidade4);
	    
	    Cidade cidade5=new Cidade();
		cidade5.setDsCidade("Canoas");
	    dao.cadastrar(cidade5);

		for (Cidade cidade : lista) {

			System.out.println(cidade.getIdCidade() + " - Cidade: " + cidade.getDsCidade());
		}
	}
}
