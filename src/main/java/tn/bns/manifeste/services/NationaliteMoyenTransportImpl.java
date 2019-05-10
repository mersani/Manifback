package tn.bns.manifeste.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.bns.manifeste.entities.AppNationaliteMoyenTransport;
import tn.bns.manifeste.repositories.NationaliteMoyenTransportRepository;

@Service
public class NationaliteMoyenTransportImpl implements INationaliteMoyenTransport {

	@Autowired
	private NationaliteMoyenTransportRepository nationaliteMoyenTransportRepository; 
	
	public void saveNationaliteMoyenTransport (AppNationaliteMoyenTransport nationaliteMoyenTransport) {
		nationaliteMoyenTransportRepository.save(nationaliteMoyenTransport); 
	}

	@Override
	public List<AppNationaliteMoyenTransport> getNationalitesMoyensTransports() {
		return nationaliteMoyenTransportRepository.findAll();
	}

	@Override
	public void deleteNationaliteMoyenTransport(long NATmoyenT_id) {
		nationaliteMoyenTransportRepository.deleteById(NATmoyenT_id);	
	}

	/*@Override
	public void updateNationaliteMoyenTransport(AppNationaliteMoyenTransport appNationaliteMoyenTransport,long NATmoyenT_id) {
		Optional<AppNationaliteMoyenTransport> nationaliteMoyenTransport=nationaliteMoyenTransportRepository.findById(NATmoyenT_id);
		AppNationaliteMoyenTransport nationaliteMoyenTransportB=nationaliteMoyenTransport.get(); 
		nationaliteMoyenTransportB.set*/
		
		
}
