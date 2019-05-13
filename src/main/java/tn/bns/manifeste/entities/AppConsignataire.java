package tn.bns.manifeste.entities;

import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
public class AppConsignataire extends AppUser{
	
	@Column(name="ADRESSE_CONSIGNATAIRE")
	private String consAdresse;

	public String getConsAdresse() {
		return consAdresse;
	}

	public void setConsAdresse(String consAdresse) {
		this.consAdresse = consAdresse;
	} 
	
	@ManyToOne
	@JoinColumn (name="ID_MANIFESTE") 
	private AppManifeste appManifeste;

	public AppManifeste getAppManifeste() {
		return appManifeste;
	}

	public void setAppManifeste(AppManifeste appManifeste) {
		this.appManifeste = appManifeste;
	}

	public AppConsignataire(String consAdresse, AppManifeste appManifeste) {
		super();
		this.consAdresse = consAdresse;
		this.appManifeste = appManifeste;
	}

	public AppConsignataire() {
		super();
		// TODO Auto-generated constructor stub
	}







	} 
	
	

	


