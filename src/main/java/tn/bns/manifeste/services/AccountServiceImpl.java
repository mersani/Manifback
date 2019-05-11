package tn.bns.manifeste.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import tn.bns.manifeste.entities.AppRole;
import tn.bns.manifeste.entities.AppUser;
import tn.bns.manifeste.repositories.RoleRepository;
import tn.bns.manifeste.repositories.UserRepository;


@Service
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private BCryptPasswordEncoder bCrypPasswordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    //@Override
    public AppUser saveUser(AppUser user) {
        String hashPW = bCrypPasswordEncoder.encode(user.getPassword());
        user.setPassword(hashPW);
        return userRepository.save(user);
    }

    //@Override
    public AppRole saveRole(AppRole role) {

        return roleRepository.save(role);
    }

    //@Override
    public void addRoleToUser(String username, String roleName) {
        AppRole role = roleRepository.findByRoleName(roleName);
        AppUser user = userRepository.findByUsername(username);
        user.getUserRoles().add(role);
        userRepository.saveAndFlush(user);

    }

    //@Override
    public AppUser findUserByUserName(String userName) {

        return userRepository.findByUsername(userName);
    }


}
