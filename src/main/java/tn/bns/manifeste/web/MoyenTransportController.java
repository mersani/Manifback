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

import tn.bns.manifeste.entities.AppConteneur;
import tn.bns.manifeste.entities.AppMarchandise;
import tn.bns.manifeste.entities.AppMoyenTransport;
import tn.bns.manifeste.services.IMoyenTransport;

@CrossOrigin("*")
@RestController
@RequestMapping(value="moyenTransport",produces="application/json")
public class MoyenTransportController {

	@Autowired
	private IMoyenTransport iMoyenTransport;
	
	@PostMapping("/save")
	public void saveMoyenTransport(@RequestBody AppMoyenTransport moyenTransport) {
		iMoyenTransport.saveMoyenTransport(moyenTransport);
	}
	
	@GetMapping("/all ")
	public @ResponseBody List<AppMoyenTransport> getAllMoyensTransports(){
		return iMoyenTransport.getMoyensTransports(); 
	}
	@DeleteMapping("/delete-by-id/{idMoyenT}")
	public void deleteMoyenTransport(@PathVariable (name="idMoyenT") long idMoyenT) {
		iMoyenTransport.deleteMoyenTransport(idMoyenT);
	}
	
	@PostMapping("/update/{idMoyenT}")
	public void putMoyenTransport(@PathVariable (name="idMoyenT")long idMoyenT, @RequestBody AppMoyenTransport appMoyenTransport) {
		iMoyenTransport.updateMoyenTransport(appMoyenTransport, idMoyenT);
		
	}
	@GetMapping("/get-one/{idMoyenT}")
	public @ResponseBody AppMoyenTransport getOneMoyenTransport(@PathVariable (name="idMoyenT") long idMoyenT,AppMarchandise marchandise) {
		return iMoyenTransport.getOneMoyenTransport(idMoyenT);
	}
}
