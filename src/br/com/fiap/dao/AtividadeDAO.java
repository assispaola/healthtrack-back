package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.model.Atividade;

public interface AtividadeDAO {
	
	public List<Atividade> listarTodos();
	
	public void cadastrar(Atividade atividade);
	
	public void atualizar(Atividade atividade);
	
	public void remover(int idAtividade);
	
	public Atividade buscarPorId(int idAtividade);
}
