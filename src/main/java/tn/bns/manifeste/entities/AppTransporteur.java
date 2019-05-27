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
@Id
	@Column(name="ID_TRANSPORTEUR" )
	private Long transId;

	
	@Column(name="place_TRANSPORTEUR" )
	private String transPlace;
	
	@Column(name="pays_TRANSPORTEUR" )
	private String transPays;

	public AppTransporteur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AppTransporteur(AppManifeste appManifeste, String transPlace, String transPays) {
		super();
		this.transPlace = transPlace;
		this.transPays = transPays;
	}

	public Long getTransId() {
		return transId;
	}

	public void setTransId(Long transId) {
		this.transId = transId;
	}



	public String getTransPlace() {
		return transPlace;
	}

	public void setTransPlace(String transPlace) {
		this.transPlace = transPlace;
	}

	public String getTransPays() {
		return transPays;
	}

	public void setTransPays(String transPays) {
		this.transPays = transPays;
	}
}
