package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.model.Tipo;

public interface TipoDAO {
	
public List<Tipo> listarTodos();
	
	public void cadastrar(Tipo tipo);
	
	public void atualizar(Tipo tipo);
	
	public void remover(int idTipo);
	
	public Tipo buscarPorId(int idTipo);


}
