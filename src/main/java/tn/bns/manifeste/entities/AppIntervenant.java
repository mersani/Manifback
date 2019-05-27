package tn.bns.manifeste.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class AppIntervenant implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_INTERVENANT" )
	private Long interId;

	@OneToOne
	@JoinColumn(name= "ttCode")
	private AppTransporteur appTransporteur;
	
	@Column(name = "NOM_EXPEDITEUR" )
	private String nomExp;
	@Column(name = "NOM_DESTINATAIRE" )
	private String nomDest;
	@Column(name = "ADRESSE_EXPEDITEUR" )
	private String adrExp;
	@Column(name = "ADRESSE_DESTINATAIRE" )
	private String adrDest;
	@Column(name = "EMAIL_DESTINATAIRE" )
	private String mailDest;
	@Column(name = "TELEPHONE_DESTINATAIRE" )
	private String telDest;
	@Column(name = "NUM_CONT_DESTINATAIRE" )
	private Long numContDest;
	public Long getInterId() {
		return interId;
	}
	public void setInterId(Long interId) {
		this.interId = interId;
	}
	public String getNomExp() {
		return nomExp;
	}
	public void setNomExp(String nomExp) {
		this.nomExp = nomExp;
	}
	public String getNomDest() {
		return nomDest;
	}
	public void setNomDest(String nomDest) {
		this.nomDest = nomDest;
	}
	public String getAdrExp() {
		return adrExp;
	}
	public void setAdrExp(String adrExp) {
		this.adrExp = adrExp;
	}
	public String getAdrDest() {
		return adrDest;
	}
	public void setAdrDest(String adrDest) {
		this.adrDest = adrDest;
	}
	public String getMailDest() {
		return mailDest;
	}
	public void setMailDest(String mailDest) {
		this.mailDest = mailDest;
	}
	public String getTelDest() {
		return telDest;
	}
	public void setTelDest(String telDest) {
		this.telDest = telDest;
	}
	public Long getNumContDest() {
		return numContDest;
	}
	public void setNumContDest(Long numContDest) {
		this.numContDest = numContDest;
	}
	public AppIntervenant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AppTransporteur getAppTransporteur() {
		return appTransporteur;
	}

	public void setAppTransporteur(AppTransporteur appTransporteur) {
		this.appTransporteur = appTransporteur;
	}

	public AppIntervenant(AppTransporteur appTransporteur, String nomExp, String nomDest, String adrExp, String adrDest, String mailDest, String telDest, Long numContDest) {
		this.appTransporteur = appTransporteur;
		this.nomExp = nomExp;
		this.nomDest = nomDest;
		this.adrExp = adrExp;
		this.adrDest = adrDest;
		this.mailDest = mailDest;
		this.telDest = telDest;
		this.numContDest = numContDest;
	}

}
