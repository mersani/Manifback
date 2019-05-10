package tn.bns.manifeste.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.bns.manifeste.entities.AppTitreTransport;
import tn.bns.manifeste.entities.AppTransporteur;
import tn.bns.manifeste.repositories.TransporteurRepository;

@Service
public class TransporteurImpl implements ITransporteur {

	@Autowired
	private TransporteurRepository transporteurRepository; 
	
	public void saveTransporteur(AppTransporteur Transporteur) {
		transporteurRepository.save(Transporteur); 
	}



	@Override
	public List<AppTransporteur> getTransporteurs() {
	
		return transporteurRepository.findAll();
	}
}
