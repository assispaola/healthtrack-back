package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.model.PressaoArterial;

public interface PressaoArterialDAO {
	
	
	public List<PressaoArterial> listarTodos();
	
	public void cadastrar(PressaoArterial pressaoArterial);
  	    
    public void atualizar(PressaoArterial pressaoArterial);
  
    public void remover(int idPressaoArterial);
    
    public PressaoArterial buscarPorId(int idPressaoArterial);

}
