package com.projetointegrador.reservacarros.entities;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_usuario")
@Getter @Setter
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;
	private String email;
	private String senha;
	private String nome;
	private Integer ativo; 
	private LocalDate dataNascimento;
	private Instant dataCadastro;
	
	@OneToMany(mappedBy = "cliente") // um-para-muitos.
	private Set<Carro> carros = new HashSet<>();
	
	public Usuario() {
	}
	
	public Usuario(Long idUsuario, String email, String senha, String nome, Integer ativo, LocalDate dataNascimento,
			Instant dataCadastro) {
		this.idUsuario = idUsuario;
		this.email = email;
		this.senha = senha;
		this.nome = nome;
		this.ativo = ativo;
		this.dataNascimento = dataNascimento;
		this.dataCadastro = dataCadastro;
	}
	
	public Set<Carro> getCarros() {
		return carros;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(idUsuario);
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(idUsuario, other.idUsuario);
	}

}
