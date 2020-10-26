package br.com.fiap.teste;

import java.util.List;

import br.com.fiap.dao.impl.AlimentoDAOImp;
import br.com.fiap.model.Almt;

public class TesteAlmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlimentoDAOImp dao = new AlimentoDAOImp();
		List<Almt> lista = dao.listarTodos();
		
		for (Almt alimento: lista) {
			
			System.out.println(alimento.getNmAlimento());
		}
	}

}

