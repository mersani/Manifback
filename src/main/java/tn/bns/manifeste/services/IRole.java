package tn.bns.manifeste.services;

import java.util.List;

import tn.bns.manifeste.entities.AppConteneur;
import tn.bns.manifeste.entities.AppRole;

public interface IRole {
	public void saveRole(AppRole role); 
    public List<AppRole> getRoles(); 
    public void deleteRole(long idRole);
	public void updateRole(AppRole appRole,long idRole); 

}
