package com.br.estudo.generics.repository.api.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.br.estudo.generics.repository.api.app.dto.EstudoDTO;

@Service
public interface RegrasEstudos {

	public List<EstudoDTO> listar();

	public EstudoDTO buscar();

	public EstudoDTO inserir() ;

	public void excluir() ;

	public EstudoDTO atualizar();
}
