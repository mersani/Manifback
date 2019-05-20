package tn.bns.manifeste.services;

import java.io.IOException;
import java.util.List;


import org.springframework.web.multipart.MultipartFile;
import tn.bns.manifeste.entities.AppPieceJointe;

public interface IPieceJointe {
    public void savePieceJointe(AppPieceJointe pieceJointe);

    public String storeFile(String fileName, byte[] fileContent, String fileFolder) throws IOException;

    public List<AppPieceJointe> getPieceJointes();

    public void deletePieceJointe(long pieceJointeId);

    public void updatePieceJointe(AppPieceJointe appPieceJointe, long pieceJointeId);
}
