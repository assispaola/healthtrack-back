package br.com.fiap.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.conexao.ConexaoBDManager;
import br.com.fiap.dao.ComplementoDAO;
import br.com.fiap.model.Complemento;

public class ComplementoDAOImpl implements ComplementoDAO{
	
	private Connection conexao;

	@Override
	public List<Complemento> listarTodos() {
		List<Complemento> lista = new ArrayList<Complemento>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conexao = ConexaoBDManager.obterConexao();
			String sql = "SELECT * FROM T_HTL_COMPLEMENTO";
			stmt = conexao.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while (rs.next()){
				int idCompl = rs.getInt("ID_COMPL");
				String dsCompl = rs.getString("DS_COMPL");
				Complemento Complemento = new Complemento(idCompl, dsCompl);
				lista.add(Complemento);
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
	public void cadastrar(Complemento complemento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Complemento complemento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(int idComplemento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Complemento buscarPorId(int idComplemento) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
