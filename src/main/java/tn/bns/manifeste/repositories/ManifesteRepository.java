package tn.bns.manifeste.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.bns.manifeste.entities.AppManifeste;



@Repository
public interface ManifesteRepository extends JpaRepository<AppManifeste, Long> {

}
