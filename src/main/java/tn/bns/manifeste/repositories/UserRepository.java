package tn.bns.manifeste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.bns.manifeste.entities.AppUser;


@Repository
public interface UserRepository  extends JpaRepository<AppUser, Long>{
 
	 AppUser findByUsername(String userName);
	
}
