package br.com.fiap.beans;

public class Cliente extends Pessoa {
	
	private String dtNasc;
	private Endereco endereco;
	
	public Cliente(String nome, int cpf, String rg, String email, String senha,
			String dtNasc, Endereco endereco) {
		super(nome, cpf, rg, email, senha);
		this.dtNasc = dtNasc;
		this.endereco = endereco;
	}

	public Cliente(String nome, int cpf, String rg, String email, String senha) {
		super(nome, cpf, rg, email, senha);
	}

	public Cliente() {
		super();
	}

	public String getDtNasc() {
		return dtNasc;
	}

	public void setDtNasc(String dtNasc) {
		this.dtNasc = dtNasc;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
