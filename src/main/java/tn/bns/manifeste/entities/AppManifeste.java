package tn.bns.manifeste.entities;

import java.io.Serializable;
import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class AppManifeste implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column (name="ID_MANIFESTE",nullable=false, length=10)
	private Long manId;
	
	@OneToOne
	@JoinColumn(name= "ID_INTERVENANT") 
	private AppTitreTransport interId;
	
	@ManyToOne
	@JoinColumn (name="ID_PIECE_JOINTE")
	private AppPieceJointe appPieceJointe;
	
	@ManyToOne
	@JoinColumn (name="CODE_TITRE_TRANSPORT")
	private AppTitreTransport appTitreTransport;
	
	@OneToMany
	private Collection <AppBureauDouane> bureauDouane =new ArrayList<>();
	
	

	public Collection<AppBureauDouane> getBureauDouane() {
		return bureauDouane;
	}
	public void setBureauDouane(Collection<AppBureauDouane> bureauDouane) {
		this.bureauDouane = bureauDouane;
	}


	@Column(name="ACCONIER_MANIFESTE",nullable=false, length=20)
	private String acconier ;	 
	
	@Column (name="NUM_VOYAGE_MANIFESTE",nullable=false, length=20)
	private int manNumVoyage;
	
	@Column (name="DATE_DEPART_MANIFESTE",nullable=false, length=30)
	private LocalDate manDateDepart;
	
	@Column (name="DATE_ARRIVE_MANIFESTE",nullable=false, length=30)
	private LocalDate manDateArrive;
	
	@Column (name="HEURE_ARRIVE_MANIFESTE",nullable=false, length=20)
	private Time manHeureArrive;
	
	@Column (name="NUM_ENREGISTREMENT_MANIFESTE",nullable=false, length=10)
	private int manNumEnregistrement; 
	
	@Column (name="DATE_ENREGISTREMENT_MANIFESTE",nullable=false, length=30)
	private LocalDate manDateEnregistrement; 
	
	@Column (name="LIEU_CHARGEMENT_MANIFESTE",nullable=false, length=30)
	private String manLieuChargement; 
	
	@Column (name="LIEU_DESTINATION_MANIFESTE",nullable=false, length=30)
	private String manLieuDestination; 
	
	@Column (name="MODE_TRANSPORT_MANIFESTE",nullable=false, length=30)
	private String manModeTransport; 
	
	@Column (name="TYPE_MANIFESTE",nullable=false, length=30)
	private String manTypeManifeste;
	
	@Column (name="NUM_ESCALE_MANIFESTE",nullable=false, length=30)
	private int manNumEscale;
	
	@Column (name="JAUGE_BRUTE_MANIFESTE",nullable=false, length=30)
	private int manjaugeBrute; 
	
	@Column (name="JAUGE_NETTE_MANIFESTE",nullable=false, length=30)
	private int manJaugeNette;
	
	@Column (name="DATE_ESCALE_MANIFESTE",nullable=false, length=30)
	private LocalDate manDateEscale;
	
	@Column(name="NOMBRE_TITRE_TRANSPORT",nullable=false, length=10)
	private long ttNbRE;
	
	@Column(name="REFERENCE_PAYS_DEPART",nullable=false, length=10)
	private String refpaysD;
	
	@Column(name="REFERENCE_PAYS_ARRIVE",nullable=false, length=10)
	private String refpaysA;
	
	
	public AppManifeste() {
		super();
	}


	public Long getManId() {
		return manId;
	}


	public void setManId(Long manId) {
		this.manId = manId;
	}


	public int getManNumVoyage() {
		return manNumVoyage;
	}


	public void setManNumVoyage(int manNumVoyage) {
		this.manNumVoyage = manNumVoyage;
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





	public String getManLieuChargement() {
		return manLieuChargement;
	}


	public void setManLieuChargement(String manLieuChargement) {
		this.manLieuChargement = manLieuChargement;
	}


	public String getMANLieuDestination() {
		return manLieuDestination;
	}


	public void setMANLieuDestination(String manLieuDestination) {
		manLieuDestination = manLieuDestination;
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
	

	
	
	public AppPieceJointe getAppPieceJointe() {
		return appPieceJointe;
	}
	public void setAppPieceJointe(AppPieceJointe appPieceJointe) {
		this.appPieceJointe = appPieceJointe;
	}
	public AppTitreTransport getAppTitreTransport() {
		return appTitreTransport;
	}
	public void setAppTitreTransport(AppTitreTransport appTitreTransport) {
		this.appTitreTransport = appTitreTransport;
	}
	public String getAcconier() {
		return acconier;
	}
	public void setAcconier(String acconier) {
		acconier = acconier;
	}
	public String getmanLieuDestination() {
		return manLieuDestination;
	}
	public void setmANLieuDestination(String manLieuDestination) {
		this.manLieuDestination = manLieuDestination;
	}

	public long getTtNbRE() {
		return ttNbRE;
	}
	public void setTtNbRE(long ttNbRE) {
		this.ttNbRE = ttNbRE;
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
	public LocalDate getManDateEnregistrement() {
		return manDateEnregistrement;
	}
	public void setManDateEnregistrement(LocalDate manDateEnregistrement) {
		this.manDateEnregistrement = manDateEnregistrement;
	}
	public LocalDate getManDateEscale() {
		return manDateEscale;
	}
	public void setManDateEscale(LocalDate manDateEscale) {
		this.manDateEscale = manDateEscale;
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
	public AppManifeste get() {
		// TODO Auto-generated method stub
		return null;
	}
	public AppManifeste(AppPieceJointe appPieceJointe, AppTitreTransport appTitreTransport,
			Collection<AppBureauDouane> bureauDouane, String acconier, int manNumVoyage, LocalDate manDateDepart,
			LocalDate manDateArrive, Time manHeureArrive, int manNumEnregistrement, LocalDate manDateEnregistrement,
			String manLieuChargement, String mANLieuDestination, String manModeTransport, String manTypeManifeste,
			int manNumEscale, int manjaugeBrute, int manJaugeNette, LocalDate manDateEscale, long ttNbRE,
			String refpaysD, String refpaysA) {
		super();
		this.appPieceJointe = appPieceJointe;
		this.appTitreTransport = appTitreTransport;
		this.bureauDouane = bureauDouane;
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
	}



	
	
	

}
