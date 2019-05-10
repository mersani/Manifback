package tn.bns.manifeste.services;

import org.springframework.beans.factory.annotation.Autowired;

import tn.bns.manifeste.entities.AppBureauDouane;
import tn.bns.manifeste.entities.AppConsignataire;
import tn.bns.manifeste.entities.AppConteneur;
import tn.bns.manifeste.entities.AppManifeste;
import tn.bns.manifeste.entities.AppMarchandise;
import tn.bns.manifeste.entities.AppMoyenTransport;
import tn.bns.manifeste.entities.AppNationaliteMoyenTransport;
import tn.bns.manifeste.entities.AppReferences;
import tn.bns.manifeste.entities.AppTitreTransport;
import tn.bns.manifeste.entities.AppTypeTitreTransport;
import tn.bns.manifeste.entities.AppUser;
import tn.bns.manifeste.entities.RegisterForm;
import tn.bns.manifeste.repositories.BureauDouaneRepository;
import tn.bns.manifeste.repositories.ConsignataireRepository;
import tn.bns.manifeste.repositories.ConteneurRepository;
import tn.bns.manifeste.repositories.ManifesteRepository;
import tn.bns.manifeste.repositories.MarchandiseRepository;
import tn.bns.manifeste.repositories.MoyenTransportRepository;
import tn.bns.manifeste.repositories.NationaliteMoyenTransportRepository;
import tn.bns.manifeste.repositories.ReferenceRepository;
import tn.bns.manifeste.repositories.TitreTransportRepository;
import tn.bns.manifeste.repositories.TransporteurRepository;
import tn.bns.manifeste.repositories.TypeTitreTransportRepository;
import tn.bns.manifeste.repositories.UserRepository;

public class RegisterFormImp implements IRegisterForm{

    @Autowired
    private UserRepository userRepository;
    
	@Autowired
	private TypeTitreTransportRepository typeTitreTransportRepository; 
	@Autowired
	private TransporteurRepository transporteurRepository; 
	@Autowired
	private TitreTransportRepository titreTransportRepository; 
	@Autowired
	private NationaliteMoyenTransportRepository nationaliteMoyenTransportRepository;
	@Autowired
	private MoyenTransportRepository moyenTransportRepository;
	@Autowired
	private MarchandiseRepository marchandiseRepository; 
	@Autowired
	private ManifesteRepository manifesteRepository; 
	@Autowired
	private ConteneurRepository conteneurRepository; 
	@Autowired
	private ConsignataireRepository consignataireRepository; 
	@Autowired
	private BureauDouaneRepository bureauDouaneRepository ; 
    @Autowired
    private ReferenceRepository referenceRepository ;
	@Override
	public void saveRegisterForm(RegisterForm registerForm) {
		AppManifeste manif=new AppManifeste();
		
		manif.setAcconier(registerForm.getAcconier());
		manif.setManDateArrive(registerForm.getManDateArrive());
		manif.setManDateDepart(registerForm.getManDateArrive());
		manif.setManDateEnregistrement(registerForm.getManDateEnregistrement());
		manif.setManDateEscale(registerForm.getManDateEscale());
		manif.setManHeureArrive(registerForm.getManHeureArrive());
		manif.setManjaugeBrute(registerForm.getManjaugeBrute());
		manif.setManJaugeNette(registerForm.getManJaugeNette());
		manif.setManLieuChargement(registerForm.getManLieuChargement());
		manif.setmANLieuDestination(registerForm.getManLieuDestination());
		manif.setManModeTransport(registerForm.getManModeTransport());
		manif.setManNumEnregistrement(registerForm.getManNumEnregistrement());
		manif.setManNumEscale(registerForm.getManNumEscale());
		manif.setManNumVoyage(registerForm.getManNumVoyage());
		manif.setManTypeManifeste(registerForm.getManTypeManifeste());
	    manifesteRepository.save(manif); 
	    
	    AppBureauDouane bd=new AppBureauDouane();
	    bd.setBurDId(registerForm.getBurDId());
	    bureauDouaneRepository.save(bd);
	    
	    AppUser user=new AppUser();
	    user.setUsername(registerForm.getUsername());
	    user.setId(registerForm.getId());
	    userRepository.save(user); 
	    
	    AppConsignataire cons=new AppConsignataire(); 
	    cons.setConsAdresse(registerForm.getConsAdresse());
	    consignataireRepository.save(cons); 
	    
	    AppMoyenTransport mt=new AppMoyenTransport(); 
	    mt.setIdMoyenT(registerForm.getIdMoyenT());
	    mt.setMoyenMat(registerForm.getMoyenMat());
	    mt.setMoyenTType(registerForm.getMoyenTType());
	    moyenTransportRepository.save(mt);
	    
	    AppConteneur cont=new AppConteneur(); 
	    cont.setContId(registerForm.getContId());
	    cont.setContMarqueScelle(registerForm.getContMarqueScelle());
	    cont.setContNombreColis(registerForm.getContNombreColis());
	    cont.setContNombreScelle(registerForm.getContNombreScelle());
	    cont.setContReference(registerForm.getContReference());
	    cont.setContResponsableScelle(registerForm.getContResponsableScelle());
	    cont.setContTauxRemplissage(registerForm.getContTauxRemplissage());
	    cont.setContType(registerForm.getContType());
	    conteneurRepository.save(cont);
	    
	    AppMarchandise march= new AppMarchandise(); 
	    march.setMarAdresseIntervenant(registerForm.getMarAdresseIntervenant());
	    march.setMarCategorieMarchandise(registerForm.getMarCategorieMarchandise());
	    march.setMarClasse(registerForm.getMarClasse());
	    march.setMarCodeDouaneIntervenant(registerForm.getMarCodeDouaneIntervenant());
	    march.setMarDangereuse(registerForm.isMarDangereuse());
	    march.setMarDesignation(registerForm.getMarDesignation());
	    march.setMarId(registerForm.getMarId());
	    march.setMarIdIntervenant(registerForm.getMarIdIntervenant());
	    march.setMarIdMagasin(registerForm.getMarIdMagasin());
	    march.setMarIdTransitaire(registerForm.getMarIdTransitaire());
	    march.setMarImoMs(registerForm.getMarImoMs());
	    march.setMarImoPageNumber(registerForm.getMarImoPageNumber());
	    march.setMarMarque(registerForm.getMarMarque());
	    march.setMarNombreColis(registerForm.getMarNombreColis());
	    march.setMarNumColis(registerForm.getMarNumColis());
	    march.setMarPoids(registerForm.getMarPoids());
	    march.setMarPoidsBrute(registerForm.getMarPoidsBrute());
	    march.setMarPoidsNette(registerForm.getMarPoidsNette());
	    march.setMarRaisonSocialeIntervenant(registerForm.getMarRaisonSocialeIntervenant());
	    march.setMarRaisonSocialeMagasin(registerForm.getMarRaisonSocialeMagasin());
	    march.setMarRaisonSocialeTransitaire(registerForm.getMarRaisonSocialeTransitaire());
	    march.setMarReceptionnaire(registerForm.getMarReceptionnaire());
	    march.setMarStatut(registerForm.getMarStatut());
	    march.setMarTelephoneIntervenant(registerForm.getMarTelephoneIntervenant());
	    march.setMarUndgNumber(registerForm.getMarUndgNumber());
	    march.setMarVolume(registerForm.getMarVolume());
	    marchandiseRepository.save(march); 
	    
	    AppNationaliteMoyenTransport nat= new AppNationaliteMoyenTransport(); 
	    nat.setNATmoyenT_id(registerForm.getNATmoyenT_id());
	    nationaliteMoyenTransportRepository.save(nat); 
	    
	    AppReferences ref= new AppReferences(); 
	    ref.setCodepays(registerForm.getCodepays());
	    ref.setIdreference(registerForm.getIdreference());
	    referenceRepository.save(ref);
	    
	    AppTypeTitreTransport type=new AppTypeTitreTransport(); 
	    type.setTypeTNom(registerForm.getTypeTNom());
	    type.setTypeTtId(registerForm.getTypeTtId());
	    typeTitreTransportRepository.save(type); 
	    
	    AppTitreTransport titre=new AppTitreTransport(); 
	    titre.setTtCode(registerForm.getTtCode());
	    titre.setTtDatearriveDeNavire(registerForm.getTtDatearriveDeNavire());
	    titre.setTtDateDepartDeNavire(registerForm.getTtDatearriveDeNavire());
	    titre.setTtHeureArrive(registerForm.getTtHeureArrive());
	    titre.setTtNatureMarchandise(registerForm.getTtNatureMarchandise());
	    titre.setTtNatureTitreTransport(registerForm.getTtNatureMarchandise());
	    titre.setTtNumerodevoyage(registerForm.getTtNumeroDevoyage());
	    titre.setTtNumeroEnregistrement(registerForm.getTtNumeroEnregistrement());
	    titre.setTtReference(registerForm.getTtReference());
	    titreTransportRepository.save(titre);
	}
		
	}


