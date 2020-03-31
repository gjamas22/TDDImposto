package com.gft.tdd.service;

import com.gft.tdd.email.NotificadorEmail;
import com.gft.tdd.model.Pedido;
import com.gft.tdd.repository.Pedidos;
import com.gft.tdd.sms.NotificadorSms;

public class PedidoService {

	private Pedidos pedidos;
	private NotificadorEmail notificadorEmail;
	private NotificadorSms notificadorSms; 
	
	public PedidoService(Pedidos pedidos, NotificadorEmail notificadorEmail, NotificadorSms notificadorSms) {
		super();
		this.pedidos = pedidos;
		this.notificadorEmail = notificadorEmail;
		this.notificadorSms = notificadorSms;
	}

	public double lancar(Pedido pedido) {
		double imposto = pedido.getValor()*0.1;
		
	pedidos.guardar(pedido);
	notificadorEmail.enviar(pedido);
	notificadorSms.notificar(pedido);
	
		
		return imposto;
	}

}
