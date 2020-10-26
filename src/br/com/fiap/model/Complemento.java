package br.com.fiap.model;

public class Complemento {
    private int idCompl;
    private String dsCompl;
    
	public Complemento(int idCompl, String dsCompl) {
		super();
		this.idCompl = idCompl;
		this.dsCompl = dsCompl;
	}
	
	public Complemento() {
		super();
	}
	public int getIdCompl() {
		return idCompl;
	}
	public void setIdCompl(int idCompl) {
		this.idCompl = idCompl;
	}
	public String getDsCompl() {
		return dsCompl;
	}
	public void setDsCompl(String dsCompl) {
		this.dsCompl = dsCompl;
	}
    
}
