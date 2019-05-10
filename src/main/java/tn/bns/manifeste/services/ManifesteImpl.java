package tn.bns.manifeste.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.bns.manifeste.entities.AppManifeste;
import tn.bns.manifeste.repositories.ManifesteRepository;


@Service
public class ManifesteImpl implements IManifeste {
	
	@Autowired
	private ManifesteRepository manifesteRepository; 
	
	@Override
	public void saveManifeste(AppManifeste manifeste) {
		manifesteRepository.save(manifeste); 
	}

	@Override
	public List<AppManifeste> getManifeste() {
		return manifesteRepository.findAll();
	}

	@Override
	public void DeleteManifeste(long manId) {
		manifesteRepository.deleteById(manId);
		
	}

	@Override
	public void updateManifeste(AppManifeste appManifeste, long manId) {
		Optional<AppManifeste> manifeste = manifesteRepository.findById(manId); 
		if(manifeste.isPresent()){
			AppManifeste manifesteb = manifeste.get();
			manifesteb.setAcconier(appManifeste.getAcconier());
			manifesteb.setManNumVoyage(appManifeste.getManNumVoyage());
			manifesteb.setManDateDepart(appManifeste.getManDateDepart());
			manifesteb.setManDateArrive(appManifeste.getManDateArrive());
			manifesteb.setManHeureArrive(appManifeste.getManHeureArrive());
			manifesteb.setManNumEnregistrement(appManifeste.getManNumEnregistrement());
			manifesteb.setManDateEnregistrement(appManifeste.getManDateEnregistrement());
			manifesteb.setManLieuChargement(appManifeste.getManLieuChargement());
			manifesteb.setMANLieuDestination(appManifeste.getMANLieuDestination());
			manifesteb.setManModeTransport(appManifeste.getManModeTransport());
			manifesteb.setManTypeManifeste(appManifeste.getManTypeManifeste());
			manifesteb.setManNumEscale(appManifeste.getManNumEscale());
			manifesteb.setManjaugeBrute(appManifeste.getManjaugeBrute());
			manifesteb.setManJaugeNette(appManifeste.getManJaugeNette());
			manifesteRepository.saveAndFlush(manifesteb); 
			
		}
		
	}

	@Override
	public AppManifeste getOneManifeste(long manId) {
		AppManifeste manif=manifesteRepository.findById(manId).get();
				return manif;
	}

	
				 
				 
	}


	


