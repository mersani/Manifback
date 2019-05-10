package tn.bns.manifeste.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.bns.manifeste.entities.AppMarchandise;
import tn.bns.manifeste.entities.AppMoyenTransport;
import tn.bns.manifeste.repositories.MoyenTransportRepository;

@Service
public class MoyenTransportImpl implements IMoyenTransport {
    @Autowired
    private MoyenTransportRepository moyenTransportRepository;

    public void saveMoyenTransport(AppMoyenTransport moyenTransport) {
        moyenTransportRepository.save(moyenTransport);
    }

    @Override
    public List<AppMoyenTransport> getMoyensTransports() {

        return moyenTransportRepository.findAll();
    }

	@Override
	public void deleteMoyenTransport(long idMoyenT) {
		moyenTransportRepository.deleteById(idMoyenT);
		
	}

	@Override
	public void updateMoyenTransport(AppMoyenTransport appMoyenTransport, long idMoyenT) {
		Optional<AppMoyenTransport> moyenTransport=moyenTransportRepository.findById(idMoyenT); 
		AppMoyenTransport moyenTransportb=moyenTransport.get(); 
		moyenTransportb.setMoyenTType(appMoyenTransport.getMoyenTType());
		moyenTransportb.setMoyenMat(appMoyenTransport.getMoyenMat());
		moyenTransportRepository.saveAndFlush(moyenTransportb); 
	}

	@Override
	public AppMoyenTransport getOneMoyenTransport(long idMoyenT) {
		AppMoyenTransport moyT= moyenTransportRepository.findById(idMoyenT).get();
		return moyT;
	}

}
