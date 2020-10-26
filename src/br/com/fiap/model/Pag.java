package br.com.fiap.model;

public class Pag {

	private int idPag;
	private int qtParcela;
	private double vlTotal;
	private int idUsuario;
	private int idTipo;
	
	public Pag(int idPag, int qtParcela, double vlTotal, int idUsuario, int idTipo) {
		super();
		this.idPag = idPag;
		this.qtParcela = qtParcela;
		this.vlTotal = vlTotal;
		this.idUsuario = idUsuario;
		this.idTipo = idTipo;
	}
	
	public Pag() {
		super();
	}

	public int getIdPag() {
		return idPag;
	}

	public void setIdPag(int idPag) {
		this.idPag = idPag;
	}

	public int getQtParcela() {
		return qtParcela;
	}

	public void setQtParcela(int qtParcela) {
		this.qtParcela = qtParcela;
	}

	public double getVlTotal() {
		return vlTotal;
	}

	public void setVlTotal(double vlTotal) {
		this.vlTotal = vlTotal;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}
	
	
	
}
