package br.com.cenarioesolucao.conceptcase.services;

import org.springframework.security.core.context.SecurityContextHolder;

import br.com.cenarioesolucao.conceptcase.security.UserSpringSecurity;

public class UserService {

	public static UserSpringSecurity authenticated() {
		try {
			// Retorna o usuario logado
			return (UserSpringSecurity) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		} catch (Exception e) {
			return null;
		}
	}
}
