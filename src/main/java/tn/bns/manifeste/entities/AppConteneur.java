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
public class AppConteneur implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_CONTENEUR", nullable = false, length = 10)
	private Long contId;

	@ManyToOne
	@JoinColumn(name = "CODE_TITRE_TRANSPORT")
	private AppTitreTransport appTitreTransport;

	@Column(name = "REfERENCE_CONTENEUR", nullable = false, length = 25)
	private String contReference;

	@Column(name = "Nombre_Colis_CONTENEUR", nullable = false, length = 25)
	private int contNombreColis;

	@Column(name = "TYPE_CONTENEUR", nullable = false, length = 20)
	private String contType;

	@Column(name = "TAUX_REMPLISSAGE_CONTENEUR", nullable = false, length = 25)
	private Float contTauxRemplissage;

	@Column(name = "NOMBRE_SCELLE_CONTENEUR", nullable = false, length = 10)
	private int contNombreScelle;

	@Column(name = "MARQUE_SCELLE_CONTENEUR", nullable = false, length = 10)
	private String contMarqueScelle;

	@Column(name = "RESPONSABLE_SCELLE_CONTENEUR", nullable = false, length = 10)
	private String contResponsableScelle;

	public AppConteneur() {
		super();
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

	public AppConteneur(AppTitreTransport appTitreTransport, String contReference, int contNombreColis, String contType,
			Float contTauxRemplissage, int contNombreScelle, String contMarqueScelle, String contResponsableScelle) {
		super();
		this.appTitreTransport = appTitreTransport;
		this.contReference = contReference;
		this.contNombreColis = contNombreColis;
		this.contType = contType;
		this.contTauxRemplissage = contTauxRemplissage;
		this.contNombreScelle = contNombreScelle;
		this.contMarqueScelle = contMarqueScelle;
		this.contResponsableScelle = contResponsableScelle;
	}

}
