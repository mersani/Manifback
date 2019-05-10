package tn.bns.manifeste.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tn.bns.manifeste.entities.AppTitreTransport;

import tn.bns.manifeste.repositories.TitreTransportRepository;

@Service
public class TitreTransportImpl implements ITitreTransport{

	@Autowired
	private TitreTransportRepository titreTransportRepository; 
	
	public void saveTitreTransport(AppTitreTransport titreTransport) {
		titreTransportRepository.save(titreTransport);
	}

	@Override
	public List<AppTitreTransport> getTitresTransports() {
		return titreTransportRepository.findAll(); 
	}

	@Override
	public void updateTT(AppTitreTransport appTitreTransport, long ttCode) {
		Optional<AppTitreTransport> titreTransport = titreTransportRepository.findById(ttCode);
		if(titreTransport.isPresent()) {
			AppTitreTransport titreTransportb= titreTransport.get(); 
			titreTransportb.setTtDatearriveDeNavire(appTitreTransport.getTtDatearriveDeNavire());
			titreTransportb.setTtDateDepartDeNavire(appTitreTransport.getTtDateDepartDeNavire());
			titreTransportb.setTtHeureArrive(appTitreTransport.getTtHeureArrive());
			titreTransportb.setTtNatureMarchandise(appTitreTransport.getTtNatureMarchandise());
			titreTransportb.setTtNatureTitreTransport(appTitreTransport.getTtNatureMarchandise());
			titreTransportb.setTtNumeroDevoyage(appTitreTransport.getTtNumeroDevoyage());
			titreTransportb.setTtReference(appTitreTransport.getTtReference());
			titreTransportRepository.saveAndFlush(titreTransportb);
		}
	}

	@Override
	public void DeleteTT(long ttCode) {
		titreTransportRepository.deleteById(ttCode);
		
	}

	@Override
	public AppTitreTransport getOneTT(long ttCode) {
		AppTitreTransport TT= titreTransportRepository.findById(ttCode).get(); 
		return TT;
	}
}
