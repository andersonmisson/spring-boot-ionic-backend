package br.com.kotrix.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import br.com.kotrix.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
