package tn.bns.manifeste.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.*;


@Entity
public class AppConsignataire extends AppUser implements Serializable {
	
	@Column(name="ADRESSE_CONSIGNATAIRE")
	private String consAdresse;

	public String getConsAdresse() {
		return consAdresse;
	}

	public void setConsAdresse(String consAdresse) {
		this.consAdresse = consAdresse;
	} 
	@JsonIgnore
	@OneToMany
	@JoinColumn (name="ID_MANIFESTE") 
	private List<AppManifeste> appManifeste;

	public List<AppManifeste> getAppManifeste() {
		return appManifeste;
	}

	public void setAppManifeste(List<AppManifeste> appManifeste) {
		this.appManifeste = appManifeste;
	}

	public AppConsignataire() {
		super();
		// TODO Auto-generated constructor stub
	}







	} 
	
	

	


