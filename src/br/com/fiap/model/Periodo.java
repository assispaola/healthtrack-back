package br.com.fiap.model;

public class Periodo {

	private int idPeriodo;
	private String nmPeriodo;
	
	public Periodo(int idPeriodo, String nmPeriodo) {
		super();
		this.idPeriodo = idPeriodo;
		this.nmPeriodo = nmPeriodo;
	}

	public Periodo() {
		super();
	}

	public int getIdPeriodo() {
		return idPeriodo;
	}

	public void setIdPeriodo(int idPeriodo) {
		this.idPeriodo = idPeriodo;
	}

	public String getNmPeriodo() {
		return nmPeriodo;
	}

	public void setNmPeriodo(String nmPeriodo) {
		this.nmPeriodo = nmPeriodo;
	}
	
	
}
