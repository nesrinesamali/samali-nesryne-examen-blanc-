package tn.esprit.samalinesryne4arctic7.service;

import tn.esprit.samalinesryne4arctic7.entity.Assurance;
import tn.esprit.samalinesryne4arctic7.entity.Categorie;
import tn.esprit.samalinesryne4arctic7.entity.Client;
import tn.esprit.samalinesryne4arctic7.entity.Colis;

import java.time.LocalDate;
import java.util.List;

public interface IClientService {

    Client addClient(Client client);

    Colis ajouterColisEtAffecterAClient(Colis c, Long idClient);

    List<Client> afficherClients(Categorie categorieProd, LocalDate dateLivraison);


    Client clientFidele();

}
