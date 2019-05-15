package tn.bns.manifeste.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;


@Entity
@Table
public class AppTitreTransport implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CODE_TITRE_TRANSPORT" )
    private Long ttCode; 
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "ID_PIECE_JOINTE") 
	private AppPieceJointe appPieceJointe;
	
	@Column(name="NUMERO_VOYAGE_TITRE_TRANSPORT" )
	private int ttNumeroDevoyage; 
	
	@Column(name="DATE_DEPART_DE_NAVIRE_TITRE_TRANSPORT" )
	private Date ttDateDepartDeNavire; 
	
	@Column(name="DATE_ARRIVE_NAVIRE_TITRE_TRANSPORT" )
	private Date ttDatearriveDeNavire; 
	
	@Column(name="HEURE_ARRIVE_TITRE_TRANSPORT" )
	private float ttHeureArrive; 
	
	@Column(name="NUMERO_ENREGISTREMENT_TITRE_TRANSPORT" )
	private int ttNumeroEnregistrement; 
	
	@Column(name="NATURE_TITRE_TRANSPORT")
	private String ttNatureTitreTransport; 
	
	@Column(name="NTURE_MARCHNDISE_TITRE_TRANSPORT" )
	private String ttNatureMarchandise;
	
	@Column(name="REFERENCE_TITRE_TRANSPORT" )
	private String ttReference;
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "ID_MANIFESTE")
	private List<AppManifeste>  manifestes = new ArrayList<>();
	

	public int getTtNumeroDevoyage() {
		return ttNumeroDevoyage;
	}
	public void setTtNumerodevoyage(int ttNumeroDevoyage) {
		this.ttNumeroDevoyage = ttNumeroDevoyage;
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

	public AppPieceJointe getAppPieceJointe() {
		return appPieceJointe;
	}
	public void setAppPieceJointe(AppPieceJointe appPieceJointe) {
		this.appPieceJointe = appPieceJointe;
	}
	public void setTtNumeroDevoyage(int ttNumeroDevoyage) {
		this.ttNumeroDevoyage = ttNumeroDevoyage;
	}
	public AppTitreTransport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AppTitreTransport(AppPieceJointe appPieceJointe, int ttNumeroDevoyage, Date ttDateDepartDeNavire,
			Date ttDatearriveDeNavire, float ttHeureArrive, int ttNumeroEnregistrement, String ttNatureTitreTransport,
			String ttNatureMarchandise, String ttReference) {
		super();
		this.appPieceJointe = appPieceJointe;
		this.ttNumeroDevoyage = ttNumeroDevoyage;
		this.ttDateDepartDeNavire = ttDateDepartDeNavire;
		this.ttDatearriveDeNavire = ttDatearriveDeNavire;
		this.ttHeureArrive = ttHeureArrive;
		this.ttNumeroEnregistrement = ttNumeroEnregistrement;
		this.ttNatureTitreTransport = ttNatureTitreTransport;
		this.ttNatureMarchandise = ttNatureMarchandise;
		this.ttReference = ttReference;
		
	}

	public Long getTtCode() {
		return ttCode;
	}

	public void setTtCode(Long ttCode) {
		this.ttCode = ttCode;
	}
}
