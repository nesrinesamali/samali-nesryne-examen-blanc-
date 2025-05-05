package tn.esprit.samalinesryne4arctic7.service;

import tn.esprit.samalinesryne4arctic7.entity.Assurance;

import java.util.List;

public interface IAssuranceService {
    List<Assurance> retrieveAllAssurances();
    Assurance retrieveAssurance(int idAssurance);
    Assurance addAssurance(Assurance assurance);
    void removeAssurance(int idAssurance);
    Assurance modifyAssurance(Assurance assurance);
}
