package tn.bns.manifeste.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.bns.manifeste.entities.AppManifeste;
import tn.bns.manifeste.entities.AppMarchandise;
import tn.bns.manifeste.repositories.MarchandiseRepository;


@Service
public class MarchandiseImpl implements IMarchandise{
	
	@Autowired
	private MarchandiseRepository marchandiseRepository; 
	
	public void saveMarchandise(AppMarchandise marchandise) {
		 marchandiseRepository.save(marchandise); 
		
	}

	@Override
	public List<AppMarchandise> getMarchandises() {
		return  marchandiseRepository.findAll();
	}

	@Override
	public void updateMarchandise(AppMarchandise appMarchandise, long marId) {
		Optional<AppMarchandise> marchandise=marchandiseRepository.findById(marId); 
		if(marchandise.isPresent()) {
			AppMarchandise marchandiseb= marchandise.get(); 
			marchandiseb.setMarMarque(appMarchandise.getMarMarque()); 
			marchandiseb.setMarPoids(appMarchandise.getMarPoids()); 
			marchandiseb.setMarVolume(appMarchandise.getMarVolume()); 
			marchandiseb.setMarDesignation(appMarchandise.getMarDesignation()); 
			marchandiseb.setMarCodeEmballage(appMarchandise.getMarCodeEmballage()); 
			marchandiseb.setMarNombreColis(appMarchandise.getMarNombreColis()); 
			marchandiseb.setMarPoidsBrute(appMarchandise.getMarPoidsBrute());
			marchandiseb.setMarNumColis(appMarchandise.getMarNumColis());
			marchandiseb.setMarStatut(appMarchandise.getMarStatut());
			marchandiseb.setMarIdIntervenant(appMarchandise.getMarIdIntervenant());
			marchandiseb.setMarRaisonSocialeIntervenant(appMarchandise.getMarRaisonSocialeIntervenant());
			marchandiseb.setMarCodeDouaneIntervenant(appMarchandise.getMarCodeDouaneIntervenant());
			marchandiseb.setMarAdresseIntervenant(appMarchandise.getMarAdresseIntervenant());
			marchandiseb.setMarTelephoneIntervenant(appMarchandise.getMarTelephoneIntervenant());
			marchandiseb.setMarIdTransitaire(appMarchandise.getMarIdTransitaire());
			marchandiseb.setMarRaisonSocialeTransitaire(appMarchandise.getMarRaisonSocialeTransitaire());
			marchandiseb.setMarIdMagasin(appMarchandise.getMarIdMagasin());
			marchandiseb.setMarRaisonSocialeMagasin(appMarchandise.getMarRaisonSocialeMagasin());
			marchandiseb.setMarCategorieMarchandise(appMarchandise.getMarCategorieMarchandise());
			marchandiseb.setMarClasse(appMarchandise.getMarClasse());
			marchandiseb.setMarImoPageNumber(appMarchandise.getMarImoPageNumber());
			marchandiseb.setMarImoMs(appMarchandise.getMarImoMs());
			marchandiseb.setMarUndgNumber(appMarchandise.getMarUndgNumber());
			marchandiseb.setMarReceptionnaire(appMarchandise.getMarReceptionnaire());
			marchandiseRepository.saveAndFlush(marchandiseb); 
		}
		
	}

	@Override
	public void deleteMarchandise(long marId) {
		marchandiseRepository.deleteById(marId);
		
	}

	@Override
	public AppMarchandise getOneMarchandise(long marId) {
		AppMarchandise march= marchandiseRepository.findById(marId).get();
		return march;
	}

}
