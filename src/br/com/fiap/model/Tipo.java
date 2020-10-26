package br.com.fiap.model;

public class Tipo {

	private int idTipo;
	private String nmTipoPag;
	
	public Tipo(int idTipo, String nmTipoPag) {
		super();
		this.idTipo = idTipo;
		this.nmTipoPag = nmTipoPag;
	}

	public Tipo() {
		super();
	}

	public int getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}

	public String getNmTipoPag() {
		return nmTipoPag;
	}

	public void setNmTipoPag(String nmTipoPag) {
		this.nmTipoPag = nmTipoPag;
	}
	
	
}
