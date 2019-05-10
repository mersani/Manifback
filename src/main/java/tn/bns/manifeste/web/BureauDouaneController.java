package tn.bns.manifeste.web;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.bns.manifeste.entities.AppBureauDouane;
import tn.bns.manifeste.entities.AppUser;
import tn.bns.manifeste.services.IBureauDouane;

@CrossOrigin("*")
@RestController
@RequestMapping(value="bureauDouane",produces="application/json")
public class BureauDouaneController {
	
	private IBureauDouane iBureauDouane; 
	
	@PostMapping("/save")
	public void saveBureauDouane(@RequestBody AppBureauDouane bureauDouane) {
		iBureauDouane.saveBureauDouane(bureauDouane);
	}
	
	@GetMapping("/all")
	public @ResponseBody List<AppBureauDouane> getAllBureauDouanes(){
		return iBureauDouane.getBureauDouanes(); 
	}
	
	@DeleteMapping("/delete-by-id/{burDId}")
	public void deleteBureauDouane(@PathVariable (name="burDId") long burDId) {
		iBureauDouane.DeleteBureauDouane(burDId);}
		
    @GetMapping("/get-one/{burDId}")
    public @ResponseBody AppBureauDouane getOneBureau(@PathVariable (name="burDId") long burDId,AppBureauDouane bureauDouane) {
		return iBureauDouane.getOneBurD(burDId);
}
	}
