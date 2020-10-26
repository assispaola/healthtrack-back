package br.com.fiap.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.conexao.ConexaoBDManager;
import br.com.fiap.dao.CidadeDAO;
import br.com.fiap.model.Cidade;

public class CidadeDAOImpl implements CidadeDAO{

	private Connection conexao;
	
	@Override
	public List<Cidade> listarTodos() {
		List<Cidade> lista = new ArrayList<Cidade>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conexao = ConexaoBDManager.obterConexao();
			String sql = "SELECT * FROM H_HTL_Cidade";
			stmt = conexao.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while (rs.next()){
				int idCidade = rs.getInt("ID_CIDADE");
				String dsCidade = rs.getString("DS_CIDADE");
				
				Cidade cidade = new Cidade(idCidade, dsCidade);
				lista.add(cidade);
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
	public void cadastrar(Cidade cidade) {
        PreparedStatement stmt = null;
		
		try {
			conexao = ConexaoBDManager.obterConexao();
			String sql = "INSERT INTO T_HTL_CIDADE (ID_CIDADE, DS_CIDADE) VALUES(seq_usuario.nextval, ?)";
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, cidade.getDsCidade());
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
	public void atualizar(Cidade Cidade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(int idCidade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cidade buscarPorId(int idCidade) {
		// TODO Auto-generated method stub
		return null;
	}

}