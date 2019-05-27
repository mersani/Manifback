package tn.bns.manifeste.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.bns.manifeste.entities.AppEtatD;

import tn.bns.manifeste.services.IEtatD;

import javax.validation.Valid;
import java.util.List;


@CrossOrigin("*")
@RestController
@RequestMapping(value = "etatD", produces = "application/json")
public class EtatDController {
	@Autowired
	private IEtatD iEtatD;

	@PostMapping("/save")
	public void saveEtatD(@Valid @RequestBody AppEtatD etatD) {
		System.out.println("******* maherrrrr" );

		System.out.print("*******" + etatD.getEtatText());
		iEtatD.saveEtatD(etatD);
	}


	@GetMapping("/all")
	public @ResponseBody List<AppEtatD> getAll(){
		return  iEtatD.getAll();
	}
}
