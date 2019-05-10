package tn.bns.manifeste.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.bns.manifeste.entities.AppPieceJointe;
import tn.bns.manifeste.repositories.PieceJointeRepository;

@Service
public class PieceJointeImpl implements IPieceJointe{
	@Autowired
	private PieceJointeRepository pieceJointeRepository; 
	
	public void savePieceJointe(AppPieceJointe pieceJointe) {
		pieceJointeRepository.save(pieceJointe); 
	}

	@Override
	public List<AppPieceJointe> getPieceJointes() {

		return pieceJointeRepository.findAll();
	}

	@Override
	public void deletePieceJointe(long pieceJointeId) {
		 pieceJointeRepository.deleteById(pieceJointeId);
	}

	@Override
	public void updatePieceJointe(AppPieceJointe appPieceJointe, long pieceJointeId) {
		Optional<AppPieceJointe> pieceJointe= pieceJointeRepository.findById(pieceJointeId); 
		AppPieceJointe pieceJointeB=pieceJointe.get(); 
		pieceJointeB.setNomPieceJointe(appPieceJointe.getNomPieceJointe());
		pieceJointeB.setTypePieceJointe(appPieceJointe.getTypePieceJointe());
		pieceJointeRepository.saveAndFlush(pieceJointeB); 
	}
    
}
