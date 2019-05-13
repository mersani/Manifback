package tn.bns.manifeste.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table
public class AppTypeTitreTransport implements Serializable {
	
	@Id @GeneratedValue (strategy = GenerationType.AUTO)
	
	@Column(name="ID_TYPE_TITRE_TRANSPORT" )
	private Long typeTtId;
	
	
	@ManyToOne
	@JoinColumn (name="CODE_TITRE_TRANSPORT") 
	private AppTitreTransport appTitreTransport; 

	
	@Column(name="NOM_TYPE_TITRE_TRANSPORT")
	private String typeTNom;

	public Long getTypeTtId() {
		return typeTtId;
	}

	public void setTypeTtId(Long typeTtId) {
		this.typeTtId = typeTtId;
	}

	public String getTypeTNom() {
		return typeTNom;
	}

	public void setTypeTNom(String typeTNom) {
		this.typeTNom = typeTNom;
	}


	public AppTypeTitreTransport(AppTitreTransport appTitreTransport, String typeTNom) {
		super();
		this.appTitreTransport = appTitreTransport;
		this.typeTNom = typeTNom;
	}

	public AppTypeTitreTransport() {
		super();
		// TODO Auto-generated constructor stub
	}


	
}
