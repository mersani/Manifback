package tn.bns.manifeste.entities;

import java.io.Serializable;

public class ConnaissementObject implements Serializable {
    private AppManifeste appManifeste;
    private AppMarchandise appMarchandise;
    private AppConteneur appConteneur;
    private AppTypeTitreTransport appTypeTitreTransport;
    private AppIntervenant appIntervenant;

    public ConnaissementObject(AppManifeste appManifeste, AppMarchandise appMarchandise, AppConteneur appConteneur, AppTypeTitreTransport appTypeTitreTransport, AppIntervenant appIntervenant) {
        this.appManifeste = appManifeste;
        this.appMarchandise = appMarchandise;
        this.appConteneur = appConteneur;
        this.appTypeTitreTransport = appTypeTitreTransport;
        this.appIntervenant = appIntervenant;
    }

    public ConnaissementObject() {
    }

    public AppManifeste getAppManifeste() {
        return appManifeste;
    }

    public void setAppManifeste(AppManifeste appManifeste) {
        this.appManifeste = appManifeste;
    }

    public AppMarchandise getAppMarchandise() {
        return appMarchandise;
    }

    public void setAppMarchandise(AppMarchandise appMarchandise) {
        this.appMarchandise = appMarchandise;
    }

    public AppConteneur getAppConteneur() {
        return appConteneur;
    }

    public void setAppConteneur(AppConteneur appConteneur) {
        this.appConteneur = appConteneur;
    }

    public AppTypeTitreTransport getAppTypeTitreTransport() {
        return appTypeTitreTransport;
    }

    public void setAppTypeTitreTransport(AppTypeTitreTransport appTypeTitreTransport) {
        this.appTypeTitreTransport = appTypeTitreTransport;
    }

    public AppIntervenant getAppIntervenant() {
        return appIntervenant;
    }

    public void setAppIntervenant(AppIntervenant appIntervenant) {
        this.appIntervenant = appIntervenant;
    }
}
