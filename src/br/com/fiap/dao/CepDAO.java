package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.model.Cep;

public interface CepDAO {
public List<Cep> listarTodos();
	
	public void cadastrar(Cep cep);
	
	public void atualizar(Cep cep);
	
	public void remover(int idCep);
	
	public Cep buscarPorId(int idCep);
}
