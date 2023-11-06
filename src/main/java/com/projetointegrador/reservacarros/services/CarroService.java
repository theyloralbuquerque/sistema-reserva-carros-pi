package com.projetointegrador.reservacarros.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetointegrador.reservacarros.entities.Carro;
import com.projetointegrador.reservacarros.repositories.CarroRepository;

@Service
public class CarroService {

	@Autowired
	private CarroRepository repository;
	
	public List<Carro> findAll(){
		return repository.findAll();
	}
}
