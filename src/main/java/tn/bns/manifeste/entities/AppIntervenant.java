package tn.bns.manifeste.entities;

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
public class AppIntervenant {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_INTERVENANT", nullable = false, length = 10)
	private Long interId;
	
	@OneToOne
	@JoinColumn(name= "ID_MANIFESTE") 
	private AppTitreTransport manId;
	
	@Column(name = "NOM_EXPEDITEUR", nullable = false, length = 30)
	private String nomExp;
	@Column(name = "NOM_DESTINATAIRE", nullable = false, length = 30)
	private String nomDest;
	@Column(name = "ADRESSE_EXPEDITEUR", nullable = false, length = 30)
	private String adrExp;
	@Column(name = "ADRESSE_DESTINATAIRE", nullable = false, length = 30)
	private String adrDest;
	@Column(name = "EMAIL_DESTINATAIRE", nullable = false, length = 30)
	private String mailDest;
	@Column(name = "TELEPHONE_DESTINATAIRE", nullable = false, length = 30)
	private String telDest;
	@Column(name = "NUM_CONT_DESTINATAIRE", nullable = false, length = 30)
	private Long numContDest;
	public Long getInterId() {
		return interId;
	}
	public void setInterId(Long interId) {
		this.interId = interId;
	}
	public AppTitreTransport getManId() {
		return manId;
	}
	public void setManId(AppTitreTransport manId) {
		this.manId = manId;
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
	public AppIntervenant(AppTitreTransport manId, String nomExp, String nomDest, String adrExp, String adrDest,
			String mailDest, String telDest, Long numContDest) {
		super();
		this.manId = manId;
		this.nomExp = nomExp;
		this.nomDest = nomDest;
		this.adrExp = adrExp;
		this.adrDest = adrDest;
		this.mailDest = mailDest;
		this.telDest = telDest;
		this.numContDest = numContDest;
	}
	public AppIntervenant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
