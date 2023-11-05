package com.projetointegrador.reservacarros.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetointegrador.reservacarros.entities.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long> {

}
