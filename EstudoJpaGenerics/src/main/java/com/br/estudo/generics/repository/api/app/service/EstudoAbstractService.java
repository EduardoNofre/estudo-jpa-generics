package com.br.estudo.generics.repository.api.app.service;

import org.springframework.stereotype.Service;

import com.br.estudo.generics.repository.api.app.repository.EstudoRepository;

@Service
public abstract class EstudoAbstractService extends AbstractDaoService<EstudoRepository> implements RegraServiceGenerics {

	protected transient EstudoRepository estudoRepository;

	public void regraEstudo() {

		regra();
	}
}
