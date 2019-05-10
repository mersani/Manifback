package tn.bns.manifeste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.bns.manifeste.entities.AppIntervenant;

public interface IntervenantRepository extends JpaRepository<AppIntervenant, Long> {

}
