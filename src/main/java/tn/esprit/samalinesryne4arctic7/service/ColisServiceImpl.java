package tn.esprit.samalinesryne4arctic7.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.samalinesryne4arctic7.entity.Colis;
import tn.esprit.samalinesryne4arctic7.entity.Etat;
import tn.esprit.samalinesryne4arctic7.repository.ColisRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ColisServiceImpl implements IColisService{

    @Autowired
    private ColisRepository colisRepository;
    @Override
    public Colis addColis(Colis colis) {
        return colisRepository.save(colis);
    }


    @Scheduled(fixedRate = 20000)
    @Override
    public void mettreAJourEtatAfficherColis() {
        List<Colis> colisList = colisRepository.findByEtatColis(Etat.EN_ATTENTE);
        for (Colis c : colisList) {
            c.setEtatColis(Etat.EN_COURS);
            colisRepository.save(c);
        }
        List<Colis> enCours = colisRepository.findByEtatColis(Etat.EN_COURS);
        enCours.forEach(c -> System.out.println("Colis EN_COURS: " + c.getReferenceColis()));
    }

    @Override
    public float montantAPayerParClient(String referenceColis) {
        Optional<Colis> colis = colisRepository.findByRefColis(referenceColis);
        if (colis.isPresent()) {
            float total = colis.get().getPrixCommande();
            return total >= 100 ? total : total + 8;
        }
        return 0;
    }

}
