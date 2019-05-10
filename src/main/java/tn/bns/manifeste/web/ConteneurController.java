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

import tn.bns.manifeste.entities.AppConsignataire;
import tn.bns.manifeste.entities.AppConteneur;
import tn.bns.manifeste.entities.AppManifeste;
import tn.bns.manifeste.entities.AppUser;
import tn.bns.manifeste.services.IConteneur;

@CrossOrigin("*")
@RestController
@RequestMapping(value="conteneur",produces="application/json")
public class ConteneurController {
	
	@Autowired
	private IConteneur iConteneur; 
	
	@PostMapping("/save")
	public void saveConteneur(@RequestBody AppConteneur conteneur) {
		iConteneur.saveConteneur(conteneur); 
	}

	@GetMapping("/all")
	public @ResponseBody List<AppConteneur> getAllConteneurs(){
		return iConteneur.getConteneurs(); 
	}
	
	@DeleteMapping("/delete-by-id/{contId}")
	public void deleteConteneur(@PathVariable (name="contId") long contId) {
		iConteneur.deleteConteneur(contId);
	}
	
	@PostMapping("/update/{contId}")
	public void putConteneur(@PathVariable (name="contId")long contId, @RequestBody AppConteneur appConteneur) {
		iConteneur.updateConteneur(appConteneur, contId);
		
	}
	@GetMapping("/get-one/{contId}")
	public @ResponseBody AppConteneur getOneCont(@PathVariable (name="contId") long contId,AppConsignataire conteneur) {
		return iConteneur.getOneConteneur(contId);
	}
}
