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


import tn.bns.manifeste.entities.AppReferences;
import tn.bns.manifeste.services.IReferences;

@CrossOrigin("*")
@RestController
@RequestMapping(value="ref",produces="application/json")
public class ReferencesController {
	
	@Autowired
	private IReferences iReferences; 
	
	@PostMapping("/save")
	public void saveReference(@RequestBody AppReferences references) {
		iReferences.saveReference(references); 
	}
	
	@GetMapping("/all")
	public @ResponseBody List<AppReferences> getAllReferences(){
		return iReferences.getreferences(); 
	}
	
	/*@DeleteMapping("/delete-by-id/{idRef}")
	public void deleteReference(@PathVariable (name="idRef") long idRef) {
		iReferences.deleteReference(idRef);
	}*/
	

}
