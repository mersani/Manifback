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

import tn.bns.manifeste.entities.AppMoyenTransport;
import tn.bns.manifeste.entities.AppPieceJointe;
import tn.bns.manifeste.services.IPieceJointe;

@CrossOrigin("*")
@RestController
@RequestMapping(value="pieceJointe",produces="application/json")
public class PieceJointeController {

	@Autowired
	private IPieceJointe iPieceJointe; 
	
	@PostMapping("/save")
	public void savePieceJointe(@RequestBody AppPieceJointe pieceJointe) {
		iPieceJointe.savePieceJointe(pieceJointe); 
	}
	
	@GetMapping("/all ")
	public @ResponseBody List<AppPieceJointe> getAllPiecesJointes(){
		return iPieceJointe.getPieceJointes(); 
	}
	@DeleteMapping("/delete-by-id/{pieceJointeId}")
	public void deletePieceJointe(@PathVariable (name="pieceJointeId") long pieceJointeId) {
		iPieceJointe.deletePieceJointe(pieceJointeId);
	}
	@PostMapping("/update/{pieceJointeId}")
	public void putPieceJointeId(@PathVariable (name="pieceJointeId")long pieceJointeId, @RequestBody AppPieceJointe appPieceJointe) {
		iPieceJointe.updatePieceJointe(appPieceJointe, pieceJointeId);
	}
}
