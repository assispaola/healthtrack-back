package br.com.fiap.teste;

import java.util.List;

import br.com.fiap.dao.impl.ComplementoDAOImpl;
import br.com.fiap.model.Complemento;

public class TesteComplemento {

	public static void main(String[] args) {
		ComplementoDAOImpl dao = new ComplementoDAOImpl();
		List<Complemento> lista = dao.listarTodos();
		
		for (Complemento complemento : lista) {
			
			System.out.println(" ID COMPL: " + complemento.getIdCompl() + "DS COMPL: " + complemento.getDsCompl());
		}

	}

}
