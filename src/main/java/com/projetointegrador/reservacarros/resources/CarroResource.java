package com.projetointegrador.reservacarros.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetointegrador.reservacarros.entities.Carro;

@RestController
@RequestMapping(value = "/carros")
public class CarroResource {
	
	@GetMapping
	public ResponseEntity<Carro> findAll() {
		Carro c = new Carro(1L, "Fiat", "Palio", 2019, 2020, "52.594", "A perua mede 4251 mm de comprimento (4310 na Adventure), 1639 mm de largura (1721 na Adventure), 1515 mm de altura (1643 na Adventure) e 2437 mm de entre-eixos (2466 na Adventure). O porta-malas comporta 460 litros de bagagem.");
		return ResponseEntity.ok().body(c);
	}

}
