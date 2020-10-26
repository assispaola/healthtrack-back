package br.com.fiap.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.conexao.ConexaoBDManager;
import br.com.fiap.dao.AlimentoDAO;
import br.com.fiap.model.Almt;

public class AlimentoDAOImp implements AlimentoDAO {
	private Connection conexao;
	
	@Override
	public List<Almt> listarTodos() {
		List<Almt> lista = new ArrayList<Almt>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conexao = ConexaoBDManager.obterConexao();
			String sql = "SELECT * FROM T_HTL_ALMT";
			stmt = conexao.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			
//			private int idAlimento;
//			private String nmAlimento;
//			private int qtAlimento;
//			private double qtCaloria;
//			private int idUsuario;
//			private int idPeriodo;
			
			
			while (rs.next()){
				int idAlimento = rs.getInt("ID_ALIMENTO");
				String nmAlimento = rs.getString("NM_ALIMENTO");
				int qtAlimento = rs.getInt("QT_ALIMENTO");
				double qtCaloria = rs.getDouble("QT_CALORIA");
				int idUsuario = rs.getInt("T_HTL_USUARIO_ID_USUARIO");
				int idPeriodo = rs.getInt("T_HTL_PERIODO_ID_PERIODO");
				
				Almt alimento = new Almt(idAlimento, nmAlimento, qtAlimento, qtCaloria, idUsuario, idPeriodo);
				lista.add(alimento);
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
	public void cadastrar(Almt almt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Almt almt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(int idAlmt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Almt buscarPorId(int idAlmt) {
		// TODO Auto-generated method stub
		return null;
	}

}
