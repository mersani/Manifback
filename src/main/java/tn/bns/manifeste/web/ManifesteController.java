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

import tn.bns.manifeste.entities.AppManifeste;
import tn.bns.manifeste.entities.AppRole;
import tn.bns.manifeste.entities.AppUser;
import tn.bns.manifeste.services.IManifeste;


@CrossOrigin("*")
@RestController
@RequestMapping(value ="manifeste",produces="application/json")
public class ManifesteController {
	
	@Autowired
	private IManifeste iManifeste; 
	
	@PostMapping("/save")
	public void saveManifeste(@RequestBody AppManifeste manifeste) {
		iManifeste.saveManifeste(manifeste); 
	}
	
	@GetMapping("/all ")
	public @ResponseBody List<AppManifeste> getAllmanifestes(){
		return iManifeste.getManifeste(); 
	}
	
	@DeleteMapping("/delete-by-id/{manId}")
	public void deleteManifeste(@PathVariable (name="manId") long manId) {
		iManifeste.DeleteManifeste(manId);
	}

	@PostMapping("/update/{manId}")
	public void putmanifeste(@PathVariable (name="manId")long manId, @RequestBody AppManifeste appManifeste) {
		iManifeste.updateManifeste(appManifeste, manId);
		
	}
	@GetMapping("/get-one/{manId}")
	public @ResponseBody AppManifeste getOneManifeste(@PathVariable (name="manId") long manId,AppManifeste manifeste) {
		return iManifeste.getOneManifeste(manId);
	}
	
}
