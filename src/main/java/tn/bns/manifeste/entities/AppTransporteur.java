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
public class AppTransporteur implements Serializable {
	@Id @GeneratedValue (strategy = GenerationType.AUTO)
	
	@Column(name="ID_TRANSPORTEUR",nullable=false, length=10)
	private Long transId;
	
	@ManyToOne
	@JoinColumn (name="ID_MANIFESTE") 
	private AppManifeste appManifeste;
	
	@Column(name="place_TRANSPORTEUR",nullable=false, length=10)
	private String transPlace;
	
	@Column(name="pays_TRANSPORTEUR",nullable=false, length=10)
	private String transPays;

	public AppTransporteur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AppTransporteur(AppManifeste appManifeste, String transPlace, String transPays) {
		super();
		this.appManifeste = appManifeste;
		this.transPlace = transPlace;
		this.transPays = transPays;
	}






}
