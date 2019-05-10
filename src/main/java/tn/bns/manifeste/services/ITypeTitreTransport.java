package tn.bns.manifeste.services;

import java.util.List;


import tn.bns.manifeste.entities.AppTypeTitreTransport;

public interface ITypeTitreTransport {

	public void saveTypeTitreTransport(AppTypeTitreTransport typeTitreTransport); 
	public List<AppTypeTitreTransport> getTypesTitresTransports();
}
