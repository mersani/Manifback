package tn.bns.manifeste.services;

import java.util.List;

import tn.bns.manifeste.entities.AppConsignataire;


public interface IConsignataire {
	public void saveConsignataire(AppConsignataire Consignataire); 
	public List<AppConsignataire > getConsignataires();
	 public void updateCons(AppConsignataire appConsignataire,long id);
	 public void DeleteCons(long id);
	 public AppConsignataire getOneConsignataire(long id); 
}
