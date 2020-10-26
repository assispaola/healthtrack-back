package br.com.fiap.teste;

import java.util.List;

import br.com.fiap.dao.impl.EndCompDAOImpl;
import br.com.fiap.model.EndComp;

public class TesteEndComp {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			EndCompDAOImpl dao = new EndCompDAOImpl();
			List<EndComp> lista = dao.listarTodos();
			
			for (EndComp endcomp: lista) {
				
				System.out.println ("ID End Comp: " + endcomp.getIdEndComp() + " ID Usuario: " + endcomp.getIdUsuario() + " ID CEP: " + endcomp.getIdCep());
			}
		}

	}