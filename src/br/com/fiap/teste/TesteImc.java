package br.com.fiap.teste;

import java.text.SimpleDateFormat;
import java.util.List;


import br.com.fiap.dao.impl.ImcDAOImpl;
import br.com.fiap.model.Imc;

public class TesteImc {

	public static void main(String[] args) {
		ImcDAOImpl dao = new ImcDAOImpl();
		List<Imc> lista = dao.listarTodos();
		SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/YYYY");
		
		for (Imc imc : lista) {
			
			System.out.println(" ID IMC:" + imc.getIdImc() + " VALOR:" + imc.getValor() + " DT CADASTRO:" + formatarData.format(imc.getDtCadastro().getTime()) + " PESO:" + imc.getPeso() + " ALTURA:" + imc.getAltura() + " ID USUARIO: " + imc.getIdUsuario());
			
		}
	}

}
