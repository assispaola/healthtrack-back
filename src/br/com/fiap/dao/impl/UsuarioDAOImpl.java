package br.com.fiap.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.fiap.conexao.ConexaoBDManager;
import br.com.fiap.dao.UsuarioDAO;
import br.com.fiap.model.Usuario;

public class UsuarioDAOImpl implements UsuarioDAO{

	private Connection conexao;
	
	@Override
	public List<Usuario> listarTodos() {
		List<Usuario> lista = new ArrayList<Usuario>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conexao = ConexaoBDManager.obterConexao();
			String sql = "SELECT * FROM T_HTL_USUARIO";
			stmt = conexao.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while (rs.next()){
				int idUsuario = rs.getInt("ID_USUARIO");
				String dsSenha = rs.getString("DS_SENHA");
				String dsEmail = rs.getString("DS_EMAIL");
				Date dtNascimento = rs.getDate("DT_NASCIMENTO");
				Date dtCadastro = rs.getDate("DT_CADASTRO");
//				java.sql.Date dtCad = rs.getDate("DT_CADASTRO");
//				Calendar dtCadastro = Calendar.getInstance();
//				dtCadastro.setTimeInMillis(dtCad.getTime());
				
				Usuario usuario = new Usuario(idUsuario, dsSenha, dsEmail, dtNascimento, dtCadastro);
				lista.add(usuario);
			}
						
		} catch(SQLException e) {
			e.printStackTrace(); 
		} finally {
			try {
				stmt.close();
				rs.close();
				conexao.close();
			}catch(SQLException e) {
				e.printStackTrace(); 
			}
		}
		return lista;
	}

	@Override
	public void cadastrar(Usuario usuario) {
		PreparedStatement stmt = null;
		
		try {
			conexao = ConexaoBDManager.obterConexao();
			String sql = "INSERT INTO T_HTL_USUARIO (ID_USUARIO, DS_SENHA, DS_EMAIL, DT_NASCIMENTO, DT_CADASTRO) VALUES(seq_usuario.nextval, ?, ?, ?, ?)";
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, usuario.getDsSenha());
			stmt.setString(2, usuario.getDsEmail());
			stmt.setDate(3, usuario.getDtNascimento()); 
			stmt.setDate(4, usuario.getDtCadastro());
			stmt.executeUpdate();
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conexao.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void atualizar(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(int idUsuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario buscarPorId(int idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
