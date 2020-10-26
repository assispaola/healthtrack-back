package br.com.fiap.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.conexao.ConexaoBDManager;
import br.com.fiap.dao.EndCompDAO;
import br.com.fiap.model.EndComp;


public class EndCompDAOImpl implements EndCompDAO {

	private Connection conexao;
	
	@Override
	public List<EndComp> listarTodos() {
		List<EndComp> lista = new ArrayList<EndComp>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conexao = ConexaoBDManager.obterConexao();
			String sql = "SELECT * FROM T_HTL_ENDCOMP";
			stmt = conexao.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while (rs.next()){
				int idEndComp = rs.getInt("ID_ENDCOMPLETO");
				int idUsuario = rs.getInt("T_HTL_USUARIO_ID_USUARIO");
				int idCep = rs.getInt("T_HTL_CEP_ID_CEP");
				
				EndComp endcomp = new EndComp(idEndComp, idUsuario, idCep);
				lista.add(endcomp);
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
	public void cadastrar(EndComp endComp) {
PreparedStatement stmt = null;
		
		try {
			conexao = ConexaoBDManager.obterConexao();
			String sql = "INSERT INTO T_HTL_COMPLEMENTO (ID_COMPL, DS_COMPL) VALUES(SEQ.COMPLEMENTO.nextval, ?)";
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, endComp.getIdEndComp());
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
	public void atualizar(EndComp endComp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(int idEndComp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EndComp buscarPorId(int idEndComp) {
		// TODO Auto-generated method stub
		return null;
	}

}
