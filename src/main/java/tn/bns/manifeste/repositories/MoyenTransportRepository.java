package tn.bns.manifeste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.bns.manifeste.entities.AppMoyenTransport;



@Repository
public interface MoyenTransportRepository extends JpaRepository<AppMoyenTransport, Long>{

}
