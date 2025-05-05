package tn.esprit.samalinesryne4arctic7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.samalinesryne4arctic7.entity.Assurance;
@Repository
public interface AssuranceRepository extends JpaRepository<Assurance, Integer> {
}
