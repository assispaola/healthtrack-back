package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.model.Complemento;

public interface ComplementoDAO {
public List<Complemento> listarTodos();
	
	public void cadastrar(Complemento complemento);
	
	public void atualizar(Complemento complemento);
	
	public void remover(int idComplemento);
	
	public Complemento buscarPorId(int idComplemento);
}
