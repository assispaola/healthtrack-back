package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.model.Logradouro;

public interface LogradouroDAO {
public List<Logradouro> listarTodos();
	
	public void cadastrar(Logradouro logradouro);
	
	public void atualizar(Logradouro logradouro);
	
	public void remover(int idLogradouro);
	
	public Logradouro buscarPorId(int idLogradouro);
	
}
