package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.model.EndComp;

public interface EndCompDAO {
public List<EndComp> listarTodos();
	
	public void cadastrar(EndComp endComp);
	
	public void atualizar(EndComp endComp);
	
	public void remover(int idEndComp);
	
	public EndComp buscarPorId(int idEndComp);
}
