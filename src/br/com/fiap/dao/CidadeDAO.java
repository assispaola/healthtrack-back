package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.model.Cidade;

public interface CidadeDAO {
public List<Cidade> listarTodos();
	
	public void cadastrar(Cidade cidade);
	
	public void atualizar(Cidade cidade);
	
	public void remover(int idCidade);
	
	public Cidade buscarPorId(int idCidade);
}
