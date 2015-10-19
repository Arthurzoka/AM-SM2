package br.com.fiap.beans;

public class Consumo {

	private double servicos;
	private double produtos;	
	
	public Consumo(double servicos, double produtos) {
		super();
		this.servicos = servicos;
		this.produtos = produtos;
	}	
	
	public Consumo() {
		super();
	}

	public double getServicos() {
		return servicos;
	}
	public void setServicos(double servicos) {
		this.servicos = servicos;
	}
	public double getProdutos() {
		return produtos;
	}
	public void setProdutos(double produtos) {
		this.produtos = produtos;
	}
}
