package com.gft.tdd.service;

import java.util.List;

import com.gft.tdd.email.NotificadorEmail;
import com.gft.tdd.model.Pedido;
import com.gft.tdd.repository.Pedidos;
import com.gft.tdd.sms.NotificadorSms;

public class PedidoService {
	
	private List<AcaoLancamentoPedido> acoes;
	
	
	public PedidoService(List<AcaoLancamentoPedido> acoes ) {
		this.acoes = acoes;
	}

	public double lancar(Pedido pedido) {
		double imposto = pedido.getValor()*0.1;
		
		acoes.forEach(a -> a.executar(pedido));
	
		return imposto;
	}

}
