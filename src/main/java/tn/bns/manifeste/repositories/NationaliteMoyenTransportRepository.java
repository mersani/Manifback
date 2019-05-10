package tn.bns.manifeste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.bns.manifeste.entities.AppNationaliteMoyenTransport;



@Repository
public interface NationaliteMoyenTransportRepository extends JpaRepository<AppNationaliteMoyenTransport, Long>{

}
