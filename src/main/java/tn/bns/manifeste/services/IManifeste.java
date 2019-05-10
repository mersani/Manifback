package tn.bns.manifeste.services;

import java.util.List;

import tn.bns.manifeste.entities.AppManifeste;


public interface IManifeste {

	public void saveManifeste(AppManifeste manifeste);
	public List<AppManifeste> getManifeste();
	public void DeleteManifeste(long manId);
	public void updateManifeste(AppManifeste appManifeste,long manId); 
	public AppManifeste getOneManifeste(long manId);  
}
