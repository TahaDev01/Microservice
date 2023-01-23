package com.shopMaster.clientService;


import com.shopMaster.clientService.Entity.Client;
import com.shopMaster.clientService.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientServiceApplication implements CommandLineRunner {
    @Autowired
	ClientRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(ClientServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Client(null,"taha","dourhmi","safi",32323232));
	}
}
