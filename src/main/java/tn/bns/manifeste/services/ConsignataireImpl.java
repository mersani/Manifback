package tn.bns.manifeste.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.bns.manifeste.entities.AppConsignataire;
import tn.bns.manifeste.entities.AppUser;
import tn.bns.manifeste.repositories.ConsignataireRepository;

@Service
public class ConsignataireImpl implements IConsignataire{

	@Autowired
	private ConsignataireRepository consignataireRepository; 
	
	@Override
	public void saveConsignataire(AppConsignataire Consignataire) {
		consignataireRepository.save(Consignataire); 
		
	}

	@Override
	public List<AppConsignataire> getConsignataires() {
		return consignataireRepository.findAll(); 
	}

	@Override
	public void updateCons(AppConsignataire appConsignataire, long id) {
	Optional<AppConsignataire> consignataire=consignataireRepository.findById(id); 
	if(consignataire.isPresent()) {
		AppConsignataire consignataireb=consignataire.get(); 
		consignataireb.setConsAdresse(appConsignataire.getConsAdresse());
		consignataireRepository.saveAndFlush(consignataireb);
	}
		
	}

	@Override
	public void DeleteCons(long id) {
		consignataireRepository.deleteById(id);
	}

	@Override
	public AppConsignataire getOneConsignataire(long id) {
		AppConsignataire cons = consignataireRepository.findById(id).get();
		return cons;
	}
	

}
