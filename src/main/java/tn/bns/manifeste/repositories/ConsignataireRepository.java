package tn.bns.manifeste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.bns.manifeste.entities.AppConsignataire;


@Repository
public interface ConsignataireRepository extends JpaRepository<AppConsignataire, Long>{
public AppConsignataire findByUsername(String userName); }
