package tn.bns.manifeste.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.bns.manifeste.entities.AppConsignataire;
import tn.bns.manifeste.entities.AppUser;
import tn.bns.manifeste.services.IConsignataire;

@CrossOrigin("*")
@RestController
@RequestMapping(value="consignataire",produces="application/json")
public class ConsignataireController {
	@Autowired
	private IConsignataire iConsignataire; 
	
	@PostMapping("/save")
	public void saveConsignataire(@RequestBody AppConsignataire consignataire) {
		iConsignataire.saveConsignataire(consignataire);
	}
 
	@GetMapping("/allConsignataire")
	public @ResponseBody List<AppConsignataire> getAllUsers(){
		return iConsignataire.getConsignataires(); 
	}
	@PutMapping("/update/{id}")
	public void putConsignataire(@PathVariable (name="id")long id, @RequestBody AppConsignataire appConsignataire) {
		iConsignataire.updateCons(appConsignataire, id);
	}
	
	@DeleteMapping("/delete-by-id/{id}")
	public void deleteConsignataire(@PathVariable (name="id") long id) {
		iConsignataire.DeleteCons(id);
	}
	@GetMapping("/one/{id}")
	public @ResponseBody AppConsignataire getOneConsignataire(@PathVariable (name="id") long id,AppConsignataire consignataire) {
		return iConsignataire.getOneConsignataire(id);
	}
}
