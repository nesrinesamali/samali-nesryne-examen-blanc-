package tn.esprit.samalinesryne4arctic7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.samalinesryne4arctic7.entity.Categorie;
import tn.esprit.samalinesryne4arctic7.entity.Client;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ClientRepository  extends JpaRepository<Client, Long> {
    List<Client> findDistinctByColis_Produits_CategorieProdAndColis_DateLivraisonAfter(Categorie categorieProd, LocalDate dateLivraison);
}
