package tn.bns.manifeste.services;

import tn.bns.manifeste.entities.AppBureauDouane;
import tn.bns.manifeste.entities.AppEtatD;

import java.util.List;

public interface IEtatD {
	public AppEtatD saveEtatD(AppEtatD etatD);
	public List<AppEtatD> getAll();
}
