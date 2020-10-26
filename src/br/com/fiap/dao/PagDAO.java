package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.model.Pag;

public interface PagDAO {

	public List<Pag> listarTodos();
	
	public void cadastrar(Pag pag);
  	    
    public void atualizar(Pag pag);
  
    public void remover(int idPag);
    
    public Pag buscarPorId(int idPag);
}
