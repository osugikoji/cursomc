package br.com.cursospring.services;

import org.springframework.mail.SimpleMailMessage;

import br.com.cursospring.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
