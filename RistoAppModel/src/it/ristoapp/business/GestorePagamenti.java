package it.ristoapp.business;

import it.ristoapp.beans.MetodoDiPagamento;

public class GestorePagamenti {
	
	public boolean confermaPrenotazione(Prenotazione p, MetodoDiPagamento mp) {
		if (mp == MetodoDiPagamento.PAGA_SUL_POSTO) {
			// salto il pagamento
		} else if (mp == MetodoDiPagamento.PAYPAL) {
			
		}
		double importo = 100;
		String email = "pippo@";
		
		switch(mp) {
		case CARTA_DI_CREDITO:
			avviaPagamentoConCarta(importo, email);
			break;
		case PAGA_SUL_POSTO:
		case PAYPAL:
		case POSTEPAY:
			
		}
	}

	private void avviaPagamentoConCarta(double importo, String email) {
		contattaLaBanca();
		effetuaIlPagamento();
		
	}



}
