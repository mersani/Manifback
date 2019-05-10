package tn.bns.manifeste.services;

import java.util.List;


import tn.bns.manifeste.entities.AppMoyenTransport;

public interface IMoyenTransport {

	public void saveMoyenTransport(AppMoyenTransport moyenTransport); 
	public List<AppMoyenTransport> getMoyensTransports();
	public void deleteMoyenTransport(long idMoyenT);
	public void updateMoyenTransport(AppMoyenTransport appMoyenTransport, long idMoyenT); 
	public AppMoyenTransport getOneMoyenTransport(long idMoyenT);

}
