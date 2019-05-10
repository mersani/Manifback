package tn.bns.manifeste.entities;

import java.sql.Time;
import java.time.LocalDate;
import java.util.Date;

public class RegisterForm {
	private String acconier; 
	private int manNumVoyage;
	private LocalDate manDateDepart;
	private LocalDate manDateArrive;
	private Time manHeureArrive;
	private int manNumEnregistrement; 
	private LocalDate manDateEnregistrement; 
	private String manLieuChargement; 
	private String manLieuDestination; 
	private String manModeTransport; 
	private String manTypeManifeste;
	private int manNumEscale;
	private int manjaugeBrute; 
	private int manJaugeNette;
	private LocalDate manDateEscale;
	private long ttNbRE;
	private String refpaysD;
	private String refpaysA;
	
	private String consAdresse;
	private String username;
	private Long id;
	
	private Long burDId;
	
	private Long contId;
	private String contReference;
	private int contNombreColis;
	private String contType;
	private Float contTauxRemplissage;
	private int contNombreScelle;
	private String contMarqueScelle;
	private String contResponsableScelle;
	
	private long marId;
	private String marMarque;
	private float marPoids;
	private float marVolume;
	private String marDesignation;
	private String marCodeEmballage;
	private int marNombreColis;
	private float marPoidsBrute;
	private int marNumColis;
	private String marStatut;
	private String marIdIntervenant;
	private String marRaisonSocialeIntervenant;
	private String marCodeDouaneIntervenant;
	private String marAdresseIntervenant;
	private String marTelephoneIntervenant;
	private int marIdTransitaire;
	private String marRaisonSocialeTransitaire;
	private int marIdMagasin;
	private String marRaisonSocialeMagasin;
	private boolean marDangereuse;
	private String marCategorieMarchandise;
	private String marClasse;
	private String marImoPageNumber;
	private String marImoMs;
	private String marUndgNumber;
	private String marReceptionnaire;
	private float marPoidsNette;
	
	private Long idMoyenT;
	private String moyenTType;
	private String moyenMat;
	
	private Long NATmoyenT_id;
	
	private Long codepays;
	private Long idreference;
	
	private int ttNumeroDevoyage; 
	private Long ttCode; 
	private Date ttDateDepartDeNavire; 
	private Date ttDatearriveDeNavire;
	private float ttHeureArrive;
	private int ttNumeroEnregistrement; 
	private String ttNatureTitreTransport; 
	private String ttNatureMarchandise;
	private String ttReference;
	
	private Long transId;
	private String transPlace;
	private String transPays;
	
	private Long typeTtId;
	private String typeTNom;
	public String getAcconier() {
		return acconier;
	}
	public void setAcconier(String acconier) {
		this.acconier = acconier;
	}
	public int getManNumVoyage() {
		return manNumVoyage;
	}
	public void setManNumVoyage(int manNumVoyage) {
		this.manNumVoyage = manNumVoyage;
	}
	public LocalDate getManDateDepart() {
		return manDateDepart;
	}
	public void setManDateDepart(LocalDate manDateDepart) {
		this.manDateDepart = manDateDepart;
	}
	public LocalDate getManDateArrive() {
		return manDateArrive;
	}
	public void setManDateArrive(LocalDate manDateArrive) {
		this.manDateArrive = manDateArrive;
	}
	public Time getManHeureArrive() {
		return manHeureArrive;
	}
	public void setManHeureArrive(Time manHeureArrive) {
		this.manHeureArrive = manHeureArrive;
	}
	public int getManNumEnregistrement() {
		return manNumEnregistrement;
	}
	public void setManNumEnregistrement(int manNumEnregistrement) {
		this.manNumEnregistrement = manNumEnregistrement;
	}
	public LocalDate getManDateEnregistrement() {
		return manDateEnregistrement;
	}
	public void setManDateEnregistrement(LocalDate manDateEnregistrement) {
		this.manDateEnregistrement = manDateEnregistrement;
	}
	public String getManLieuChargement() {
		return manLieuChargement;
	}
	public void setManLieuChargement(String manLieuChargement) {
		this.manLieuChargement = manLieuChargement;
	}
	public String getManLieuDestination() {
		return manLieuDestination;
	}
	public void setManLieuDestination(String manLieuDestination) {
		this.manLieuDestination = manLieuDestination;
	}
	public String getManModeTransport() {
		return manModeTransport;
	}
	public void setManModeTransport(String manModeTransport) {
		this.manModeTransport = manModeTransport;
	}
	public String getManTypeManifeste() {
		return manTypeManifeste;
	}
	public void setManTypeManifeste(String manTypeManifeste) {
		this.manTypeManifeste = manTypeManifeste;
	}
	public int getManNumEscale() {
		return manNumEscale;
	}
	public void setManNumEscale(int manNumEscale) {
		this.manNumEscale = manNumEscale;
	}
	public int getManjaugeBrute() {
		return manjaugeBrute;
	}
	public void setManjaugeBrute(int manjaugeBrute) {
		this.manjaugeBrute = manjaugeBrute;
	}
	public int getManJaugeNette() {
		return manJaugeNette;
	}
	public void setManJaugeNette(int manJaugeNette) {
		this.manJaugeNette = manJaugeNette;
	}
	public LocalDate getManDateEscale() {
		return manDateEscale;
	}
	public void setManDateEscale(LocalDate manDateEscale) {
		this.manDateEscale = manDateEscale;
	}
	public long getTtNbRE() {
		return ttNbRE;
	}
	public void setTtNbRE(long ttNbRE) {
		this.ttNbRE = ttNbRE;
	}
	public String getRefpaysD() {
		return refpaysD;
	}
	public void setRefpaysD(String refpaysD) {
		this.refpaysD = refpaysD;
	}
	public String getRefpaysA() {
		return refpaysA;
	}
	public void setRefpaysA(String refpaysA) {
		this.refpaysA = refpaysA;
	}
	public String getConsAdresse() {
		return consAdresse;
	}
	public void setConsAdresse(String consAdresse) {
		this.consAdresse = consAdresse;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getBurDId() {
		return burDId;
	}
	public void setBurDId(Long burDId) {
		this.burDId = burDId;
	}
	public Long getContId() {
		return contId;
	}
	public void setContId(Long contId) {
		this.contId = contId;
	}

	public String getContReference() {
		return contReference;
	}
	public void setContReference(String contReference) {
		this.contReference = contReference;
	}
	public int getContNombreColis() {
		return contNombreColis;
	}
	public void setContNombreColis(int contNombreColis) {
		this.contNombreColis = contNombreColis;
	}
	public String getContType() {
		return contType;
	}
	public void setContType(String contType) {
		this.contType = contType;
	}
	public Float getContTauxRemplissage() {
		return contTauxRemplissage;
	}
	public void setContTauxRemplissage(Float contTauxRemplissage) {
		this.contTauxRemplissage = contTauxRemplissage;
	}
	public int getContNombreScelle() {
		return contNombreScelle;
	}
	public void setContNombreScelle(int contNombreScelle) {
		this.contNombreScelle = contNombreScelle;
	}
	public String getContMarqueScelle() {
		return contMarqueScelle;
	}
	public void setContMarqueScelle(String contMarqueScelle) {
		this.contMarqueScelle = contMarqueScelle;
	}
	public String getContResponsableScelle() {
		return contResponsableScelle;
	}
	public void setContResponsableScelle(String contResponsableScelle) {
		this.contResponsableScelle = contResponsableScelle;
	}
	public long getMarId() {
		return marId;
	}
	public void setMarId(long marId) {
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
	public void setMarCategorieMarchandise(String marCategorieMarchandise) {
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
	public String getMoyenMat() {
		return moyenMat;
	}
	public void setMoyenMat(String moyenMat) {
		this.moyenMat = moyenMat;
	}
	public Long getNATmoyenT_id() {
		return NATmoyenT_id;
	}
	public void setNATmoyenT_id(Long nATmoyenT_id) {
		NATmoyenT_id = nATmoyenT_id;
	}
	public Long getCodepays() {
		return codepays;
	}
	public void setCodepays(Long codepays) {
		this.codepays = codepays;
	}
	public Long getIdreference() {
		return idreference;
	}
	public void setIdreference(Long idreference) {
		this.idreference = idreference;
	}
	public int getTtNumeroDevoyage() {
		return ttNumeroDevoyage;
	}
	public void setTtNumeroDevoyage(int ttNumeroDevoyage) {
		this.ttNumeroDevoyage = ttNumeroDevoyage;
	}
	public Long getTtCode() {
		return ttCode;
	}
	public void setTtCode(Long ttCode) {
		this.ttCode = ttCode;
	}
	public Date getTtDateDepartDeNavire() {
		return ttDateDepartDeNavire;
	}
	public void setTtDateDepartDeNavire(Date ttDateDepartDeNavire) {
		this.ttDateDepartDeNavire = ttDateDepartDeNavire;
	}
	public Date getTtDatearriveDeNavire() {
		return ttDatearriveDeNavire;
	}
	public void setTtDatearriveDeNavire(Date ttDatearriveDeNavire) {
		this.ttDatearriveDeNavire = ttDatearriveDeNavire;
	}
	public float getTtHeureArrive() {
		return ttHeureArrive;
	}
	public void setTtHeureArrive(float ttHeureArrive) {
		this.ttHeureArrive = ttHeureArrive;
	}
	public int getTtNumeroEnregistrement() {
		return ttNumeroEnregistrement;
	}
	public void setTtNumeroEnregistrement(int ttNumeroEnregistrement) {
		this.ttNumeroEnregistrement = ttNumeroEnregistrement;
	}
	public String getTtNatureTitreTransport() {
		return ttNatureTitreTransport;
	}
	public void setTtNatureTitreTransport(String ttNatureTitreTransport) {
		this.ttNatureTitreTransport = ttNatureTitreTransport;
	}
	public String getTtNatureMarchandise() {
		return ttNatureMarchandise;
	}
	public void setTtNatureMarchandise(String ttNatureMarchandise) {
		this.ttNatureMarchandise = ttNatureMarchandise;
	}
	public String getTtReference() {
		return ttReference;
	}
	public void setTtReference(String ttReference) {
		this.ttReference = ttReference;
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
	public Long getTypeTtId() {
		return typeTtId;
	}
	public void setTypeTtId(Long typeTtId) {
		this.typeTtId = typeTtId;
	}
	public String getTypeTNom() {
		return typeTNom;
	}
	public void setTypeTNom(String typeTNom) {
		this.typeTNom = typeTNom;
	}

	public float getMarPoidsNette() {
		return marPoidsNette;
	}
	public void setMarPoidsNette(float marPoidsNette) {
		this.marPoidsNette = marPoidsNette;
	}
	
	
	
	public RegisterForm(String acconier, int manNumVoyage, LocalDate manDateDepart, LocalDate manDateArrive,
			Time manHeureArrive, int manNumEnregistrement, LocalDate manDateEnregistrement, String manLieuChargement,
			String manLieuDestination, String manModeTransport, String manTypeManifeste, int manNumEscale,
			int manjaugeBrute, int manJaugeNette, LocalDate manDateEscale, long ttNbRE, String refpaysD,
			String refpaysA, String consAdresse, String username, Long id, Long burDId, Long contId,
			 String contReference, int contNombreColis, String contType,
			Float contTauxRemplissage, int contNombreScelle, String contMarqueScelle, String contResponsableScelle,
			long marId, String marMarque, float marPoids, float marVolume, String marDesignation,
			String marCodeEmballage, int marNombreColis, float marPoidsBrute, int marNumColis, String marStatut,
			String marIdIntervenant, String marRaisonSocialeIntervenant, String marCodeDouaneIntervenant,
			String marAdresseIntervenant, String marTelephoneIntervenant, int marIdTransitaire,
			String marRaisonSocialeTransitaire, int marIdMagasin, String marRaisonSocialeMagasin, boolean marDangereuse,
			String marCategorieMarchandise, String marClasse, String marImoPageNumber, String marImoMs,
			String marUndgNumber, String marReceptionnaire, float marPoidsNette, Long idMoyenT, String moyenTType,
			String moyenMat, Long nATmoyenT_id, Long codepays, Long idreference, int ttNumeroDevoyage, Long ttCode,
			Date ttDateDepartDeNavire, Date ttDatearriveDeNavire, float ttHeureArrive, int ttNumeroEnregistrement,
			String ttNatureTitreTransport, String ttNatureMarchandise, String ttReference, Long transId,
			String transPlace, String transPays, Long typeTtId, String typeTNom) {
		super();
		this.acconier = acconier;
		this.manNumVoyage = manNumVoyage;
		this.manDateDepart = manDateDepart;
		this.manDateArrive = manDateArrive;
		this.manHeureArrive = manHeureArrive;
		this.manNumEnregistrement = manNumEnregistrement;
		this.manDateEnregistrement = manDateEnregistrement;
		this.manLieuChargement = manLieuChargement;
		this.manLieuDestination = manLieuDestination;
		this.manModeTransport = manModeTransport;
		this.manTypeManifeste = manTypeManifeste;
		this.manNumEscale = manNumEscale;
		this.manjaugeBrute = manjaugeBrute;
		this.manJaugeNette = manJaugeNette;
		this.manDateEscale = manDateEscale;
		this.ttNbRE = ttNbRE;
		this.refpaysD = refpaysD;
		this.refpaysA = refpaysA;
		this.consAdresse = consAdresse;
		this.username = username;
		this.id = id;
		this.burDId = burDId;
		this.contId = contId;
	
		this.contReference = contReference;
		this.contNombreColis = contNombreColis;
		this.contType = contType;
		this.contTauxRemplissage = contTauxRemplissage;
		this.contNombreScelle = contNombreScelle;
		this.contMarqueScelle = contMarqueScelle;
		this.contResponsableScelle = contResponsableScelle;
		this.marId = marId;
		this.marMarque = marMarque;
		this.marPoids = marPoids;
		this.marVolume = marVolume;
		this.marDesignation = marDesignation;
		this.marCodeEmballage = marCodeEmballage;
		this.marNombreColis = marNombreColis;
		this.marPoidsBrute = marPoidsBrute;
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
		this.marPoidsNette = marPoidsNette;
		this.idMoyenT = idMoyenT;
		this.moyenTType = moyenTType;
		this.moyenMat = moyenMat;
		NATmoyenT_id = nATmoyenT_id;
		this.codepays = codepays;
		this.idreference = idreference;
		this.ttNumeroDevoyage = ttNumeroDevoyage;
		this.ttCode = ttCode;
		this.ttDateDepartDeNavire = ttDateDepartDeNavire;
		this.ttDatearriveDeNavire = ttDatearriveDeNavire;
		this.ttHeureArrive = ttHeureArrive;
		this.ttNumeroEnregistrement = ttNumeroEnregistrement;
		this.ttNatureTitreTransport = ttNatureTitreTransport;
		this.ttNatureMarchandise = ttNatureMarchandise;
		this.ttReference = ttReference;
		this.transId = transId;
		this.transPlace = transPlace;
		this.transPays = transPays;
		this.typeTtId = typeTtId;
		this.typeTNom = typeTNom;
	}
	public RegisterForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
