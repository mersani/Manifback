package tn.bns.manifeste.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import tn.bns.manifeste.entities.AppBureauDouane;
import tn.bns.manifeste.repositories.BureauDouaneRepository;

public class BureauDouaneImpl implements IBureauDouane{

	@Autowired
	private BureauDouaneRepository bureauDouaneRepository ; 
	
	@Override
	public void saveBureauDouane(AppBureauDouane bureauDouane) {
		bureauDouaneRepository.save(bureauDouane);
	}

	@Override
	public List<AppBureauDouane> getBureauDouanes() {
		return bureauDouaneRepository.findAll();
	}

	@Override
	public void DeleteBureauDouane(long burDId) {
		bureauDouaneRepository.deleteById(burDId);
		
	}

	@Override
	public AppBureauDouane getOneBurD(long burDId) {
        AppBureauDouane bd=bureauDouaneRepository.findById(burDId).get();
		return bd;
	}

	/*@Override
	public void updateBureauDouane(AppBureauDouane appBureauDouane, long burDId) {
		Optional<AppBureauDouane> bureauDouane=bureauDouaneRepository.findById(burDId); 
		if(bureauDouane.isPresent()) {
			AppBureauDouane bureauDouaneB = bureauDouane.get(); 
			
		}*/
		
	}


