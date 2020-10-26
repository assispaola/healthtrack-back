package br.com.fiap.model;

import java.util.Calendar;

public class Imc {
	
	private static Integer s = 0;
	private Integer idImc;
	private Double valor;
	private Calendar dtCadastro;
	private Double peso;
	private Double altura;
	private Integer idUsuario;




    

    public Imc() {
    }

    public Imc(Integer idImc, Double valor, Calendar dtCadastro, Double peso, Double altura, Integer idUsuario) {
	super();
	this.idImc = idImc;
	this.valor = valor;
	this.dtCadastro = dtCadastro;
	this.peso = peso;
	this.altura = altura;
	this.idUsuario = idUsuario;
}

	public static Integer getS() {
        return s;
    }

    public static void setS(Integer s) {
        Imc.s = s;
    }
    
    public Integer getIdImc() {
		return idImc;
	}

	public void setIdImc(Integer idImc) {
		this.idImc = idImc;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Calendar getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(Calendar dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}


}
