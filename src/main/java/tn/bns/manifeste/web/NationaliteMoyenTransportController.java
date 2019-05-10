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


import tn.bns.manifeste.entities.AppNationaliteMoyenTransport;
import tn.bns.manifeste.services.INationaliteMoyenTransport;


@CrossOrigin("*")
@RestController
@RequestMapping(value="nationaliteMoyenTransport",produces="application/json")

public class NationaliteMoyenTransportController {
	
	@Autowired
	private INationaliteMoyenTransport iNationaliteMoyenTransport;
	
	@PostMapping("/save")
	public void saveMoyenTransport(@RequestBody AppNationaliteMoyenTransport natinaliteMoyenTransport) {
		iNationaliteMoyenTransport.saveNationaliteMoyenTransport(natinaliteMoyenTransport);

}
	
	@GetMapping("/all ")
	public @ResponseBody List<AppNationaliteMoyenTransport> getAllNationalitesMoyensTransports(){
		return iNationaliteMoyenTransport.getNationalitesMoyensTransports(); 
	}
	
	@DeleteMapping("/delete-by-id/{NATmoyenT_id}")
	public void deleteNationaliteMoyenTransport(@PathVariable (name="NATmoyenT_id") long NATmoyenT_id) {
		iNationaliteMoyenTransport.deleteNationaliteMoyenTransport(NATmoyenT_id);
	}
	}
