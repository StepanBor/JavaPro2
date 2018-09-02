package com.gmail.stepan1983.config;

import com.gmail.stepan1983.model.Client;
import com.gmail.stepan1983.model.UserRole;
import com.gmail.stepan1983.service.ClientService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

import java.io.File;

@SpringBootApplication
@EntityScan("com.gmail.stepan1983.*")
public class FotoSharingAplication {

	public static void main(String[] args) {
		SpringApplication.run(FotoSharingAplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(final ClientService clientService) {
		return new CommandLineRunner() {
			@Override
			public void run(String... strings) throws Exception {
				clientService.addClient(new Client("admin", "5baa61e4c9b93f3f0682250b6cf8331b7ee68fd8","mail","name", UserRole.ADMIN, new File("1")));
				clientService.addClient(new Client("user", "5baa61e4c9b93f3f0682250b6cf8331b7ee68fd8","mail","name", UserRole.CUSTOMER,new File("1")));
			}
		};
	}
}
