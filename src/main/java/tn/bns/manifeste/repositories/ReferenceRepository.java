package tn.bns.manifeste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.bns.manifeste.entities.AppReferences;



@Repository
public interface ReferenceRepository extends JpaRepository<AppReferences, Long> {

}
