package tn.bns.manifeste.services;

import java.util.List;


import tn.bns.manifeste.entities.AppMarchandise;

public interface IMarchandise {

	public void saveMarchandise(AppMarchandise marchandise); 
	public List<AppMarchandise > getMarchandises();
	public void updateMarchandise(AppMarchandise appMarchandise, long marId); 
	public void deleteMarchandise(long marId);
	public AppMarchandise getOneMarchandise(long marId);
}
