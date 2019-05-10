package tn.bns.manifeste.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.bns.manifeste.entities.AppIntervenant;
import tn.bns.manifeste.repositories.IntervenantRepository;
@Service
public class IntervenantImp implements IIntervenant{

	@Autowired
	private IntervenantRepository intervenantRepository;
	
	@Override
	public void saveIntervenant(AppIntervenant intervenant) {
		intervenantRepository.save(intervenant);
		
	}

}
