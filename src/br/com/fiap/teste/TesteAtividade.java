package br.com.fiap.teste;

import java.text.SimpleDateFormat;
import java.util.List;

import br.com.fiap.dao.impl.AtividadeDAOImp;
import br.com.fiap.model.Atividade;

public class TesteAtividade {
	

public static void main(String[] args) {
	AtividadeDAOImp dao = new AtividadeDAOImp();
	SimpleDateFormat formatacaoData = new SimpleDateFormat("dd/MM/yyyy");

	List<Atividade> lista = dao.listarTodos();
		
	for (Atividade atividade : lista) {
		System.out.println("ID: " + atividade.getIdAtividade() + " - Tipo de Atividade: " + atividade.getIdTipoAtv () + "/ Distancia percorrida: " + atividade.getVlDistancia() + " - Data de Cadastro: "+ formatacaoData.format(atividade.getDtCadastro().getTime()));
	}

}
}


