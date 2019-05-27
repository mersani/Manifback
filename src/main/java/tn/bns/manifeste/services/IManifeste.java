package tn.bns.manifeste.services;

import java.util.List;

import tn.bns.manifeste.entities.AppManifeste;
import tn.bns.manifeste.entities.ConnaissementObject;
import tn.bns.manifeste.entities.ManifestObject;


public interface IManifeste {

	public AppManifeste saveManifeste(AppManifeste manifestObject);
	public boolean saveConnaissement(ConnaissementObject connaissementObject);
	public List<AppManifeste> getManifeste();
	public void DeleteManifeste(long manId);
	public Boolean updateManifeste(AppManifeste appManifeste,Long manId);
	public AppManifeste getOneManifeste(long manId);  
}
