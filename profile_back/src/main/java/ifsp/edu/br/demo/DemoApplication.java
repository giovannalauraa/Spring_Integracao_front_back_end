package ifsp.edu.br.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ifsp.edu.br.demo.repository.PerfilRepository;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		PerfilRepository.init();
		SpringApplication.run(DemoApplication.class, args);
	}

}
