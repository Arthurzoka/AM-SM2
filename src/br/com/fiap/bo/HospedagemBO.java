package br.com.fiap.bo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import br.com.fiap.beans.Consumo;
import br.com.fiap.beans.Funcionario;
import br.com.fiap.beans.Hospedagem;
import br.com.fiap.beans.Reserva;
import br.com.fiap.dao.HospedagemDAO;

public class HospedagemBO {

	public HospedagemBO () {
		
	}
	
	public boolean inserirHospedagem (String dtCheckin, Reserva reserva, 
			Funcionario funcionario, Consumo consumo) throws Exception {
		Hospedagem hospedagem = new Hospedagem(dtCheckin, reserva, funcionario, 
				consumo);
		
		DateFormat format = new SimpleDateFormat("dd/MM/yy", Locale.getDefault());
		Date dateCheck = format.parse(dtCheckin);
		Date dateRes = format.parse(reserva.getDtEntrada());
		
		Calendar check = null;
		Calendar reserv = null;
		
		check.setTime(dateCheck);
		reserv.setTime(dateRes);
		
		//implementar diferença de datas
		if (true) {
			return false;
		} else {
			HospedagemDAO dao = new HospedagemDAO();
			dao.insert(hospedagem);
			return true;
		}		
	}
}
