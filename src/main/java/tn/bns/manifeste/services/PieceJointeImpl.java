package tn.bns.manifeste.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.bns.manifeste.entities.AppPieceJointe;
import tn.bns.manifeste.repositories.PieceJointeRepository;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Service
public class PieceJointeImpl implements IPieceJointe{
	Logger log = LoggerFactory.getLogger(this.getClass().getName());
	private final Path rootLocation = Paths.get("C:\\files");
	@Autowired
	private PieceJointeRepository pieceJointeRepository; 
	
	public void savePieceJointe(AppPieceJointe pieceJointe) {
		pieceJointeRepository.save(pieceJointe); 
	}
	public String storeFile(String fileName, byte[] fileContent, String fileFolder) throws IOException {

			File file = new File(fileFolder, fileName);
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		try {
			fileOutputStream.write(fileContent);
		} finally {
			fileOutputStream.close();
			return fileName;
		}
	}



	@Override
	public List<AppPieceJointe> getPieceJointes() {

		return pieceJointeRepository.findAll();
	}

	@Override
	public List<AppPieceJointe> getAllPiecesJointesByTTCode(Long ttcode) {
		return pieceJointeRepository.findByTtCode(ttcode);
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
