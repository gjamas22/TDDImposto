package com.gft.tdd.sms;

import com.gft.tdd.model.Pedido;
import com.gft.tdd.service.AcaoLancamentoPedido;

public class NotificadorSms implements AcaoLancamentoPedido{


	public void executar(Pedido pedido) {
		System.out.println("Enviando o email");
		
		
	}
}
