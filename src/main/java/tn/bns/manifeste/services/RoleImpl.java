package tn.bns.manifeste.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.bns.manifeste.entities.AppConteneur;
import tn.bns.manifeste.entities.AppRole;
import tn.bns.manifeste.repositories.RoleRepository;

@Service
public class RoleImpl implements IRole{
	@Autowired
	private RoleRepository roleRepository; 
	
	public void saveRole(AppRole role) {
		roleRepository.save(role); 
	}

	@Override
	public List<AppRole> getRoles() {
		return roleRepository.findAll(); 
	}

	@Override
	public void deleteRole(long idRole) {
		roleRepository.deleteById(idRole);
	}

	@Override
	public void updateRole(AppRole appRole, long idRole) {
		Optional<AppRole> role =roleRepository.findById(idRole); 
		AppRole roleB=role.get(); 
		roleB.setRoleName(appRole.getRoleName());
	}
    


	
}
