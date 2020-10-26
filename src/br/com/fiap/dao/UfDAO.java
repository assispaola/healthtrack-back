package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.model.Uf;

public interface UfDAO {
public List<Uf> listarTodos();
	
	public void cadastrar(Uf uf);
	
	public void atualizar(Uf uf);
	
	public void remover(int idUf);
	
	public Uf buscarPorId(int idUf);
}
