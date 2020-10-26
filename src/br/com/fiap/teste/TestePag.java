package br.com.fiap.teste;

import java.util.List;

import br.com.fiap.dao.impl.PagamentoDAOImpl;
import br.com.fiap.model.Pag;


public class TestePag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PagamentoDAOImpl dao = new PagamentoDAOImpl();
		List<Pag> lista = dao.listarTodos();
		
		
		Pag pagamento = new Pag();
		pagamento.setQtParcela(7);
		pagamento.setVlTotal(478.50);
		pagamento.setIdUsuario(8002);
		pagamento.setIdTipo(1);
		dao.cadastrar(pagamento);
		
		Pag pagamento2 = new Pag();
		pagamento2.setQtParcela(12);
		pagamento2.setVlTotal(4850.75);
		pagamento2.setIdUsuario(8003);
		pagamento2.setIdTipo(1);
		dao.cadastrar(pagamento2);
		
		Pag pagamento3 = new Pag();
		pagamento3.setQtParcela(4);
		pagamento3.setVlTotal(508.20);
		pagamento3.setIdUsuario(8002);
		pagamento3.setIdTipo(1);
		dao.cadastrar(pagamento3);
		
		Pag pagamento4 = new Pag();
		pagamento4.setQtParcela(9);
		pagamento4.setVlTotal(369.50);
		pagamento4.setIdUsuario(8004);
		pagamento4.setIdTipo(1);
		dao.cadastrar(pagamento4);
		
		Pag pagamento5 = new Pag();
		pagamento5.setQtParcela(3);
		pagamento5.setVlTotal(564.96);
		pagamento5.setIdUsuario(8001);
		pagamento5.setIdTipo(1);
		dao.cadastrar(pagamento5);
		
		
		System.out.println("Cadastrei...");
		
		
		
		
		for (Pag pag: lista) {
			
			System.out.println(" Quantidade de parcelas: " + pag.getQtParcela() + " Valor Total: " + pag.getVlTotal() + "ID do usuario: " + pag.getIdUsuario() + " ID do Tipo: " + pag.getIdTipo());
		}
	}

}
