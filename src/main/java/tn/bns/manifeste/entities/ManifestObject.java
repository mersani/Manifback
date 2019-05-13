package tn.bns.manifeste.entities;

import java.io.Serializable;

public class ManifestObject implements Serializable {
    private AppManifeste appManifeste;
    private AppConsignataire appConsignataire;
    private AppMoyenTransport appMoyenTransport;
    private AppTransporteur appTransporteur;
    private AppConteneur appConteneur;
    private AppMarchandise appMarchandise;

    public AppManifeste getAppManifeste() {
        return appManifeste;
    }

    public void setAppManifeste(AppManifeste appManifeste) {
        this.appManifeste = appManifeste;
    }


    public AppTransporteur getAppTransporteur() {
        return appTransporteur;
    }

    public void setAppTransporteur(AppTransporteur appTransporteur) {
        this.appTransporteur = appTransporteur;
    }

    public AppConteneur getAppConteneur() {
        return appConteneur;
    }

    public void setAppConteneur(AppConteneur appConteneur) {
        this.appConteneur = appConteneur;
    }


    public AppConsignataire getAppConsignataire() {
        return appConsignataire;
    }

    public void setAppConsignataire(AppConsignataire appConsignataire) {
        this.appConsignataire = appConsignataire;
    }

    public AppMoyenTransport getAppMoyenTransport() {
        return appMoyenTransport;
    }

    public void setAppMoyenTransport(AppMoyenTransport appMoyenTransport) {
        this.appMoyenTransport = appMoyenTransport;
    }

    public AppMarchandise getAppMarchandise() {
        return appMarchandise;
    }

    public void setAppMarchandise(AppMarchandise appMarchandise) {
        this.appMarchandise = appMarchandise;
    }

    public ManifestObject(AppManifeste appManifeste, AppConsignataire appConsignataire, AppMoyenTransport appMoyenTransport, AppTransporteur appTransporteur, AppConteneur appConteneur, AppMarchandise appMarchandise) {
        this.appManifeste = appManifeste;
        this.appConsignataire = appConsignataire;
        this.appMoyenTransport = appMoyenTransport;
        this.appTransporteur = appTransporteur;
        this.appConteneur = appConteneur;
        this.appMarchandise = appMarchandise;
    }

    public ManifestObject() {
    }
}
