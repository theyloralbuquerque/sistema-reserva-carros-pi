package com.projetointegrador.reservacarros.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetointegrador.reservacarros.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}