package tn.bns.manifeste.services;

import java.util.List;


import tn.bns.manifeste.entities.AppPieceJointe;

public interface IPieceJointe {
public void savePieceJointe(AppPieceJointe pieceJointe); 
public List<AppPieceJointe> getPieceJointes();
public void deletePieceJointe (long pieceJointeId);
public void updatePieceJointe (AppPieceJointe  appPieceJointe ,long pieceJointeId);
}
