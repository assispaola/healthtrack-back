package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.model.Endereco;

public interface EnderecoDAO {
public List<Endereco> listarTodos();
	
	public void cadastrar(Endereco endereco);
	
	public void atualizar(Endereco endereco);
	
	public void remover(int idEndereco);
	
	public Endereco buscarPorId(int idEndereco);
}
