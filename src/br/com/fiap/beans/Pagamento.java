package br.com.fiap.beans;

public class Pagamento {

	private String dtSaida;
	private Hospedagem hospedagem;
	private FormaPgto formaPgto;
	
	public Pagamento(String dtSaida, Hospedagem hospedagem, FormaPgto formaPgto) {
		super();
		this.dtSaida = dtSaida;
		this.hospedagem = hospedagem;
		this.formaPgto = formaPgto;
	}

	public Pagamento() {
		super();
	}

	public String getDtSaida() {
		return dtSaida;
	}

	public void setDtSaida(String dtSaida) {
		this.dtSaida = dtSaida;
	}

	public Hospedagem getHospedagem() {
		return hospedagem;
	}

	public void setHospedagem(Hospedagem hospedagem) {
		this.hospedagem = hospedagem;
	}

	public FormaPgto getFormaPgto() {
		return formaPgto;
	}

	public void setFormaPgto(FormaPgto formaPgto) {
		this.formaPgto = formaPgto;
	}	
}
