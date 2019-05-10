package tn.bns.manifeste.services;

import java.util.List;


import tn.bns.manifeste.entities.AppTransporteur;

public interface ITransporteur {

	public void saveTransporteur(AppTransporteur Transporteur);
	public List<AppTransporteur> getTransporteurs();
}
