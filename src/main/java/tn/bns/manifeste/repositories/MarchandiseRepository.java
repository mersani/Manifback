package tn.bns.manifeste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.bns.manifeste.entities.AppMarchandise;




@Repository
public interface MarchandiseRepository extends JpaRepository<AppMarchandise, Long>{
	public AppMarchandise findBymarMarque(String marMarque);

}
