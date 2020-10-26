package br.com.fiap.dao.impl;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.conexao.ConexaoBDManager;
import br.com.fiap.dao.PagDAO;
import br.com.fiap.model.Pag;



public class PagamentoDAOImpl implements PagDAO {

	private Connection conexao;
	
	@Override
	public List<Pag> listarTodos() {
		List<Pag> lista = new ArrayList<Pag>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conexao = ConexaoBDManager.obterConexao();
			String sql = "SELECT * FROM T_HTL_PAG";
			stmt = conexao.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while (rs.next()){
				int idPag = rs.getInt("ID_PAG");
				int qtParcela = rs.getInt("QT_PARCELA");
				double vlTotal = rs.getDouble("VL_TOTAL");
				int idUsuario = rs.getInt("T_HTL_USUARIO_ID_USUARIO");
				int idTipo = rs.getInt("T_HTL_TIPO_ID_TIPO");
				
				Pag pag = new Pag(idPag, qtParcela, vlTotal, idUsuario, idTipo);
				lista.add(pag);
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

	public void cadastrar(Pag pag) {
		PreparedStatement stmt = null;
		
		try {
			conexao = ConexaoBDManager.obterConexao();
			String sql = "INSERT INTO T_HTL_PAG (ID_PAG, QT_PARCELA, VL_TOTAL, T_HTL_USUARIO_ID_USUARIO, T_HTL_TIPO_ID_TIPO) VALUES(seq_pag.nextval, ?, ?, ?, ?)";
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, pag.getQtParcela());
			stmt.setDouble(2, pag.getVlTotal());
			stmt.setInt(3, pag.getIdUsuario()); 
			stmt.setInt(4, pag.getIdTipo());
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
	public void atualizar(Pag pag) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(int idPag) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pag buscarPorId(int idPag) {
		// TODO Auto-generated method stub
		return null;
	}

}
