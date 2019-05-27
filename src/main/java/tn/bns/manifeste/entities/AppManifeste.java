package tn.bns.manifeste.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.*;

@Entity
@Table
public class AppManifeste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_MANIFESTE")
    private Long manId;
    @OneToOne
    @JoinColumn(name = "ID_MOYENT")
    private AppMoyenTransport appMoyenTransport;

    public AppMoyenTransport getAppMoyenTransport() {
        return appMoyenTransport;
    }

    public void setAppMoyenTransport(AppMoyenTransport appMoyenTransport) {
        this.appMoyenTransport = appMoyenTransport;
    }

    public AppManifeste( AppMoyenTransport appMoyenTransport, AppConsignataire consignataire, AppTitreTransport appTitreTransport, List<AppBureauDouane> bureauDouane, AppTransporteur appTransporteur, String acconier, int manNumVoyage, LocalDate manDateDepart, LocalDate manDateArrive, int manNumEnregistrement, LocalDate manDateEnregistrement, String manLieuChargement, String manLieuDestination, String manModeTransport, String manTypeManifeste, int manNumEscale, int manjaugeBrute, int manJaugeNette, LocalDate manDateEscale, long ttNbRE, String refpaysD, String refpaysA, AppEtatD appEtatD) {
        this.appMoyenTransport = appMoyenTransport;
        this.consignataire = consignataire;
        this.appTitreTransport = appTitreTransport;
        this.bureauDouane = bureauDouane;
        this.appTransporteur = appTransporteur;
        this.acconier = acconier;
        this.manNumVoyage = manNumVoyage;
        this.manDateDepart = manDateDepart;
        this.manDateArrive = manDateArrive;
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
        this.appEtatD = appEtatD;
    }

    @ManyToOne
    @JoinColumn(name = "ID_UTILISATEUR")
    private AppConsignataire consignataire;

    public AppConsignataire getConsignataire() {
        return consignataire;
    }

    public void setConsignataire(AppConsignataire consignataire) {
        this.consignataire = consignataire;
    }

    public AppManifeste( AppConsignataire consignataire, AppTitreTransport appTitreTransport, List<AppBureauDouane> bureauDouane, AppTransporteur appTransporteur, String acconier, int manNumVoyage, LocalDate manDateDepart, LocalDate manDateArrive, int manNumEnregistrement, LocalDate manDateEnregistrement, String manLieuChargement, String manLieuDestination, String manModeTransport, String manTypeManifeste, int manNumEscale, int manjaugeBrute, int manJaugeNette, LocalDate manDateEscale, long ttNbRE, String refpaysD, String refpaysA, AppEtatD appEtatD) {

        this.consignataire = consignataire;
        this.appTitreTransport = appTitreTransport;
        this.bureauDouane = bureauDouane;
        this.appTransporteur = appTransporteur;
        this.acconier = acconier;
        this.manNumVoyage = manNumVoyage;
        this.manDateDepart = manDateDepart;
        this.manDateArrive = manDateArrive;
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
        this.appEtatD = appEtatD;
    }

    @ManyToOne
    @JoinColumn(name = "CODE_TITRE_TRANSPORT")
    private AppTitreTransport appTitreTransport;
    @ManyToMany
    @JoinTable(name = "MANIFESTE_BDouane",
            joinColumns = {@JoinColumn(name = "ID_MANIFESTE", nullable = false, updatable = false)}, inverseJoinColumns = {
            @JoinColumn(name = "BURD_ID", nullable = false, updatable = false)})
    private List<AppBureauDouane> bureauDouane = new ArrayList<>();
    @ManyToOne
    @JoinColumn(name = "ID_TRANSPORTEUR")
    private AppTransporteur appTransporteur;

    public AppTransporteur getAppTransporteur() {
        return appTransporteur;
    }


    public void setAppTransporteur(AppTransporteur appTransporteur) {
        this.appTransporteur = appTransporteur;
    }

    public List<AppBureauDouane> getBureauDouane() {
        return bureauDouane;
    }

    public void setBureauDouane(List<AppBureauDouane> bureauDouane) {
        this.bureauDouane = bureauDouane;
    }


    @Column(name = "ACCONIER_MANIFESTE")
    private String acconier;

    @Column(name = "NUM_VOYAGE_MANIFESTE")
    private int manNumVoyage;

    @Column(name = "DATE_DEPART_MANIFESTE")

    private LocalDate manDateDepart;

    @Column(name = "DATE_ARRIVE_MANIFESTE")
    private LocalDate manDateArrive;


    @Column(name = "NUM_ENREGISTREMENT_MANIFESTE")
    private int manNumEnregistrement;

    @Column(name = "DATE_ENREGISTREMENT_MANIFESTE")
    private LocalDate manDateEnregistrement;

    @Column(name = "LIEU_CHARGEMENT_MANIFESTE")
    private String manLieuChargement;

    @Column(name = "LIEU_DESTINATION_MANIFESTE")
    private String manLieuDestination;

    @Column(name = "MODE_TRANSPORT_MANIFESTE")
    private String manModeTransport;

    @Column(name = "TYPE_MANIFESTE")
    private String manTypeManifeste;

    @Column(name = "NUM_ESCALE_MANIFESTE")
    private int manNumEscale;

    @Column(name = "JAUGE_BRUTE_MANIFESTE")
    private int manjaugeBrute;

    @Column(name = "JAUGE_NETTE_MANIFESTE")
    private int manJaugeNette;

    @Column(name = "DATE_ESCALE_MANIFESTE")
    private LocalDate manDateEscale;

    @Column(name = "NOMBRE_TITRE_TRANSPORT")
    private long ttNbRE;

    @Column(name = "REFERENCE_PAYS_DEPART")
    private String refpaysD;

    @Column(name = "REFERENCE_PAYS_ARRIVE")
    private String refpaysA;

    @JsonIgnore
    @OneToOne
    public AppEtatD appEtatD;

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


    public AppEtatD getAppEtatD() {
        return appEtatD;
    }

    public void setAppEtatD(AppEtatD appEtatD) {
        this.appEtatD = appEtatD;
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




    public String getManLieuDestination() {
        return manLieuDestination;
    }

    public void setManLieuDestination(String manLieuDestination) {
        this.manLieuDestination = manLieuDestination;
    }

    public AppManifeste( AppTitreTransport appTitreTransport, List<AppBureauDouane> bureauDouane, AppTransporteur appTransporteur, String acconier, int manNumVoyage, LocalDate manDateDepart, LocalDate manDateArrive, int manNumEnregistrement, LocalDate manDateEnregistrement, String manLieuChargement, String manLieuDestination, String manModeTransport, String manTypeManifeste, int manNumEscale, int manjaugeBrute, int manJaugeNette, LocalDate manDateEscale, long ttNbRE, String refpaysD, String refpaysA, AppEtatD appEtatD) {

        this.appTitreTransport = appTitreTransport;
        this.bureauDouane = bureauDouane;
        this.appTransporteur = appTransporteur;
        this.acconier = acconier;
        this.manNumVoyage = manNumVoyage;
        this.manDateDepart = manDateDepart;
        this.manDateArrive = manDateArrive;
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
        this.appEtatD = appEtatD;
    }
}
