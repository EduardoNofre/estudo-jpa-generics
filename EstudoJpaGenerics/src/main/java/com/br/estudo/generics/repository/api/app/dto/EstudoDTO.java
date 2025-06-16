package com.br.estudo.generics.repository.api.app.dto;

import java.time.LocalDateTime;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;


@Data
public class EstudoDTO {
	
	@Schema(name = "id", description = "identificador unico", example = "264671", type = "Integer")
	private Integer id;
	
	@Schema(name = "nome", description = "nome do objeto ou pessoa", example = "264671", type = "Long")
	private String nome;
	
	@Schema(name = "telefone", description = "telefone ou celular", example = "264671", type = "Long")
	private String telefone;
	
	@Schema(name = "endereco", description = "endereço", example = "264671", type = "Long")
	private String endereco;
	
	@Schema(name = "criado_em", description = "data criação", example = "264671", type = "Long")
	private LocalDateTime criado_em;
}
