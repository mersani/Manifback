package tn.bns.manifeste.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table 
public class AppReferences implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="CODE_REFERENCE",nullable=false, length=20)
	private Long idreference;
	
	@Column(name="CODE_PAYS",nullable=false, length=20)
	private Long codepays;

	@Column(name="ALPHA2",nullable=false, length=20)
	private String alpha2;
	
	@Column(name="ALPHA3",nullable=false, length=20)
	private String alpha3;
	
	@Column(name="NON_EN_GB",nullable=false, length=30)
	private String nom_en_gb;
	
	@Column(name="NOM_EN_FR",nullable=false, length=40)
	private String nom_fr_fr;

	public Long getIdreference() {
		return idreference;
	}

	public void setIdreference(Long idreference) {
		this.idreference = idreference;
	}

	public Long getCodepays() {
		return codepays;
	}

	public void setCodepays(Long codepays) {
		this.codepays = codepays;
	}

	public String getAlpha2() {
		return alpha2;
	}

	public void setAlpha2(String alpha2) {
		this.alpha2 = alpha2;
	}

	public String getAlpha3() {
		return alpha3;
	}

	public void setAlpha3(String alpha3) {
		this.alpha3 = alpha3;
	}

	public String getNom_en_gb() {
		return nom_en_gb;
	}

	public void setNom_en_gb(String nom_en_gb) {
		this.nom_en_gb = nom_en_gb;
	}

	public String getNom_fr_fr() {
		return nom_fr_fr;
	}

	public void setNom_fr_fr(String nom_fr_fr) {
		this.nom_fr_fr = nom_fr_fr;
	}

	public AppReferences(Long codepays, String alpha2, String alpha3, String nom_en_gb, String nom_fr_fr) {
		super();
		this.codepays = codepays;
		this.alpha2 = alpha2;
		this.alpha3 = alpha3;
		this.nom_en_gb = nom_en_gb;
		this.nom_fr_fr = nom_fr_fr;
	}

	public AppReferences() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
	
	/*@ManyToOne
	@JoinColumn (name="ID_MANIFESTE")
	private AppManifeste appManifeste;
	
	@ManyToMany
	@JoinTable(name = "RefMoyenT", joinColumns = { @JoinColumn(name = "idRef", referencedColumnName = "ID_REFERENCE")}, 
	inverseJoinColumns = { @JoinColumn(name = "idMoyenT", referencedColumnName = "ID_MOYENT")})
	private Collection<AppMoyenTransport> appMoyenTransport ;*/
	

	

	


	

}
