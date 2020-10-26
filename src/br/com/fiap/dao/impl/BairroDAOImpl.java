package br.com.fiap.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.conexao.ConexaoBDManager;
import br.com.fiap.dao.BairroDAO;
import br.com.fiap.model.Bairro;

public class BairroDAOImpl implements BairroDAO{

	private Connection conexao;
	
	@Override
	public List<Bairro> listarTodos() {
		List<Bairro> lista = new ArrayList<Bairro>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conexao = ConexaoBDManager.obterConexao();
			String sql = "SELECT * FROM T_HTL_Bairro";
			stmt = conexao.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while (rs.next()){
				int idBairro = rs.getInt("ID_Bairro");
				String dsBairro = rs.getString("DS_BAIRRO");
				Bairro Bairro = new Bairro(idBairro, dsBairro);
				lista.add(Bairro);
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
	public void cadastrar(Bairro Bairro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Bairro Bairro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(int idBairro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Bairro buscarPorId(int idBairro) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}

