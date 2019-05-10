package tn.bns.manifeste.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.bns.manifeste.entities.AppManifeste;
import tn.bns.manifeste.entities.AppUser;
import tn.bns.manifeste.repositories.UserRepository;

@Service
public class UserImpl implements IUser {

    @Autowired
    private UserRepository userRepository;

    public void saveUser(AppUser user) {
        userRepository.save(user);

    }

    @Override
    public List<AppUser> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public void updateUser(AppUser appUser, long Id) {
        Optional<AppUser> user = userRepository.findById(Id);
        if (user.isPresent()) {
            AppUser userb = user.get();
            userb.setUsername(appUser.getUsername());
            userb.setPassword(appUser.getPassword());
            userb.setUserEmail(appUser.getUserEmail());
            userb.setUserCin(appUser.getUserCin());
            userb.setUserPartenaire(appUser.getUserPartenaire());
            userb.setUserGroupe(appUser.getUserGroupe());
            userRepository.saveAndFlush(userb);
        }
    }

    @Override
    public void DeleteUser(long id) {
        userRepository.deleteById(id);

    }

	@Override
	public AppUser getOneUser(long id) {
			AppUser obj = userRepository.findById(id).get();
			return obj;
		}
		
	}


