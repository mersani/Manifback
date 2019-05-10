package tn.bns.manifeste.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.bns.manifeste.entities.AppRole;
import tn.bns.manifeste.entities.AppUser;
import tn.bns.manifeste.services.IUser;

@CrossOrigin("*")
@RestController
@RequestMapping(value="user", produces="application/json")
public class UserController {
	
	@Autowired
	private IUser iUser; 
	
	@Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@PostMapping("/save")
	public void saveUser(@RequestBody AppUser user) {
		System.out.println(user.toString());
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		System.out.println(user.toString());
	
		iUser.saveUser(user);
	}
	
	@GetMapping("/all")
	public @ResponseBody List<AppUser> getAllUsers(){
		return iUser.getUsers(); 
	}
	@PutMapping("/user/{id}")
	public void putUser(@PathVariable (name="id")long id, @RequestBody AppUser appUser) {
		iUser.updateUser(appUser, id);
	}
	
	@DeleteMapping("/delete-by-id/{Id}")
	public void deleteUser(@PathVariable (name="Id") long Id) {
		iUser.DeleteUser(Id);
	}
	@GetMapping("/one/{id}")
	public @ResponseBody AppUser getOneUser(@PathVariable (name="id") long id,AppUser user) {
		//AppUser user = iUser.getOneUser(id);
		return iUser.getOneUser(id);
	}
	
	}


