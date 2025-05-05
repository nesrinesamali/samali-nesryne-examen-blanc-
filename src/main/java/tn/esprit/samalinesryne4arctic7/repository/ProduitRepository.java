package tn.esprit.samalinesryne4arctic7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.samalinesryne4arctic7.entity.Colis;
import tn.esprit.samalinesryne4arctic7.entity.Produit;

import java.util.Optional;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
    Optional<Object> findByIdentifiant(String identifiant);
}
