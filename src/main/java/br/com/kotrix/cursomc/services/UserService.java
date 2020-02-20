package br.com.kotrix.cursomc.services;

import org.springframework.security.core.context.SecurityContextHolder;

import br.com.kotrix.cursomc.security.UserSS;

public class UserService {

	public static UserSS authenticated() {
		
		try {
			return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		} catch (Exception e) {
			return null;
		}
	}
}
