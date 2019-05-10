package tn.bns.manifeste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.bns.manifeste.entities.AppConteneur;
import java.lang.String;
import java.util.List;



@Repository
public interface ConteneurRepository extends JpaRepository<AppConteneur, Long>{
	 List<AppConteneur> findByContReference(String contreference);
	//public AppConteneur findbyContReference(String contReference); 

}
