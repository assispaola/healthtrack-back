package br.com.fiap.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.fiap.conexao.ConexaoBDManager;
import br.com.fiap.dao.AtividadeDAO;
import br.com.fiap.model.Atividade;

public class AtividadeDAOImp implements AtividadeDAO {
	private Connection conexao;

	@Override
	public List<Atividade> listarTodos() {
		List<Atividade> lista = new ArrayList<Atividade>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conexao = ConexaoBDManager.obterConexao();
			String sql = "SELECT * FROM T_HTL_ATV";
			stmt = conexao.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			
			
			while (rs.next()){
				int idAtividade = rs.getInt("ID_ATV");
				java.sql.Date dtCad = rs.getDate("DT_CADASTRO");
				Calendar dtCadastro = Calendar.getInstance();
				dtCadastro.setTimeInMillis(dtCad.getTime());
				int vlTempo = rs.getInt("VL_TEMPO");
				double vlDistancia = rs.getDouble("VL_DISTANCIA");
				int idTipoAtv = rs.getInt("T_HTL_TIPOATV_ID_TIPOATV");
				int idUsuario = rs.getInt("T_HTL_USUARIO_ID_USUARIO");
				
				Atividade atividade = new Atividade(idAtividade, dtCadastro, vlTempo, vlDistancia, idTipoAtv, idUsuario);
				lista.add(atividade);
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
	public void cadastrar(Atividade atividade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Atividade atividade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(int idAtividade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Atividade buscarPorId(int idAtividade) {
		// TODO Auto-generated method stub
		return null;
	}
}
	
	