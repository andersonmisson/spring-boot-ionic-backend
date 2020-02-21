package br.com.kotrix.cursomc.services;

import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;

import br.com.kotrix.cursomc.domain.Cliente;
import br.com.kotrix.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	// Para enviar um email PLANO, é essa opção SIMPLEMAILMESSAGE
	void sendEmail(SimpleMailMessage msg);

	void sendOrderConfirmationHtmlEmail(Pedido obj);
	// MIMEMESSAGE é para mandar um email tipo HTML
	void sendHtmlEmail(MimeMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);

}
