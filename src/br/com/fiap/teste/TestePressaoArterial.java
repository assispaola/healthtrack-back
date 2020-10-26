package br.com.fiap.teste;

import java.text.SimpleDateFormat;
import java.util.List;

import br.com.fiap.dao.impl.PressaoArterialDAOImpl;
import br.com.fiap.model.PressaoArterial;

public class TestePressaoArterial {

	public static void main(String[] args) {
		
		PressaoArterialDAOImpl dao = new PressaoArterialDAOImpl();
		SimpleDateFormat formatacaoData = new SimpleDateFormat("dd/MM/yyyy");

		List<PressaoArterial> lista = dao.listarTodos();
		for (PressaoArterial pressaoArterial : lista) {
			System.out.println("ID: " + pressaoArterial.getIdPressaoArterial() + " - Pressão: " + pressaoArterial.getNrSistolica() + "/"
					+ pressaoArterial.getNrDiastolica() + " - Data de Cadastro: "
					+ formatacaoData.format(pressaoArterial.getDtCadastro().getTime()) + " - ID do Usuário: "
					+ pressaoArterial.getIdUsuario());
		}

	}

}
