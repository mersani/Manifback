package tn.bns.manifeste.services;


import java.util.List;

import org.springframework.stereotype.Service;

import tn.bns.manifeste.entities.AppConsignataire;
import tn.bns.manifeste.entities.AppConteneur;


public interface IConteneur {
	
	public void saveConteneur(AppConteneur conteneur); 
	public List<AppConteneur > getConteneurs();
	public void deleteConteneur(long contId);
	public void updateConteneur(AppConteneur appConteneur,long contId); 
	 public AppConteneur getOneConteneur(long contId); 
}
