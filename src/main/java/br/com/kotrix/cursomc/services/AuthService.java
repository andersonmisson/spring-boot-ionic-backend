package br.com.kotrix.cursomc.services;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.kotrix.cursomc.domain.Cliente;
import br.com.kotrix.cursomc.repositories.ClienteRepository;
import br.com.kotrix.cursomc.services.exception.ObjectNotFoundException;

@Service
public class AuthService {

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private BCryptPasswordEncoder pe; // Password Encoder

	@Autowired
	private EmailService emailService;

	private Random rand = new Random();

	public void sendNewPassword(String email) {

		Cliente cliente = clienteRepository.findByEmail(email);
		if (cliente == null) {
			throw new ObjectNotFoundException("Email não cadastrado");
		}
		String newPass = newPassword();
		cliente.setSenha(pe.encode(newPass));

		clienteRepository.save(cliente);
		emailService.sendNewPasswordEmail(cliente, newPass);

	}

	private String newPassword() {
		char[] vet = new char[10];
		for (int i = 0; i < 10; i++) {
			vet[i] = randomChar();
		}
		return new String(vet);
	}

	private char randomChar() {
		int opt = rand.nextInt(3);
		if (opt == 1) { // gera um digito
			return (char) (rand.nextInt(10) + 48); // Unicode 0 é n48 e 9 e n57

		} else if (opt == 1) { // gera letra maiuscula
			return (char) (rand.nextInt(26) + 65); // Unicode para A é 65

		} else { // gera letra minuscula
			return (char) (rand.nextInt(26) + 97); // Unicode para "a" é 97

		}

	}

}
