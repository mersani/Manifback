package tn.bns.manifeste.web;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import tn.bns.manifeste.services.IAccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import tn.bns.manifeste.entities.AppRole;
import tn.bns.manifeste.entities.AppUser;
import tn.bns.manifeste.services.IUser;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "user", produces = "application/json")
public class UserController {

    @Autowired
    private IUser iUser;
    @Autowired
    private IAccountService iAccountService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostMapping("/save")
    public AppUser saveUser(@RequestBody AppUser user) {
        System.out.println("user " + user.toString());
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        System.out.println(user.toString());

        return iUser.saveUser(user);
    }

    @PutMapping("/addRoleToUser/{username}")
    public Boolean addRoleToUser(@PathVariable String username, @RequestBody AppRole role) {
        System.out.println("user " + username.toString());
        System.out.println(role.toString());
        try {
            iAccountService.addRoleToUser(username, role.getRoleName());
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @GetMapping("/all")
    public @ResponseBody
    List<AppUser> getAllUsers() {
        return iUser.getUsers();
    }

    @PutMapping("/user/{id}")
    public void putUser(@PathVariable(name = "id") long id, @RequestBody AppUser appUser) {
        iUser.updateUser(appUser, id);
    }

    @DeleteMapping("/delete-by-id/{Id}")
    public void deleteUser(@PathVariable(name = "Id") long Id) {
        iUser.DeleteUser(Id);
    }

    @GetMapping("/one/{id}")
    public @ResponseBody
    AppUser getOneUser(@PathVariable(name = "id") long id, AppUser user) {
        //AppUser user = iUser.getOneUser(id);
        return iUser.getOneUser(id);
    }

}


