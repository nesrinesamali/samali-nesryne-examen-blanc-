package tn.esprit.samalinesryne4arctic7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.samalinesryne4arctic7.entity.Colis;
import tn.esprit.samalinesryne4arctic7.entity.Livreur;

@Repository
public interface LivreurRepository extends JpaRepository<Livreur, Long> {

}
