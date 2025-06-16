package com.br.estudo.generics.repository.api.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.br.estudo.generics.repository.api.app.dto.EstudoDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public abstract class  EstudoAbstractService {

	public List<EstudoDTO> listar() {
		return null;

	}

	public EstudoDTO buscar() {
		return null;

	}

	public EstudoDTO inserir() {
		return null;

	}

	public void excluir() {
		// TODO Auto-generated method stub

	}

	public EstudoDTO atualizar() {
		return null;

	}
}
