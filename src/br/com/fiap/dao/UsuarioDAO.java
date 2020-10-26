package br.com.fiap.dao;

import java.util.Date;
import java.util.List;

import br.com.fiap.model.Usuario;

public interface UsuarioDAO {
	public List<Usuario> listarTodos();
	
	public void cadastrar(Usuario usuario);
	
	public void atualizar(Usuario usuario);
	
	public void remover(int idUsuario);
	
	public Usuario buscarPorId(int idUsuario);

}
