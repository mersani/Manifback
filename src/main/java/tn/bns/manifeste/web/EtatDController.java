package tn.bns.manifeste.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.bns.manifeste.entities.AppEtatD;

import tn.bns.manifeste.services.IEtatD;

import javax.validation.Valid;
import java.util.List;


@CrossOrigin("*")
@RestController
@RequestMapping(value = "Rapport", produces = "application/json; charset=utf-8")
public class EtatDController {
	@Autowired
	private IEtatD iEtatD;

	@PostMapping("/save")
	public AppEtatD saveEtatD(@RequestBody AppEtatD appEtatD) {
		System.out.println("******* maherrrrr" );

		System.out.println("*******" + appEtatD.getEtatText());
		return iEtatD.saveEtatD(appEtatD);
	}


	@GetMapping("/all")
	public @ResponseBody List<AppEtatD> getAll(){
		return  iEtatD.getAll();
	}
}
