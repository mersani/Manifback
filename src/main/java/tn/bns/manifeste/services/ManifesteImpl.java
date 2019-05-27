package tn.bns.manifeste.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import tn.bns.manifeste.entities.*;
import tn.bns.manifeste.repositories.ManifesteRepository;
import tn.bns.manifeste.repositories.TitreTransportRepository;
import tn.bns.manifeste.repositories.TypeTitreTransportRepository;
import tn.bns.manifeste.repositories.MoyenTransportRepository;
import tn.bns.manifeste.repositories.TransporteurRepository;
import tn.bns.manifeste.repositories.MarchandiseRepository;
import tn.bns.manifeste.repositories.ConteneurRepository;
import tn.bns.manifeste.repositories.ConsignataireRepository;
import tn.bns.manifeste.repositories.BureauDouaneRepository;
import tn.bns.manifeste.repositories.PieceJointeRepository;
import tn.bns.manifeste.repositories.IntervenantRepository;


@Service
public class ManifesteImpl implements IManifeste {

    @Autowired
    private ManifesteRepository manifesteRepository;
    @Autowired
    private TitreTransportRepository titreTransportRepository;
    @Autowired
    private TransporteurRepository transporteurRepository;
    @Autowired
    private MarchandiseRepository marchandiseRepository;
    @Autowired
    private ConteneurRepository conteneurRepository;
    @Autowired
    private BureauDouaneRepository douaneRepository;
    @Autowired
    private MoyenTransportRepository moyenTransportRepository;
    @Autowired
    private ConsignataireRepository consignataireRepository;
    @Autowired
    private IntervenantRepository intervenantRepository;
    @Autowired
    private PieceJointeRepository pieceJointeRepository;
    @Autowired
    private TypeTitreTransportRepository typeTitreTransportRepository;

    @Override
    @Transactional
    public AppManifeste saveManifeste(AppManifeste manifeste) {

        //System.out.println("begin service " + manifeste.getAppManifeste().getAppTitreTransport().getTtNatureMarchandise() );
		/*AppPieceJointe appPieceJointe = new AppPieceJointe();
		AppPieceJointe appPieceJointe1 = pieceJointeRepository.saveAndFlush(appPieceJointe);
		manifeste.getAppManifeste().getAppTitreTransport().setAppPieceJointe(appPieceJointe1);
		AppTitreTransport appTitreTransport1 = new AppTitreTransport();
		appTitreTransport1.setTtNatureMarchandise(manifeste.getAppManifeste().getAppTitreTransport().getTtNatureMarchandise());
		AppTitreTransport appTitreTransport = titreTransportRepository.saveAndFlush(appTitreTransport1);

		System.out.println("begin service add appTitreTransport ");

			/**
			 * add marchandise

			manifeste.getAppMarchandise().setAppTitreTransport(appTitreTransport);

			AppMarchandise appMarchandise = marchandiseRepository.saveAndFlush(manifeste.getAppMarchandise());
			System.out.println("begin service add marchandise ");
			/**
			 * add conteneur

			//manifeste.getAppConteneur().setAppTitreTransport(appTitreTransport);
			AppConteneur appConteneur = conteneurRepository.saveAndFlush(manifeste.getAppConteneur());
			System.out.println("begin service add conteneur ");
			/**
			 * add manifest

			manifeste.getAppManifeste().setAppTitreTransport(appTitreTransport);
		List<AppBureauDouane> list = manifeste.getAppManifeste().getBureauDouane();
		AppBureauDouane appBureauDouane = douaneRepository.saveAndFlush(list.get(0));
		System.out.println("begin service add manifest ");
		AppIntervenant appIntervenant = new AppIntervenant();
		AppIntervenant appIntervenant1 = intervenantRepository.saveAndFlush(appIntervenant);
		manifeste.getAppManifeste().setInterId(appIntervenant1);
		manifeste.getAppManifeste().setAppTitreTransport(appTitreTransport);
		manifeste.getAppManifeste().getBureauDouane().add(appBureauDouane);
			AppManifeste appManifeste = manifesteRepository.saveAndFlush(manifeste.getAppManifeste());
			System.out.println("end service add manifest ");
			/**
			 * add transporteur

			AppTransporteur appTransporteur = transporteurRepository.saveAndFlush(manifeste.getAppTransporteur());
			System.out.println("begin service add transporteur ");
			/**
			 * add MoyenTransport

			manifeste.getAppMoyenTransport().setAppManifeste(appManifeste);
			AppMoyenTransport appMoyenTransport = moyenTransportRepository.saveAndFlush(manifeste.getAppMoyenTransport());
			System.out.println("begin service add moyentransport ");
			/**
			 * add Consignateur

			AppConsignataire appConsignataire = consignataireRepository.saveAndFlush(manifeste.getAppConsignataire());
			System.out.println("begin service add consignateur ");*/
        AppTransporteur appTransporteur = transporteurRepository.saveAndFlush(manifeste.getAppTransporteur());
        manifeste.setAppTransporteur(appTransporteur);
        AppConsignataire appConsignataire = consignataireRepository.saveAndFlush(manifeste.getConsignataire());
        manifeste.setConsignataire(appConsignataire);
        List<AppBureauDouane> list = manifeste.getBureauDouane();
        AppBureauDouane appBureauDouane = douaneRepository.saveAndFlush(list.get(0));
        AppMoyenTransport appMoyenTransport = moyenTransportRepository.saveAndFlush(manifeste.getAppMoyenTransport());
        AppTitreTransport appTitreTransport = titreTransportRepository.saveAndFlush(manifeste.getAppTitreTransport());
        manifeste.setAppTitreTransport(appTitreTransport);
        return manifesteRepository.saveAndFlush(manifeste);
    }

    @Override
    public boolean saveConnaissement(ConnaissementObject connaissementObject) {

        AppTitreTransport appTitreTransport = titreTransportRepository.saveAndFlush(connaissementObject.getAppManifeste().getAppTitreTransport());
        AppTypeTitreTransport appTypeTitreTransport = connaissementObject.getAppTypeTitreTransport();
        appTypeTitreTransport.setAppTitreTransport(appTitreTransport);
        AppTypeTitreTransport appTypeTitreTransport1 = typeTitreTransportRepository.saveAndFlush(appTypeTitreTransport);
        /**
         * save manifest
         */
        List<AppBureauDouane> list = connaissementObject.getAppManifeste().getBureauDouane();
        AppBureauDouane appBureauDouane = douaneRepository.saveAndFlush(list.get(0));
        AppIntervenant appIntervenant = new AppIntervenant();
        AppIntervenant appIntervenant1 = intervenantRepository.saveAndFlush(appIntervenant);
        connaissementObject.getAppManifeste().setAppTitreTransport(appTitreTransport);
        connaissementObject.getAppManifeste().getBureauDouane().add(appBureauDouane);
        AppManifeste appManifeste = manifesteRepository.saveAndFlush(connaissementObject.getAppManifeste());
        connaissementObject.getAppMarchandise().setAppTitreTransport(appTitreTransport);

        AppMarchandise appMarchandise = marchandiseRepository.saveAndFlush(connaissementObject.getAppMarchandise());
        System.out.println("begin service add marchandise ");
        /**
         * add conteneur
         */
        //manifeste.getAppConteneur().setAppTitreTransport(appTitreTransport);
        AppConteneur appConteneur = conteneurRepository.saveAndFlush(connaissementObject.getAppConteneur());
        System.out.println("begin service add conteneur ");

        return true;
    }


    @Override
    public List<AppManifeste> getManifeste() {
        return manifesteRepository.findAll();
    }

    @Override
    public void DeleteManifeste(long manId) {
        manifesteRepository.deleteById(manId);

    }

    @Override
    public Boolean updateManifeste(AppManifeste appManifeste, Long manId) {
        Optional<AppManifeste> manifeste = manifesteRepository.findById(manId);
        if (manifeste.isPresent()) {
            System.out.println("1");
            List<AppMarchandise> marchandise = appManifeste.getAppTitreTransport().getAppMarchandises();
            System.out.println("2");

            marchandise.get(0).setAppTitreTransport(appManifeste.getAppTitreTransport());
            System.out.println("3");

            AppMarchandise appMarchandise = marchandiseRepository.saveAndFlush(marchandise.get(0));
            System.out.println("4");
            AppIntervenant appIntervenant = appManifeste.getAppTitreTransport().getInterId();
            AppIntervenant intervenant = intervenantRepository.saveAndFlush(appIntervenant);
            System.out.println("5");

            List<AppConteneur> conteneurList = appManifeste.getAppTitreTransport().getAppConteneurs();
            System.out.println("6");

            conteneurList.get(0).setAppTitreTransport(appManifeste.getAppTitreTransport());
            System.out.println("7");
            AppConteneur conteneur = conteneurRepository.saveAndFlush(conteneurList.get(0));
            System.out.println("8" + conteneur.getContId());

           /* appManifeste.getAppTitreTransport().getAppMarchandises().add(appMarchandise);
            System.out.println("9");
           List<AppConteneur> list = new ArrayList<>();
           list.add(conteneur);
            appManifeste.getAppTitreTransport().setAppConteneurs(list);*/
            appManifeste.getAppTitreTransport().setInterId(intervenant);
            AppTitreTransport appTitreTransport = titreTransportRepository.saveAndFlush(appManifeste.getAppTitreTransport());
            System.out.println("10");

          /*  appManifeste.setAppTitreTransport(appTitreTransport);
            System.out.println("11");*/

            manifesteRepository.saveAndFlush(appManifeste);

        }
        return true;
    }

    @Override
    public AppManifeste getOneManifeste(long manId) {
        AppManifeste manif = manifesteRepository.findById(manId).get();
        return manif;
    }


}


	


