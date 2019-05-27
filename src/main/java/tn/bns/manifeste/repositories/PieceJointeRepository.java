package tn.bns.manifeste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.bns.manifeste.entities.AppPieceJointe;

import java.util.List;


@Repository
public interface PieceJointeRepository extends JpaRepository<AppPieceJointe, Long> {
    @Query( value = "select * from app_piece_jointe pj where pj.CODE_TITRE_TRANSPORT= :ttCode", nativeQuery = true)
    List<AppPieceJointe> findByTtCode(@Param("ttCode") Long ttCode);

}
