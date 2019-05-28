package tn.bns.manifeste.services;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import tn.bns.manifeste.entities.AppEtatD;
import tn.bns.manifeste.repositories.EtatDRepository;

import java.util.List;

@Service
public class EtatDImpl implements IEtatD{

	@Autowired
	private EtatDRepository etatDRepository; 
	@Override
	public AppEtatD saveEtatD(AppEtatD etatD) {
		return etatDRepository.saveAndFlush(etatD);
		
	}

	@Override
	public List<AppEtatD> getAll() {
		return etatDRepository.findAll();
	}

}
