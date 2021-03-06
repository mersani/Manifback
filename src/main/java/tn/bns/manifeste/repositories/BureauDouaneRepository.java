package tn.bns.manifeste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.bns.manifeste.entities.AppBureauDouane;

@Repository
public interface BureauDouaneRepository extends JpaRepository<AppBureauDouane, Long> {

}
