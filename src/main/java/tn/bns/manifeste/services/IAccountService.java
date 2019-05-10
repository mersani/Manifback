package tn.bns.manifeste.services;

import org.springframework.stereotype.Service;
import tn.bns.manifeste.entities.AppRole;
import tn.bns.manifeste.entities.AppUser;

//@Service
public interface IAccountService {
	public AppUser saveUser(AppUser user) ;
	public AppRole saveRole(AppRole role);
    public void addRoleToUser(String username, String roleName);
    public AppUser findUserByUserName(String userName);


}
