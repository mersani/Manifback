package tn.bns.manifeste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.bns.manifeste.entities.AppPieceJointe;



@Repository
public interface PieceJointeRepository extends JpaRepository<AppPieceJointe, Long> {

}
