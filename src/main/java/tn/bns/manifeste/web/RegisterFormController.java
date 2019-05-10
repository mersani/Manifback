package tn.bns.manifeste.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import tn.bns.manifeste.entities.AppBureauDouane;
import tn.bns.manifeste.entities.AppConsignataire;
import tn.bns.manifeste.entities.AppConteneur;
import tn.bns.manifeste.entities.AppManifeste;
import tn.bns.manifeste.entities.AppMarchandise;
import tn.bns.manifeste.entities.AppMoyenTransport;
import tn.bns.manifeste.entities.AppUser;
import tn.bns.manifeste.entities.RegisterForm;
import tn.bns.manifeste.repositories.BureauDouaneRepository;
import tn.bns.manifeste.repositories.ConsignataireRepository;
import tn.bns.manifeste.repositories.ConteneurRepository;
import tn.bns.manifeste.repositories.ManifesteRepository;
import tn.bns.manifeste.repositories.MarchandiseRepository;
import tn.bns.manifeste.repositories.MoyenTransportRepository;
import tn.bns.manifeste.repositories.NationaliteMoyenTransportRepository;
import tn.bns.manifeste.repositories.TitreTransportRepository;
import tn.bns.manifeste.repositories.TransporteurRepository;
import tn.bns.manifeste.repositories.TypeTitreTransportRepository;
import tn.bns.manifeste.repositories.UserRepository;
import tn.bns.manifeste.services.IRegisterForm;

public class RegisterFormController {

	@Autowired
	private IRegisterForm iRegisterForm;
	
	@PostMapping("/save")
	public void saveRegisterForm(@RequestBody RegisterForm registerForm) {
		iRegisterForm.saveRegisterForm(registerForm);
	}
	}


