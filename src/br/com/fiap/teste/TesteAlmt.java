package br.com.fiap.teste;

import java.util.List;

import br.com.fiap.dao.impl.AlimentoDAOImp;
import br.com.fiap.model.Almt;


public class TesteAlmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlimentoDAOImp dao = new AlimentoDAOImp();
		List<Almt> lista = dao.listarTodos();
		
		Almt alimento1 = new Almt();
		alimento1.setNmAlimento("Mandioca");
		alimento1.setQtAlimento(5);
		alimento1.setQtCaloria(105);
		alimento1.setIdUsuario(8002);
		alimento1.setIdPeriodo(1);
		dao.cadastrar(alimento1);
		
		Almt alimento2 = new Almt();
		alimento2.setNmAlimento("Batata");
		alimento2.setQtAlimento(10);
		alimento2.setQtCaloria(230);
		alimento2.setIdUsuario(8001);
		alimento2.setIdPeriodo(2);
		dao.cadastrar(alimento2);
		
		Almt alimento3 = new Almt();
		alimento3.setNmAlimento("Pastel");
		alimento3.setQtAlimento(2);
		alimento3.setQtCaloria(147);
		alimento3.setIdUsuario(8003);
		alimento3.setIdPeriodo(3);
		dao.cadastrar(alimento3);
		
		Almt alimento4 = new Almt();
		alimento4.setNmAlimento("Ovo");
		alimento4.setQtAlimento(12);
		alimento4.setQtCaloria(170);
		alimento4.setIdUsuario(8001);
		alimento4.setIdPeriodo(1);
		dao.cadastrar(alimento4);
		
		Almt alimento5 = new Almt();
		alimento5.setNmAlimento("Arroz");
		alimento5.setQtAlimento(1);
		alimento5.setQtCaloria(130);
		alimento5.setIdUsuario(8002);
		alimento5.setIdPeriodo(2);
		dao.cadastrar(alimento5);
		
		System.out.println("Cadastrei...");
		
		for (Almt alimento: lista) {
			
			System.out.println("Nome do alimento: " + alimento.getNmAlimento () + " Quantidade ingerida: " + alimento.getQtAlimento() + " Quantidade de Calorias: " + alimento.getQtCaloria() + " ID do Usuario: " + alimento.getIdUsuario() + " ID do Periodo: " + alimento.getIdPeriodo() );
		}
	}

}

