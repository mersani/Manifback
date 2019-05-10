package tn.bns.manifeste.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.bns.manifeste.entities.AppTypeTitreTransport;
import tn.bns.manifeste.services.ITypeTitreTransport;

@CrossOrigin("*")
@RestController
@RequestMapping(value="typett",produces="application/json")
public class TypeTitreTransportController {
	@Autowired
	private ITypeTitreTransport iTypeTitreTransport; 
	
	@PostMapping("/save")
	public void saveTypeTitreTransport(AppTypeTitreTransport typeTitreTransport) {
		iTypeTitreTransport.saveTypeTitreTransport(typeTitreTransport);
	}
	@GetMapping("/all ")
	public @ResponseBody List<AppTypeTitreTransport> getAllTypesTitresTransports(){
		return iTypeTitreTransport.getTypesTitresTransports(); 
	}

}
