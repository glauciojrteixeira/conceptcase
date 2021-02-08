package br.com.cenarioesolucao.conceptcase.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cenarioesolucao.conceptcase.domains.Municipio;
import br.com.cenarioesolucao.conceptcase.repositories.MunicipioRepository;

@Service
public class MunicipioService {
	
	@Autowired
	private MunicipioRepository municipioRepo;
	
	public List<Municipio> buscarEstado(Integer estadoId) {
		return municipioRepo.procurarMunicipios(estadoId);
	}

}
