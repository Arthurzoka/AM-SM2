package br.com.fiap.beans;

public class Funcionario extends Pessoa {

	private String dtAdmissao;

	public Funcionario(String nome, int cpf, String rg, String email,
			String senha, String dtAdmissao) {
		super(nome, cpf, rg, email, senha);
		this.dtAdmissao = dtAdmissao;
	}

	public Funcionario(String nome, int cpf, String rg, String email,
			String senha) {
		super(nome, cpf, rg, email, senha);
	}

	public Funcionario() {
		super();
	}

	public String getDtAdmissao() {
		return dtAdmissao;
	}

	public void setDtAdmissao(String dtAdmissao) {
		this.dtAdmissao = dtAdmissao;
	}	
}
