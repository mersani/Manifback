package tn.bns.manifeste.services;

import java.util.List;

import tn.bns.manifeste.entities.AppManifeste;
import tn.bns.manifeste.entities.ConnaissementObject;
import tn.bns.manifeste.entities.ManifestObject;


public interface IManifeste {

	public boolean saveManifeste(ManifestObject manifestObject);
	public boolean saveConnaissement(ConnaissementObject connaissementObject);
	public List<AppManifeste> getManifeste();
	public void DeleteManifeste(long manId);
	public void updateManifeste(AppManifeste appManifeste,long manId); 
	public AppManifeste getOneManifeste(long manId);  
}
