package tn.bns.manifeste.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.bns.manifeste.entities.AppRole;

import tn.bns.manifeste.services.IRole;

@CrossOrigin("*")
@RestController
@RequestMapping(value="role",produces="application/json")
public class RoleController {
	@Autowired
	private IRole iRole; 
	
	@PostMapping("/save")
	public void saveRole(@RequestBody AppRole role) {
		System.out.println("role" + role);
		iRole.saveRole(role);
	}

	@GetMapping("/allRole")
	public @ResponseBody List<AppRole> getAllRoles(){
		return iRole.getRoles(); 
	}
	
	@DeleteMapping("/delete-by-id/{idRole}")
	public void deleteRole(@PathVariable (name="idRole") long idRole) {
		iRole.deleteRole(idRole);
	}
	
	@PostMapping("/update/{idRole}")
	public void putRole(@PathVariable (name="idRole")long idRole, @RequestBody AppRole appRole) {
		iRole.updateRole(appRole, idRole); 
		
	}

}
