package tn.esprit.samalinesryne4arctic7.service;

import org.springframework.scheduling.annotation.Scheduled;
import tn.esprit.samalinesryne4arctic7.entity.Client;
import tn.esprit.samalinesryne4arctic7.entity.Colis;

public interface IColisService {
   Colis addColis(Colis colis);

   @Scheduled(fixedRate = 20000)
   void mettreAJourEtatAfficherColis();

   float montantAPayerParClient(String referenceColis);
}
