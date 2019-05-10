package tn.bns.manifeste.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import tn.bns.manifeste.entities.AppTransporteur;
import tn.bns.manifeste.services.ITransporteur;

@CrossOrigin("*")
@RestController
@RequestMapping(value="transporteur" ,produces="application/json")
public class TransporteurController {
	@Autowired
	private ITransporteur iTransporteur; 
	
	@PostMapping("/save")
	public void saveTransporteur(@RequestBody AppTransporteur Transporteur) {
		iTransporteur.saveTransporteur(Transporteur);
	}
	@GetMapping("/all ")
	public @ResponseBody List<AppTransporteur> getAllTransporteurs(){
		return iTransporteur.getTransporteurs(); 
	}

}
