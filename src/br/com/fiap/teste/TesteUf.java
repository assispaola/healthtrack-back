package br.com.fiap.teste;

import java.util.List;

import br.com.fiap.dao.impl.UfDAOImpl;
import br.com.fiap.model.Cidade;
import br.com.fiap.model.Uf;

public class TesteUf {

	public static void main(String[] args) {
		UfDAOImpl dao = new UfDAOImpl();
		List<Uf> lista = dao.listarTodos();
		
		Uf uf1=new Uf();
		uf1.setDsUf("RS");
	    dao.cadastrar(uf1);
	    
	    Uf uf2=new Uf();
		uf2.setDsUf("SC");
	    dao.cadastrar(uf2);
	    
	    Uf uf3=new Uf();
		uf3.setDsUf("PR");
	    dao.cadastrar(uf3);
	    
	    Uf uf4=new Uf();
		uf4.setDsUf("SP");
	    dao.cadastrar(uf4);
	    
	    Uf uf5=new Uf();
		uf5.setDsUf("RJ");
	    dao.cadastrar(uf5);

		for (Uf Uf : lista) {

			System.out.println(Uf.getIdUf() + " - Uf: " + Uf.getDsUf());
		}
	}

}


