package com.br.estudo.generics.repository.api.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.estudo.generics.repository.api.app.model.Estudo;

@Repository
public interface EstudoRepository extends JpaRepository<Estudo, Integer>{

}
