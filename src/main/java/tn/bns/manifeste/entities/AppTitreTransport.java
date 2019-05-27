package tn.bns.manifeste.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;


@Entity
@Table
public class AppTitreTransport implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CODE_TITRE_TRANSPORT")
    private Long ttCode;
    @Column(name = "NUMERO_VOYAGE_TITRE_TRANSPORT")
    private int ttNumeroDevoyage;

    @Column(name = "DATE_DEPART_DE_NAVIRE_TITRE_TRANSPORT")
    private Date ttDateDepartDeNavire;

    @Column(name = "DATE_ARRIVE_NAVIRE_TITRE_TRANSPORT")
    private Date ttDatearriveDeNavire;

    @Column(name = "HEURE_ARRIVE_TITRE_TRANSPORT")
    private float ttHeureArrive;

    @Column(name = "NUMERO_ENREGISTREMENT_TITRE_TRANSPORT")
    private int ttNumeroEnregistrement;

    @Column(name = "NATURE_TITRE_TRANSPORT")
    private String ttNatureTitreTransport;

    @Column(name = "NTURE_MARCHNDISE_TITRE_TRANSPORT")
    private String ttNatureMarchandise;

    @Column(name = "REFERENCE_TITRE_TRANSPORT")
    private String ttReference;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "ID_MANIFESTE")
    private List<AppManifeste> manifestes = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "marId")
    private List<AppMarchandise> appMarchandises = new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "ID_CONTENEUR")
    private List<AppConteneur> appConteneurs = new ArrayList<>();

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


    public void setTtNumeroDevoyage(int ttNumeroDevoyage) {
        this.ttNumeroDevoyage = ttNumeroDevoyage;
    }

    public AppTitreTransport() {
        super();
        // TODO Auto-generated constructor stub
    }

    public AppTitreTransport(int ttNumeroDevoyage, Date ttDateDepartDeNavire,
                             Date ttDatearriveDeNavire, float ttHeureArrive, int ttNumeroEnregistrement, String ttNatureTitreTransport,
                             String ttNatureMarchandise, String ttReference) {
        super();
        this.ttNumeroDevoyage = ttNumeroDevoyage;
        this.ttDateDepartDeNavire = ttDateDepartDeNavire;
        this.ttDatearriveDeNavire = ttDatearriveDeNavire;
        this.ttHeureArrive = ttHeureArrive;
        this.ttNumeroEnregistrement = ttNumeroEnregistrement;
        this.ttNatureTitreTransport = ttNatureTitreTransport;
        this.ttNatureMarchandise = ttNatureMarchandise;
        this.ttReference = ttReference;

    }

    public List<AppManifeste> getManifestes() {
        return manifestes;
    }

    public void setManifestes(List<AppManifeste> manifestes) {
        this.manifestes = manifestes;
    }

    public List<AppMarchandise> getAppMarchandises() {
        return appMarchandises;
    }

    public void setAppMarchandises(List<AppMarchandise> appMarchandises) {
        this.appMarchandises = appMarchandises;
    }

    public AppTitreTransport(int ttNumeroDevoyage, Date ttDateDepartDeNavire, Date ttDatearriveDeNavire, float ttHeureArrive, int ttNumeroEnregistrement, String ttNatureTitreTransport, String ttNatureMarchandise, String ttReference, List<AppManifeste> manifestes, List<AppMarchandise> appMarchandises, List<AppConteneur> appConteneurs, AppIntervenant interId) {
        this.ttNumeroDevoyage = ttNumeroDevoyage;
        this.ttDateDepartDeNavire = ttDateDepartDeNavire;
        this.ttDatearriveDeNavire = ttDatearriveDeNavire;
        this.ttHeureArrive = ttHeureArrive;
        this.ttNumeroEnregistrement = ttNumeroEnregistrement;
        this.ttNatureTitreTransport = ttNatureTitreTransport;
        this.ttNatureMarchandise = ttNatureMarchandise;
        this.ttReference = ttReference;
        this.manifestes = manifestes;
        this.appMarchandises = appMarchandises;
        this.appConteneurs = appConteneurs;
        this.interId = interId;
    }

    public AppTitreTransport(int ttNumeroDevoyage, Date ttDateDepartDeNavire, Date ttDatearriveDeNavire, float ttHeureArrive, int ttNumeroEnregistrement, String ttNatureTitreTransport, String ttNatureMarchandise, String ttReference, List<AppManifeste> manifestes, List<AppMarchandise> appMarchandises) {
        this.ttNumeroDevoyage = ttNumeroDevoyage;
        this.ttDateDepartDeNavire = ttDateDepartDeNavire;
        this.ttDatearriveDeNavire = ttDatearriveDeNavire;
        this.ttHeureArrive = ttHeureArrive;
        this.ttNumeroEnregistrement = ttNumeroEnregistrement;
        this.ttNatureTitreTransport = ttNatureTitreTransport;
        this.ttNatureMarchandise = ttNatureMarchandise;
        this.ttReference = ttReference;
        this.manifestes = manifestes;
        this.appMarchandises = appMarchandises;
    }

    public List<AppConteneur> getAppConteneurs() {
        return appConteneurs;
    }

    public void setAppConteneurs(List<AppConteneur> appConteneurs) {
        this.appConteneurs = appConteneurs;
    }

    @OneToOne
    @JoinColumn(name = "ID_INTERVENANT")
    private AppIntervenant interId;

    public AppIntervenant getInterId() {
        return interId;

    }

    public void setInterId(AppIntervenant interId) {
        this.interId = interId;
    }

    public AppTitreTransport(int ttNumeroDevoyage, Date ttDateDepartDeNavire, Date ttDatearriveDeNavire, float ttHeureArrive, int ttNumeroEnregistrement, String ttNatureTitreTransport, String ttNatureMarchandise, String ttReference, List<AppManifeste> manifestes, List<AppMarchandise> appMarchandises, List<AppConteneur> appConteneurs) {
        this.ttNumeroDevoyage = ttNumeroDevoyage;
        this.ttDateDepartDeNavire = ttDateDepartDeNavire;
        this.ttDatearriveDeNavire = ttDatearriveDeNavire;
        this.ttHeureArrive = ttHeureArrive;
        this.ttNumeroEnregistrement = ttNumeroEnregistrement;
        this.ttNatureTitreTransport = ttNatureTitreTransport;
        this.ttNatureMarchandise = ttNatureMarchandise;
        this.ttReference = ttReference;
        this.manifestes = manifestes;
        this.appMarchandises = appMarchandises;
        this.appConteneurs = appConteneurs;
    }

    public Long getTtCode() {
        return ttCode;
    }

    public void setTtCode(Long ttCode) {
        this.ttCode = ttCode;
    }
}
