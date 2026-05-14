package br.ufscar.dc.dsw;

import br.ufscar.dc.dsw.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MuralApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(MuralApplication.class, args);

		var userRepository = context.getBean(UserRepository.class);

		if (userRepository.count() == 0) {
			userRepository.save("admin", "admin", "ADMIN");
			userRepository.save("user", "user", "USER");

			System.out.println(">>> Usuários 'admin' e 'user' criados com sucesso.");
		}
	}
}