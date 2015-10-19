package br.com.fiap.beans;

public class Reserva {

	private String dtEntrada;
	private String dtFinal;
	private String status;
	private Cliente cliente;
	public Reserva(String dtEntrada, String dtFinal, String status,
			Cliente cliente) {
		super();
		this.dtEntrada = dtEntrada;
		this.dtFinal = dtFinal;
		this.status = status;
		this.cliente = cliente;
	}
	public Reserva() {
		super();
	}
	public String getDtEntrada() {
		return dtEntrada;
	}
	public void setDtEntrada(String dtEntrada) {
		this.dtEntrada = dtEntrada;
	}
	public String getDtFinal() {
		return dtFinal;
	}
	public void setDtFinal(String dtFinal) {
		this.dtFinal = dtFinal;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
