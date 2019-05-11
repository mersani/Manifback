package tn.bns.manifeste.services;

import java.util.List;


import tn.bns.manifeste.entities.AppUser;

public interface IUser {
 
	 public AppUser saveUser(AppUser user);
	 public List<AppUser > getUsers();
	 public void updateUser(AppUser appUser,long id);
	 public void DeleteUser(long id);
	 public AppUser getOneUser(long id); 
}
