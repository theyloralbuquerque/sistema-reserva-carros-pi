package com.projetointegrador.reservacarros.config;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetointegrador.reservacarros.entities.Carro;
import com.projetointegrador.reservacarros.entities.Usuario;
import com.projetointegrador.reservacarros.repositories.CarroRepository;
import com.projetointegrador.reservacarros.repositories.UsuarioRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private CarroRepository carroRepository;
	
	@Autowired
	private UsuarioRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Usuario u1 = new Usuario(null, "maria@gmail.com", "12345678", "Maria Silva", 1, LocalDate.parse("1990-06-23"), Instant.parse("2019-07-22T15:21:22Z"));
		Usuario u2 = new Usuario(null, "joao@gmail.com", "12345678", "João Silva", 1, LocalDate.parse("1991-07-10"), Instant.parse("2020-06-09T10:21:22Z"));
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
		Carro palio = new Carro(null, "Fiat", "Palio", 2019, 2020, "52.594", 
				"O Fiat Palio 2020 é um carro compacto produzido pela fabricante italiana Fiat. Ele oferece um design moderno, boa economia de combustível e é conhecido por sua praticidade e versatilidade.", null);
		Carro gol = new Carro(null, "Volkswagen", "Gol", 2020, 2020, "50.240",
				"O Volkswagen Gol 2020 é um compacto da renomada fabricante alemã Volkswagen. Reconhecido por sua durabilidade, o Gol 2020 oferece um design clássico e elegante, com um foco em eficiência e economia de combustível.", u1);
	
		carroRepository.saveAll(Arrays.asList(palio, gol));
		

	}

}
