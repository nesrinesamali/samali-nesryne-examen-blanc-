package tn.esprit.samalinesryne4arctic7.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.samalinesryne4arctic7.entity.Assurance;
import tn.esprit.samalinesryne4arctic7.repository.AssuranceRepository;

import java.util.List;
@Service
public class AssuranceServiceImpl implements IAssuranceService{


    @Autowired
    private AssuranceRepository assuranceRepository;


    @Override
    public List<Assurance> retrieveAllAssurances() {
        return assuranceRepository.findAll();
    }

    @Override
    public Assurance retrieveAssurance(int idAssurance) {
        return assuranceRepository.findById(idAssurance).get();
    }

    @Override
    public Assurance addAssurance(Assurance assurance) {
        return assuranceRepository.save(assurance);
    }

    @Override
    public void removeAssurance(int idAssurance) {
        assuranceRepository.deleteById(idAssurance);

    }

    @Override
    public Assurance modifyAssurance(Assurance assurance) {
        return assuranceRepository.save(assurance);
    }
}
