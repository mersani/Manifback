package tn.bns.manifeste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.bns.manifeste.entities.AppTypeTitreTransport;


@Repository
public interface TypeTitreTransportRepository extends JpaRepository<AppTypeTitreTransport, Long>{

}
