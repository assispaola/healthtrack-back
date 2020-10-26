package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.model.TipoAtv;

public interface TipoAtvDAO {
	
	public List<TipoAtv> listarTodos();
	
	public void cadastrar(TipoAtv tipoatv);
	
	public void atualizar(TipoAtv tipoatv);
	
	public void remover(int idTipoatv);
	
	public TipoAtv buscarPorId(int idTipoatv);
	

}
