package br.com.cenarioesolucao.conceptcase.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cenarioesolucao.conceptcase.domains.Estado;
import br.com.cenarioesolucao.conceptcase.repositories.EstadoRepository;

@Service
public class EstadoService {
	
	@Autowired
	private EstadoRepository estadoRepo;
	
	public List<Estado> buscarTodas() {
		return estadoRepo.findAllByOrderByNome();
	}

}
