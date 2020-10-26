package br.com.fiap.model;


import java.sql.Date;
import java.util.Calendar;

public class Usuario {

	private int idUsuario;
	private String dsSenha;
	private String dsEmail;
	private Date dtNascimento;
	private Date dtCadastro;
	
	public Usuario(int idUsuario, String dsSenha, String dsEmail, Date dtNascimento, Date dtCadastro) {
		super();
		this.idUsuario = idUsuario;
		this.dsSenha = dsSenha;
		this.dsEmail = dsEmail;
		this.dtNascimento = dtNascimento;
		this.dtCadastro = dtCadastro;
	}

	public Usuario() {
		super();
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getDsSenha() {
		return dsSenha;
	}

	public void setDsSenha(String dsSenha) {
		this.dsSenha = dsSenha;
	}

	public String getDsEmail() {
		return dsEmail;
	}

	public void setDsEmail(String dsEmail) {
		this.dsEmail = dsEmail;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public Date getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(Date dtCadastro) {
		this.dtCadastro = dtCadastro;
	}
	
	
	
}



