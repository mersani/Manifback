package tn.bns.manifeste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.bns.manifeste.entities.AppTransporteur;



@Repository
public interface TransporteurRepository extends JpaRepository<AppTransporteur,Long>{

}
