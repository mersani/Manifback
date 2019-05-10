package tn.bns.manifeste.services;

import java.util.List;


import tn.bns.manifeste.entities.AppReferences;

public interface IReferences {
	
	public void saveReference(AppReferences references); 
	public List<AppReferences> getreferences();
	//public void deleteReference (long idRef);

}
