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
public class AppMoyenTransport implements Serializable {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID_MOYENT")
	private Long idMoyenT;
	
	@ManyToOne
	@JoinColumn (name="ID_MANIFESTE")
	private AppManifeste appManifeste;
	
	@Column(name="TYPE_MOYENT")
	private String moyenTType;
	
	@Column(name="MATRICULE_MOYENT")
	private String moyenMat;
	
	public AppMoyenTransport() {
		super();
		

}

	
	public Long getIdMoyenT() {
		return idMoyenT;
	}


	public void setIdMoyenT(Long idMoyenT) {
		this.idMoyenT = idMoyenT;
	}


	public String getMoyenTType() {
		return moyenTType;
	}

	public void setMoyenTType(String moyenTType) {
		this.moyenTType = moyenTType;
	}

	public AppManifeste getAppManifeste() {
		return appManifeste;
	}

	public void setAppManifeste(AppManifeste appManifeste) {
		this.appManifeste = appManifeste;
	}

	public String getMoyenMat() {
		return moyenMat;
	}

	public void setMoyenMat(String moyenMat) {
		this.moyenMat = moyenMat;
	}

	public AppMoyenTransport(AppManifeste appManifeste, String moyenTType, String moyenMat) {
		super();
		this.appManifeste = appManifeste;
		this.moyenTType = moyenTType;
		this.moyenMat = moyenMat;
	}




	
	
}