package tn.bns.manifeste.services;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import tn.bns.manifeste.entities.AppUser;
import tn.bns.manifeste.repositories.UserRepository;

@Service
public class UserDetailsServicesImpl implements UserDetailsService {

    @Autowired
    private AccountServiceImpl accountService;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AppUser user = accountService.findUserByUserName(username);
        System.out.println("userdetailservice" + username);
        System.out.println("user found" + user);
        if (user == null) throw new UsernameNotFoundException(username);
        System.out.println("user trouver ");
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        System.out.println("rrrrrrrroles" + user.getUserRoles());

        user.getUserRoles().forEach(r -> {
            authorities.add(new SimpleGrantedAuthority(r.getRoleName()));
        });
        System.out.println("user trouver " + authorities);
        return new User(user.getUsername(), user.getPassword(), authorities);
    }


}
