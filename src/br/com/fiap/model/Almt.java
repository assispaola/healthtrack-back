package br.com.fiap.model;

public class Almt {

	private int idAlimento;
	private String nmAlimento;
	private int qtAlimento;
	private double qtCaloria;
	private int idUsuario;
	private int idPeriodo;
	
	public Almt(int idAlimento, String nmAlimento, int qtAlimento, double qtCaloria, int idUsuario, int idPeriodo) {
		super();
		this.idAlimento = idAlimento;
		this.nmAlimento = nmAlimento;
		this.qtAlimento = qtAlimento;
		this.qtCaloria = qtCaloria;
		this.idUsuario = idUsuario;
		this.idPeriodo = idPeriodo;
	}

	public Almt() {
		super();
	}

	public int getIdAlimento() {
		return idAlimento;
	}

	public void setIdAlimento(int idAlimento) {
		this.idAlimento = idAlimento;
	}

	public String getNmAlimento() {
		return nmAlimento;
	}

	public void setNmAlimento(String nmAlimento) {
		this.nmAlimento = nmAlimento;
	}

	public int getQtAlimento() {
		return qtAlimento;
	}

	public void setQtAlimento(int qtAlimento) {
		this.qtAlimento = qtAlimento;
	}

	public double getQtCaloria() {
		return qtCaloria;
	}

	public void setQtCaloria(double qtCaloria) {
		this.qtCaloria = qtCaloria;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getIdPeriodo() {
		return idPeriodo;
	}

	public void setIdPeriodo(int idPeriodo) {
		this.idPeriodo = idPeriodo;
	}
	
	
	
}
