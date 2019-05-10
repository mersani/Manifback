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
import tn.bns.manifeste.entities.AppMarchandise;
import tn.bns.manifeste.services.IMarchandise;

@CrossOrigin("*")
@RestController
@RequestMapping(value="marchandise",produces="application/json")
public class MarchandiseController {
	
	@Autowired
	private IMarchandise iMarchandise; 
	
	@PostMapping("/save")
	public void saveMarchandise(@RequestBody AppMarchandise marchandise) {
		iMarchandise.saveMarchandise(marchandise);
	}
	
	@GetMapping("/all ")
	public @ResponseBody List<AppMarchandise> getAllmanifestes(){
		return iMarchandise.getMarchandises(); 
	}
	
	@PutMapping("/update/{marId}")
	public void putmanifeste(@PathVariable (name="marId") long marId, @RequestBody AppMarchandise appMarchandise) {
   iMarchandise.updateMarchandise(appMarchandise, marId);
   }
	@DeleteMapping("/delete-by-id/{marId}")
	public void deleteMarchandise(@PathVariable (name="marId") long marId) {
		iMarchandise.deleteMarchandise(marId);
	}
	@GetMapping("/get-one/{marId}")
	public @ResponseBody AppMarchandise getOneMarchandise(@PathVariable (name="marId") long marId,AppMarchandise marchandise) {
		return iMarchandise.getOneMarchandise(marId);
	}
	

 
}
