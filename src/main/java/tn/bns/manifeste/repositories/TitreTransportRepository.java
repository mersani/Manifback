package tn.bns.manifeste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.bns.manifeste.entities.AppTitreTransport;



@Repository
public interface TitreTransportRepository extends JpaRepository<AppTitreTransport, Long>{

}
