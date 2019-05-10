package tn.bns.manifeste.entities;

import java.io.Serializable;
import java.util.ArrayList;
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
public class AppMarchandise implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_MARCHANDISE", nullable = false, length = 20)
	private long marId;

	@ManyToOne
	@JoinColumn (name="CODE_TITRE_TRANSPORT")
	private AppTitreTransport appTitreTransport;
	


	@Column(name = "MARQUE_MARCHANDISE", nullable = false, length = 20)
	private String marMarque;

	@Column(name = "POIDS_MARCHANDISE", nullable = false, length = 20)
	private float marPoids;

	@Column(name = "VOLUME_MARCHANDISE", nullable = false, length = 20)
	private float marVolume;

	@Column(name = "DESIGNATION_MARCHANDISE", nullable = false, length = 20)
	private String marDesignation;

	@Column(name = "CODE_EMBLLAGE_MARCHANDISE", nullable = false, length = 20)
	private String marCodeEmballage;

	@Column(name = "NOMBRE_COLIS_MARCHANDISE", nullable = false, length = 20)
	private int marNombreColis;

	@Column(name = "POIDS_BRUTTE_MARCHANDISE", nullable = false, length = 20)
	private float marPoidsBrute;
	
	@Column(name = "POIDS_NETTE_MARCHANDISE", nullable = false, length = 20)
	private float marPoidsNette;
	
	@Column(name = "NUM_COLLIS_MARCHANDISE", nullable = false, length = 20)
	private int marNumColis;

	@Column(name = "STATUT_MARCHANDISE", nullable = false, length = 20)
	private String marStatut;

	@Column(name = "IDINTERVENNT_MARCHANDISE", nullable = false, length = 20)
	private String marIdIntervenant;

	@Column(name = "RAISON_SOCIALE_INTERVENANT_MARCHANDISE", nullable = false, length = 60)
	private String marRaisonSocialeIntervenant;

	@Column(name = "CODE_DOUANE_INTERVENANT_MARCHANDISE", nullable = false, length = 20)
	private String marCodeDouaneIntervenant;

	@Column(name = "ADRESSE_INTERVENANT_MARCHANDISE", nullable = false, length = 30)
	private String marAdresseIntervenant;

	@Column(name = "TELEPHONE_INTERVENANT_MARCHANDISE", nullable = false, length = 20)
	private String marTelephoneIntervenant;

	@Column(name = "IDTRANSITAIRE_MARCHANDISE", nullable = false, length = 20)
	private int marIdTransitaire;

	@Column(name = "RAISON_SOCIALE_TRANSITAIRE_MARCHANDISE", nullable = false, length = 20)
	private String marRaisonSocialeTransitaire;

	@Column(name = "IDMAGASIN_MARCHANDISE", nullable = false, length = 20)
	private int marIdMagasin;

	@Column(name = "RAISON_SOCILE_MAGASIN_MARCHANDISE", nullable = false, length = 30)
	private String marRaisonSocialeMagasin;

	@Column(name = "MARCHANDISE_DANGEREUSE", nullable = false, length = 40)
	private boolean marDangereuse;

	@Column(name = "CATEGORIE_MARCHANDISE", nullable = false, length = 50)
	private String marCategorieMarchandise;

	@Column(name = "CLASSE_MARCHANDISE", nullable = false, length = 65)
	private String marClasse;

	@Column(name = "MARCHANDISE_IMO_PAGE_NUMBER", nullable = false, length = 65)
	private String marImoPageNumber;

	@Column(name = "MARCHANDISE_IMO_MS", nullable = false, length = 65)
	private String marImoMs;

	@Column(name = "MARCHANDISE_UNDG_NUMBER", nullable = false, length = 65)
	private String marUndgNumber;

	@Column(name = "RECEPTIONNAIRE_MARCHANDISE", nullable = false, length = 60)
	private String marReceptionnaire;

	public AppMarchandise() {
		super();
	}

	public Long getMarId() {
		return marId;
	}

	public void setMarId(Long marId) {
		this.marId = marId;
	}

	public String getMarMarque() {
		return marMarque;
	}

	public void setMarMarque(String marMarque) {
		this.marMarque = marMarque;
	}

	public float getMarPoids() {
		return marPoids;
	}

	public void setMarPoids(float marPoids) {
		this.marPoids = marPoids;
	}

	public float getMarVolume() {
		return marVolume;
	}

	public void setMarVolume(float marVolume) {
		this.marVolume = marVolume;
	}

	public String getMarDesignation() {
		return marDesignation;
	}

	public void setMarDesignation(String marDesignation) {
		this.marDesignation = marDesignation;
	}

	public String getMarCodeEmballage() {
		return marCodeEmballage;
	}

	public void setMarCodeEmballage(String marCodeEmballage) {
		this.marCodeEmballage = marCodeEmballage;
	}

	public int getMarNombreColis() {
		return marNombreColis;
	}

	public void setMarNombreColis(int marNombreColis) {
		this.marNombreColis = marNombreColis;
	}

	public float getMarPoidsBrute() {
		return marPoidsBrute;
	}

	public void setMarPoidsBrute(float marPoidsBrute) {
		this.marPoidsBrute = marPoidsBrute;
	}

	public int getMarNumColis() {
		return marNumColis;
	}

	public void setMarNumColis(int marNumColis) {
		this.marNumColis = marNumColis;
	}

	public String getMarStatut() {
		return marStatut;
	}

	public void setMarStatut(String marStatut) {
		this.marStatut = marStatut;
	}

	public String getMarIdIntervenant() {
		return marIdIntervenant;
	}

	public void setMarIdIntervenant(String marIdIntervenant) {
		this.marIdIntervenant = marIdIntervenant;
	}

	public String getMarRaisonSocialeIntervenant() {
		return marRaisonSocialeIntervenant;
	}

	public void setMarRaisonSocialeIntervenant(String marRaisonSocialeIntervenant) {
		this.marRaisonSocialeIntervenant = marRaisonSocialeIntervenant;
	}

	public String getMarCodeDouaneIntervenant() {
		return marCodeDouaneIntervenant;
	}

	public void setMarCodeDouaneIntervenant(String marCodeDouaneIntervenant) {
		this.marCodeDouaneIntervenant = marCodeDouaneIntervenant;
	}

	public String getMarAdresseIntervenant() {
		return marAdresseIntervenant;
	}

	public void setMarAdresseIntervenant(String marAdresseIntervenant) {
		this.marAdresseIntervenant = marAdresseIntervenant;
	}

	public String getMarTelephoneIntervenant() {
		return marTelephoneIntervenant;
	}

	public void setMarTelephoneIntervenant(String marTelephoneIntervenant) {
		this.marTelephoneIntervenant = marTelephoneIntervenant;
	}

	public int getMarIdTransitaire() {
		return marIdTransitaire;
	}

	public void setMarIdTransitaire(int marIdTransitaire) {
		this.marIdTransitaire = marIdTransitaire;
	}

	public String getMarRaisonSocialeTransitaire() {
		return marRaisonSocialeTransitaire;
	}

	public void setMarRaisonSocialeTransitaire(String marRaisonSocialeTransitaire) {
		this.marRaisonSocialeTransitaire = marRaisonSocialeTransitaire;
	}

	public int getMarIdMagasin() {
		return marIdMagasin;
	}

	public void setMarIdMagasin(int marIdMagasin) {
		this.marIdMagasin = marIdMagasin;
	}

	public String getMarRaisonSocialeMagasin() {
		return marRaisonSocialeMagasin;
	}

	public void setMarRaisonSocialeMagasin(String marRaisonSocialeMagasin) {
		this.marRaisonSocialeMagasin = marRaisonSocialeMagasin;
	}

	public boolean isMarDangereuse() {
		return marDangereuse;
	}

	public void setMarDangereuse(boolean marDangereuse) {
		this.marDangereuse = marDangereuse;
	}

	public String getMarCategorieMarchandise() {
		return marCategorieMarchandise;
	}

	public void setMarCategorieMarchandise(String marfCategorieMarchandise) {
		this.marCategorieMarchandise = marCategorieMarchandise;
	}

	public String getMarClasse() {
		return marClasse;
	}

	public void setMarClasse(String marClasse) {
		this.marClasse = marClasse;
	}

	public String getMarImoPageNumber() {
		return marImoPageNumber;
	}

	public void setMarImoPageNumber(String marImoPageNumber) {
		this.marImoPageNumber = marImoPageNumber;
	}

	public String getMarImoMs() {
		return marImoMs;
	}

	public void setMarImoMs(String marImoMs) {
		this.marImoMs = marImoMs;
	}

	public String getMarUndgNumber() {
		return marUndgNumber;
	}

	public void setMarUndgNumber(String marUndgNumber) {
		this.marUndgNumber = marUndgNumber;
	}

	public String getMarReceptionnaire() {
		return marReceptionnaire;
	}

	public void setMarReceptionnaire(String marReceptionnaire) {
		this.marReceptionnaire = marReceptionnaire;
	}


	public AppTitreTransport getAppTitreTransport() {
		return appTitreTransport;
	}

	public void setAppTitreTransport(AppTitreTransport appTitreTransport) {
		this.appTitreTransport = appTitreTransport;
	}

	public float getMarPoidsNette() {
		return marPoidsNette;
	}

	public void setMarPoidsNette(float marPoidsNette) {
		this.marPoidsNette = marPoidsNette;
	}

	public void setMarId(long marId) {
		this.marId = marId;
	}

	public AppMarchandise(AppTitreTransport appTitreTransport, String marMarque, float marPoids, float marVolume,
			String marDesignation, String marCodeEmballage, int marNombreColis, float marPoidsBrute,
			float marPoidsNette, int marNumColis, String marStatut, String marIdIntervenant,
			String marRaisonSocialeIntervenant, String marCodeDouaneIntervenant, String marAdresseIntervenant,
			String marTelephoneIntervenant, int marIdTransitaire, String marRaisonSocialeTransitaire, int marIdMagasin,
			String marRaisonSocialeMagasin, boolean marDangereuse, String marCategorieMarchandise, String marClasse,
			String marImoPageNumber, String marImoMs, String marUndgNumber, String marReceptionnaire) {
		super();
		this.appTitreTransport = appTitreTransport;
		this.marMarque = marMarque;
		this.marPoids = marPoids;
		this.marVolume = marVolume;
		this.marDesignation = marDesignation;
		this.marCodeEmballage = marCodeEmballage;
		this.marNombreColis = marNombreColis;
		this.marPoidsBrute = marPoidsBrute;
		this.marPoidsNette = marPoidsNette;
		this.marNumColis = marNumColis;
		this.marStatut = marStatut;
		this.marIdIntervenant = marIdIntervenant;
		this.marRaisonSocialeIntervenant = marRaisonSocialeIntervenant;
		this.marCodeDouaneIntervenant = marCodeDouaneIntervenant;
		this.marAdresseIntervenant = marAdresseIntervenant;
		this.marTelephoneIntervenant = marTelephoneIntervenant;
		this.marIdTransitaire = marIdTransitaire;
		this.marRaisonSocialeTransitaire = marRaisonSocialeTransitaire;
		this.marIdMagasin = marIdMagasin;
		this.marRaisonSocialeMagasin = marRaisonSocialeMagasin;
		this.marDangereuse = marDangereuse;
		this.marCategorieMarchandise = marCategorieMarchandise;
		this.marClasse = marClasse;
		this.marImoPageNumber = marImoPageNumber;
		this.marImoMs = marImoMs;
		this.marUndgNumber = marUndgNumber;
		this.marReceptionnaire = marReceptionnaire;
	}
	
	





}
