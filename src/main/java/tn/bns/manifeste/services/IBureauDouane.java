package tn.bns.manifeste.services;

import java.util.List;

import tn.bns.manifeste.entities.AppBureauDouane;


public interface IBureauDouane {
	public void saveBureauDouane(AppBureauDouane bureauDouane); 
	public List<AppBureauDouane > getBureauDouanes();
	public void DeleteBureauDouane(long burDId);
	//public void updateBureauDouane(AppBureauDouane appBureauDouane,long burDId);
	 public AppBureauDouane getOneBurD(long burDId);
}
