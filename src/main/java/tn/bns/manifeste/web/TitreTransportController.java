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


import tn.bns.manifeste.entities.AppTitreTransport;
import tn.bns.manifeste.entities.AppUser;
import tn.bns.manifeste.services.ITitreTransport;

@CrossOrigin("*")
@RestController
@RequestMapping(value="tt",produces="application/json")
public class TitreTransportController {
	@Autowired
	private ITitreTransport iTitreTransport; 
	
	@PostMapping("/save")
	public void saveTitreTransport(@RequestBody AppTitreTransport titreTransport) {
		iTitreTransport.saveTitreTransport(titreTransport);
	}
	@GetMapping("/all ")
	public @ResponseBody List<AppTitreTransport> getAllTitresTransports(){
		return iTitreTransport.getTitresTransports(); 
	}
	@PutMapping("/update/{ttCode}")
	public void putTitreTransport(@PathVariable (name="ttCode")long ttCode, @RequestBody AppTitreTransport appTitreTransport) {
		iTitreTransport.updateTT(appTitreTransport, ttCode);
	}
	
	@DeleteMapping("/delete-by-id/{ttCode}")
	public void deleteTitreTransport(@PathVariable (name="ttCode") long ttCode) {
		iTitreTransport.DeleteTT(ttCode);
	}
	
	@GetMapping("/one/{ttCode}")
	public @ResponseBody AppTitreTransport getOneTitre(@PathVariable (name="ttCode") long ttCode,AppTitreTransport titreTransport) {
		return iTitreTransport.getOneTT(ttCode);
	}

}
