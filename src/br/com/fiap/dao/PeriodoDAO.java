package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.model.Periodo;


public interface PeriodoDAO {
public List<Periodo> listarTodos();
	
	public void cadastrar(Periodo periodo);
	
	public void atualizar(Periodo periodo);
	
	public void remover(int idPeriodo);
	
	public Periodo buscarPorId(int idPeriodo);

}
