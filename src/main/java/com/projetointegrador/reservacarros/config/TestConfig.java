package com.projetointegrador.reservacarros.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetointegrador.reservacarros.entities.Carro;
import com.projetointegrador.reservacarros.repositories.CarroRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private CarroRepository carroRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Carro palio = new Carro(null, "Fiat", "Palio", 2019, 2020, "52.594", 
				"O Fiat Palio 2020 é um carro compacto produzido pela fabricante italiana Fiat. Ele oferece um design moderno, boa economia de combustível e é conhecido por sua praticidade e versatilidade.");
		Carro gol = new Carro(null, "Volkswagen", "Gol", 2020, 2020, "50.240",
				"O Volkswagen Gol 2020 é um compacto da renomada fabricante alemã Volkswagen. Reconhecido por sua durabilidade, o Gol 2020 oferece um design clássico e elegante, com um foco em eficiência e economia de combustível.");
	
		carroRepository.saveAll(Arrays.asList(palio, gol));
		
	}

}
