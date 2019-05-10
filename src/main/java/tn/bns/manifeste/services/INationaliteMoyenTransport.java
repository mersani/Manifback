package tn.bns.manifeste.services;

import java.util.List;

import tn.bns.manifeste.entities.AppNationaliteMoyenTransport;

public interface INationaliteMoyenTransport {

	public void saveNationaliteMoyenTransport (AppNationaliteMoyenTransport nationaliteMoyenTransport); 
	public List<AppNationaliteMoyenTransport> getNationalitesMoyensTransports();
	public void deleteNationaliteMoyenTransport(long NATmoyenT_id);
	//public void updateNationaliteMoyenTransport(AppNationaliteMoyenTransport appNationaliteMoyenTransport,long NATmoyenT_id);
}
