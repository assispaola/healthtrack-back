package br.com.fiap.model;

public class Uf {
    private int idUf;
    private String dsUf;
    
	public Uf(int idUf, String dsUf) {
		super();
		this.idUf = idUf;
		this.dsUf = dsUf;
	}
	
	public Uf() {
		super();
	}
	public int getIdUf() {
		return idUf;
	}
	public void setIdUf(int idUf) {
		this.idUf = idUf;
	}
	public String getDsUf() {
		return dsUf;
	}
	public void setDsUf(String dsUf) {
		this.dsUf = dsUf;
	}
    
    
}
