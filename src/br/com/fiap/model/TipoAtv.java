package br.com.fiap.model;

public class TipoAtv {

	private int idTipoAtv;
	private String dsTipoAtv;
	
	public TipoAtv(int idTipoAtv, String dsTipoAtv) {
		super();
		this.idTipoAtv = idTipoAtv;
		this.dsTipoAtv = dsTipoAtv;
	}

	public TipoAtv() {
		super();
	}

	public int getIdTipoAtv() {
		return idTipoAtv;
	}

	public void setIdTipoAtv(int idTipoAtv) {
		this.idTipoAtv = idTipoAtv;
	}

	public String getDsTipoAtv() {
		return dsTipoAtv;
	}

	public void setDsTipoAtv(String dsTipoAtv) {
		this.dsTipoAtv = dsTipoAtv;
	}
	
	
}
