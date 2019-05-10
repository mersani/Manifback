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
public class AppBureauDouane implements Serializable {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name="BURD_ID",nullable=false, length=10)
	private Long burDId;
	
	@ManyToOne
	@JoinColumn (name="ID_MANIFESTE") 
	private AppManifeste appManifeste; 
	
	
	
	public AppBureauDouane() {
		super();
	}

	public Long getBurDId() {
		return burDId;
	}

	public void setBurDId(Long burDId) {
		this.burDId = burDId;
	}

	public AppManifeste getAppManifeste() {
		return appManifeste;
	}

	public void setAppManifeste(AppManifeste appManifeste) {
		this.appManifeste = appManifeste;
	}

	
	
}

