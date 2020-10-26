package br.com.fiap.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.fiap.conexao.ConexaoBDManager;
import br.com.fiap.dao.PressaoArterialDAO;
import br.com.fiap.model.PressaoArterial;

public class PressaoArterialDAOImpl implements PressaoArterialDAO{
	
	private Connection conexao;

	@Override
	public List<PressaoArterial> listarTodos() {
		List<PressaoArterial> lista = new ArrayList<PressaoArterial>();
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			conexao = ConexaoBDManager.obterConexao();
			String sql = "SELECT * FROM T_HTL_PRESSAO";
			stmt = conexao.prepareStatement(sql);
			rs = stmt.executeQuery();

			while (rs.next()) {
				Integer idPressaoArterial = rs.getInt("ID_PRESSAO");
				Integer nrSistolica = rs.getInt("NR_SISTÓLICA");
				Integer nrDiastolica = rs.getInt("NR_DIASTÓLICA");
				java.sql.Date dtCad = rs.getDate("DT_CADASTRO");
				Calendar dtCadastro = Calendar.getInstance();
				dtCadastro.setTimeInMillis(dtCad.getTime());
				Integer idUsuario = rs.getInt("T_HTL_USUARIO_ID_USUARIO");

				PressaoArterial pressaoArterial = new PressaoArterial(idPressaoArterial, nrSistolica, nrDiastolica,
						dtCadastro, idUsuario);

				lista.add(pressaoArterial);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				rs.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return lista;
	}

	@Override
	public void cadastrar(PressaoArterial pressaoArterial) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(PressaoArterial pressaoArterial) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(int idPressaoArterial) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PressaoArterial buscarPorId(int idPressaoArterial) {
		// TODO Auto-generated method stub
		return null;
	}

}
