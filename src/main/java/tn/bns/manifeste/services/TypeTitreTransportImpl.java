package tn.bns.manifeste.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.bns.manifeste.entities.AppTypeTitreTransport;
import tn.bns.manifeste.repositories.TypeTitreTransportRepository;

@Service
public class TypeTitreTransportImpl implements ITypeTitreTransport{
	@Autowired
	private TypeTitreTransportRepository typeTitreTransportRepository; 
	
	public void saveTypeTitreTransport(AppTypeTitreTransport typeTitreTransport) {
		typeTitreTransportRepository.save(typeTitreTransport); 
	}

	@Override
	public List<AppTypeTitreTransport> getTypesTitresTransports() {
		return typeTitreTransportRepository.findAll();
	}

}
