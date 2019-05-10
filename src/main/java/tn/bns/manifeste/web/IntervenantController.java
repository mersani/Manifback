package tn.bns.manifeste.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.bns.manifeste.entities.AppIntervenant;
import tn.bns.manifeste.services.IIntervenant;


@CrossOrigin("*")
@RestController
@RequestMapping(value="intervenant",produces="application/json")
public class IntervenantController {
	
	@Autowired
	private IIntervenant iIntervenant; 
	@PostMapping("/save")
	public void saveIntervenant(@RequestBody AppIntervenant intervenant) {
		iIntervenant.saveIntervenant(intervenant);
	}
}
