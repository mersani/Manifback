package tn.bns.manifeste.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table
public class AppPieceJointe implements Serializable {
@Id
@GeneratedValue	(strategy = GenerationType.AUTO)
@Column(name="ID_PIECE_JOINTE" )
   private Long pieceJointeId;

@OneToOne
@JoinColumn(name= "CODE_TITRE_TRANSPORT") 
private AppTitreTransport ttCode;

@Column (name="nom_PIECE_JOINTE" )
private String nomPieceJointe; 
 
@Column (name="type_PIECE_JOINTE" )
private String typePieceJointe;

public Long getPieceJointeId() {
	return pieceJointeId;
}

public void setPieceJointeId(Long pieceJointeId) {
	this.pieceJointeId = pieceJointeId;
}

public String getNomPieceJointe() {
	return nomPieceJointe;
}

public void setNomPieceJointe(String nomPieceJointe) {
	this.nomPieceJointe = nomPieceJointe;
}

public String getTypePieceJointe() {
	return typePieceJointe;
}

public void setTypePieceJointe(String typePieceJointe) {
	this.typePieceJointe = typePieceJointe;
}



public AppPieceJointe(String nomPieceJointe, String typePieceJointe) {
	super();
	this.nomPieceJointe = nomPieceJointe;
	this.typePieceJointe = typePieceJointe;
}

public AppPieceJointe() {
	super();
	// TODO Auto-generated constructor stub
} 



}
