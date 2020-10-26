package br.com.fiap.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.conexao.ConexaoBDManager;
import br.com.fiap.dao.UfDAO;
import br.com.fiap.model.Uf;

public class UfDAOImpl implements UfDAO{

	private Connection conexao;
	
	@Override
	public List<Uf> listarTodos() {
		List<Uf> lista = new ArrayList<Uf>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conexao = ConexaoBDManager.obterConexao();
			String sql = "SELECT * FROM T_HTL_Uf";
			stmt = conexao.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while (rs.next()){
				int idUf = rs.getInt("ID_Uf");
				String dsUf = rs.getString("DS_Uf");
				
				Uf uf = new Uf(idUf, dsUf);
				lista.add(uf);
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
	public void cadastrar(Uf Uf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Uf Uf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(int idUf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Uf buscarPorId(int idUf) {
		// TODO Auto-generated method stub
		return null;
	}

}