package com.br.estudo.generics.repository.api.app.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * Instância Bean do ModelMapper para mapper de Entity para DTO ou vice-versa.
 * </p>
 * 
 * Referência: {@linkplain http://modelmapper.org/getting-started/}
 * 
 * @author cleberson.pauluci
 *
 */
@Slf4j
@Configuration
@ComponentScan("com.spring.boot.api.categoria.app")
public class ApplicationModelMapper {

  @Bean
  public ModelMapper modelMapper() {
	log.info("[MODEL MAPPER] - modelMapper - inicializado");
    final ModelMapper mp = new ModelMapper();
    mp.getConfiguration().setAmbiguityIgnored(true).setDeepCopyEnabled(false)
        .setFullTypeMatchingRequired(true).setMatchingStrategy(MatchingStrategies.STRICT);
    return mp;
  }
}
