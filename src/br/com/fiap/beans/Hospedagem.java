package br.com.fiap.beans;

public class Hospedagem {

	private String dtCheckin;
	private Reserva reserva;
	private Funcionario funcionario;
	
	public Hospedagem(String dtCheckin, Reserva reserva, Funcionario funcionario) {
		super();
		this.dtCheckin = dtCheckin;
		this.reserva = reserva;
		this.funcionario = funcionario;
	}

	public Hospedagem() {
		super();
	}

	public String getDtCheckin() {
		return dtCheckin;
	}

	public void setDtCheckin(String dtCheckin) {
		this.dtCheckin = dtCheckin;
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
}
