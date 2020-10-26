package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.model.Imc;

public interface ImcDAO {
	
	public List<Imc> listarTodos();
	
	public void cadastrar(Imc imc);
  	    
    public void atualizar(Imc imc);
  
    public void remover(int idImc);
    
    public Imc buscarPorId(int idImc);
    
    

}
