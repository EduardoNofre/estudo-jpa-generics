package com.br.estudo.generics.repository.api.app.service;

import java.util.List;

import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import com.br.estudo.generics.repository.api.app.dto.EstudoDTO;
import com.br.estudo.generics.repository.api.app.repository.EstudoRepository;

@Service
public class EstudoServiceImpl extends AbstractDaoService<EstudoRepository> implements EstudoService {

	@Override
	public List<EstudoDTO> listar() {
		
		return modelMapper.map(repository.findAll(), new TypeToken<List<EstudoDTO>>() {}.getType());
	}

	@Override
	public EstudoDTO buscar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstudoDTO inserir() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluir() {
		// TODO Auto-generated method stub

	}

	@Override
	public EstudoDTO atualizar() {
		// TODO Auto-generated method stub
		return null;
	}

}
