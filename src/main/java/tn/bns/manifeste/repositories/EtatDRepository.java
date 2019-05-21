package tn.bns.manifeste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.bns.manifeste.entities.AppEtatD;



public interface EtatDRepository  extends JpaRepository<AppEtatD, Long> {

}
