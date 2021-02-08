package br.com.cenarioesolucao.conceptcase.services;

import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;

import br.com.cenarioesolucao.conceptcase.domains.Cliente;
import br.com.cenarioesolucao.conceptcase.domains.Pedido;

/**
 * Padrão de projeto Template Method
 * @author glaucio
 *
 */

public interface EmailService {

	/**
	 * Emails
	 */
	void emailConfirmacaoPedido(Pedido pedido);
	void emailConfirmacaoPedidoHtml(Pedido pedido);
	
	void emailNovaSenha(Cliente cliente, String novaSenha);
	
	
	
	/**
	 * Texto Plano
	 * @param message
	 */
	void enviaEmail(SimpleMailMessage message);
	
	/**
	 * Texto HTML
	 * @param message
	 */
	void enviaEmailHtml(MimeMessage message);
}
