package tn.esprit.samalinesryne4arctic7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.samalinesryne4arctic7.entity.Client;
import tn.esprit.samalinesryne4arctic7.entity.Colis;
import tn.esprit.samalinesryne4arctic7.entity.Etat;

import java.util.List;
import java.util.Optional;

@Repository
public interface ColisRepository extends JpaRepository<Colis, Long> {
    List<Colis> findByEtatColis(Etat etat);

    Optional<Colis> findByRefColis(String referenceColis);
}
