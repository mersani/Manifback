package tn.bns.manifeste.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.bns.manifeste.entities.AppConsignataire;
import tn.bns.manifeste.entities.AppConteneur;
import tn.bns.manifeste.repositories.ConteneurRepository;


@Service
public class ConteneurImpl implements IConteneur{
	
	@Autowired
	private ConteneurRepository conteneurRepository; 
	
	 public void saveConteneur(AppConteneur conteneur) {
		 conteneurRepository.save(conteneur); 
		
	}

	@Override
	public List<AppConteneur> getConteneurs() {
		return conteneurRepository.findAll() ;
	}

	@Override
	public void deleteConteneur(long contId) {
		conteneurRepository.deleteById(contId);
	}

	@Override
	public void updateConteneur(AppConteneur appConteneur, long contId) {
		Optional<AppConteneur> conteneur =conteneurRepository.findById(contId); 
		AppConteneur conteneurB= conteneur.get(); 
		conteneurB.setContReference(appConteneur.getContReference());
		conteneurB.setContNombreColis(appConteneur.getContNombreColis());
		conteneurB.setContType(appConteneur.getContType());
		conteneurB.setContTauxRemplissage(appConteneur.getContTauxRemplissage());
		conteneurB.setContNombreScelle(appConteneur.getContNombreScelle());
		conteneurB.setContMarqueScelle(appConteneur.getContMarqueScelle());
		conteneurB.setContResponsableScelle(appConteneur.getContResponsableScelle());
		conteneurRepository.saveAndFlush(conteneurB); 
		
		
	}

	@Override
	public AppConteneur getOneConteneur(long contId) {
		AppConteneur cont = conteneurRepository.findById(contId).get();
		return cont;
	}

	
	

}
