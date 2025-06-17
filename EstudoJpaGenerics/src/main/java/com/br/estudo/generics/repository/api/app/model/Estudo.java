package com.br.estudo.generics.repository.api.app.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Estudo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nome ")
	private String nome;
	
	@Column(name = "telefone ")
	private String telefone;
	
	@Column(name = "endereco ")
	private String endereco;
	
	@Column(name = "criado_em ")
	private LocalDateTime criadoEm;
}
