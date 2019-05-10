package tn.bns.manifeste.services;

import java.util.List;


import tn.bns.manifeste.entities.AppTitreTransport;

public interface ITitreTransport {

	public void saveTitreTransport(AppTitreTransport titreTransport); 
	public List<AppTitreTransport> getTitresTransports();
	 public void updateTT(AppTitreTransport appTitreTransport ,long ttCode);
	 public void DeleteTT(long ttCode);
	 public AppTitreTransport getOneTT(long ttCode); 
}
