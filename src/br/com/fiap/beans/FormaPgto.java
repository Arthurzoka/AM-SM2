package br.com.fiap.beans;

public class FormaPgto {

	private double preco;
	private String descricao;
	private int doc;
	
	public FormaPgto(double preco, String descricao, int doc) {
		super();
		this.preco = preco;
		this.descricao = descricao;
		this.doc = doc;
	}

	public FormaPgto() {
		super();
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getDoc() {
		return doc;
	}

	public void setDoc(int doc) {
		this.doc = doc;
	}
}
