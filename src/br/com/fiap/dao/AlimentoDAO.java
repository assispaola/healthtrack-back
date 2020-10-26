package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.model.Almt;

public interface AlimentoDAO {
	
	public List<Almt> listarTodos();
	
	public void cadastrar(Almt almt);
  	    
    public void atualizar(Almt almt);
  
    public void remover(int idAlmt);
    
    public Almt buscarPorId(int idAlmt);
    

}
