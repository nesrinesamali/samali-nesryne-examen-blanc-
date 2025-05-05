package tn.esprit.samalinesryne4arctic7.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.samalinesryne4arctic7.entity.*;
import tn.esprit.samalinesryne4arctic7.repository.ClientRepository;
import tn.esprit.samalinesryne4arctic7.repository.ColisRepository;
import tn.esprit.samalinesryne4arctic7.repository.ProduitRepository;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

@Service
public class ClientServiceImpl implements IClientService {
    @Autowired
    private ClientRepository clientRepository;
    private ColisRepository colisRepository;
    private ProduitRepository produitRepository;

    @Override
    public Client addClient(Client client) {
        return clientRepository.save(client);
    }
    @Override
    public Colis ajouterColisEtAffecterAClient(Colis c, Long idClient) {
        Client cl = clientRepository.findById(idClient).orElse(null);
        if (cl != null) {
            c.setClient(cl);
            for (Produit p : c.getProduit()) {
                produitRepository.findByIdentifiant(p.getIdentifiant()).ifPresent(prod -> p.setidProduit(p.getIdProduit()));
            }
            return colisRepository.save(c);
        }
        return null;
    }

    @Override
    public List<Client> afficherClients(Categorie categorieProd, LocalDate dateLivraison) {
        return clientRepository.findDistinctByColis_Produits_CategorieProdAndColis_DateLivraisonAfter(categorieProd, dateLivraison);
    }
    @Override
    public Client clientFidele() {
        List<Client> clients = clientRepository.findAll();
        return clients.stream()
                .max(Comparator.comparingInt(cl -> (int) cl.getColis().stream()
                        .filter(c -> c.getEtatColis() != Etat.ANNULE).count()))
                .orElse(null);
    }
}
