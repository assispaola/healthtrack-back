package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.model.Bairro;

public interface BairroDAO {
public List<Bairro> listarTodos();
	
	public void cadastrar(Bairro bairro);
	
	public void atualizar(Bairro bairro);
	
	public void remover(int idBairro);
	
	public Bairro buscarPorId(int idBairro);
}
