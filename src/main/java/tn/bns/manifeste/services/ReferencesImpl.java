package tn.bns.manifeste.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.bns.manifeste.entities.AppReferences;
import tn.bns.manifeste.repositories.ReferenceRepository;

@Service
public class ReferencesImpl implements IReferences{
	@Autowired
	private ReferenceRepository referenceRepository; 
	
	public void saveReference(AppReferences references) {
		referenceRepository.save(references); 
	}

	@Override
	public List<AppReferences> getreferences() {
		return referenceRepository.findAll();
	}


}
