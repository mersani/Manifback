package tn.bns.manifeste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.bns.manifeste.entities.AppRole;



@Repository
public interface RoleRepository extends JpaRepository<AppRole, Long>{

	AppRole findByRoleName(String roleName);

}
