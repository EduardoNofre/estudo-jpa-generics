package com.br.estudo.generics.repository.api.app.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class AbstractDaoService<T extends JpaRepository<?, ?>> {

	@Autowired
	protected transient T repository;

	@Autowired
	protected transient ModelMapper modelMapper;

}
