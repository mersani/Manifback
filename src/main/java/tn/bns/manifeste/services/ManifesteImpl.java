package tn.bns.manifeste.services;

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
	public boolean saveManifeste(ManifestObject manifeste) {

			//System.out.println("begin service " + manifeste.getAppManifeste().getAppTitreTransport().getTtNatureMarchandise() );
		AppPieceJointe appPieceJointe = new AppPieceJointe();
		AppPieceJointe appPieceJointe1 = pieceJointeRepository.saveAndFlush(appPieceJointe);
		manifeste.getAppManifeste().getAppTitreTransport().setAppPieceJointe(appPieceJointe1);
		AppTitreTransport appTitreTransport1 = new AppTitreTransport();
		appTitreTransport1.setTtNatureMarchandise(manifeste.getAppManifeste().getAppTitreTransport().getTtNatureMarchandise());
		AppTitreTransport appTitreTransport = titreTransportRepository.saveAndFlush(appTitreTransport1);

		System.out.println("begin service add appTitreTransport ");

			/**
			 * add marchandise
			 */
			manifeste.getAppMarchandise().setAppTitreTransport(appTitreTransport);

			AppMarchandise appMarchandise = marchandiseRepository.saveAndFlush(manifeste.getAppMarchandise());
			System.out.println("begin service add marchandise ");
			/**
			 * add conteneur
			 */
			//manifeste.getAppConteneur().setAppTitreTransport(appTitreTransport);
			AppConteneur appConteneur = conteneurRepository.saveAndFlush(manifeste.getAppConteneur());
			System.out.println("begin service add conteneur ");
			/**
			 * add manifest
			 */
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
			 */
			manifeste.getAppTransporteur().setAppManifeste(appManifeste);
			AppTransporteur appTransporteur = transporteurRepository.saveAndFlush(manifeste.getAppTransporteur());
			System.out.println("begin service add transporteur ");
			/**
			 * add MoyenTransport
			 */
			manifeste.getAppMoyenTransport().setAppManifeste(appManifeste);
			AppMoyenTransport appMoyenTransport = moyenTransportRepository.saveAndFlush(manifeste.getAppMoyenTransport());
			System.out.println("begin service add moyentransport ");
			/**
			 * add Consignateur
			 */
			manifeste.getAppConsignataire().setAppManifeste(appManifeste);
			AppConsignataire appConsignataire = consignataireRepository.saveAndFlush(manifeste.getAppConsignataire());
			System.out.println("begin service add consignateur ");
			return true;
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
		connaissementObject.getAppManifeste().setInterId(appIntervenant1);
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

		return false;
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
	public void updateManifeste(AppManifeste appManifeste, long manId) {
		Optional<AppManifeste> manifeste = manifesteRepository.findById(manId); 
		if(manifeste.isPresent()){
			AppManifeste manifesteb = manifeste.get();
			manifesteb.setAcconier(appManifeste.getAcconier());
			manifesteb.setManNumVoyage(appManifeste.getManNumVoyage());
			manifesteb.setManDateDepart(appManifeste.getManDateDepart());
			manifesteb.setManDateArrive(appManifeste.getManDateArrive());
			//manifesteb.setManHeureArrive(appManifeste.getManHeureArrive());
			manifesteb.setManNumEnregistrement(appManifeste.getManNumEnregistrement());
			manifesteb.setManDateEnregistrement(appManifeste.getManDateEnregistrement());
			manifesteb.setManLieuChargement(appManifeste.getManLieuChargement());
			manifesteb.setManModeTransport(appManifeste.getManModeTransport());
			manifesteb.setManTypeManifeste(appManifeste.getManTypeManifeste());
			manifesteb.setManNumEscale(appManifeste.getManNumEscale());
			manifesteb.setManjaugeBrute(appManifeste.getManjaugeBrute());
			manifesteb.setManJaugeNette(appManifeste.getManJaugeNette());
			manifesteRepository.saveAndFlush(manifesteb); 
			
		}
		
	}

	@Override
	public AppManifeste getOneManifeste(long manId) {
		AppManifeste manif=manifesteRepository.findById(manId).get();
				return manif;
	}

	
				 
				 
	}


	


