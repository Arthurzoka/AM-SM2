package br.com.fiap.beans;

public class Hospedagem {

	private String dtCheckin;
	private Reserva reserva;
	private Funcionario funcionario;
	private Consumo consumo;

	public Hospedagem(String dtCheckin, Reserva reserva, Funcionario funcionario, 
			Consumo consumo) {
		super();
		this.dtCheckin = dtCheckin;
		this.reserva = reserva;
		this.funcionario = funcionario;
		this.consumo = consumo;
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
	
	public Consumo getConsumo() {
		return consumo;
	}

	public void setConsumo(Consumo consumo) {
		this.consumo = consumo;
	}
}
