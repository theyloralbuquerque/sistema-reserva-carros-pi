package com.projetointegrador.reservacarros.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table (name = "tb_carro")
@Getter @Setter
public class Carro implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCarro;
	private String marca;
	private String modelo;
	private Integer anoFabricacao;
	private Integer anoModelo;
	private String valor;
	private String descricao;
	
	@ManyToOne // muitos-para-um.
	@JoinColumn(name = "id_cliente") // Define a coluna id_cliente como FK na tabela Carro.
	private Usuario cliente;
	
	public Carro() {
	}

	public Carro(Long idCarro, String marca, String modelo, Integer anoFabricacao, Integer anoModelo, String valor,
			String descricao, Usuario cliente) {
		this.idCarro = idCarro;
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.valor = valor;
		this.descricao = descricao;
		this.cliente = cliente;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(idCarro);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		return Objects.equals(idCarro, other.idCarro);
	}



}
