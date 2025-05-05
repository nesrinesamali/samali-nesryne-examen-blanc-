package tn.esprit.samalinesryne4arctic7.control;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.samalinesryne4arctic7.entity.Assurance;
import tn.esprit.samalinesryne4arctic7.service.IAssuranceService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/assurance")
public class AssuranceRestController {
    @Autowired
    public IAssuranceService assuranceService;

    @GetMapping("/retrieve-all-assurance")
    public List<Assurance> getAllAssurance() {
        List<Assurance> listAssurances = assuranceService.retrieveAllAssurances();
        return listAssurances;
    }
    @GetMapping("/retrieve-assurance/{assurance-id}")
    public Assurance retrieveAssurance(@PathVariable("assurance-id") int idAssurance) {
       Assurance assurance = assuranceService.retrieveAssurance(idAssurance);
        return assurance;
    }

    @PostMapping("/add-assurance")
    public Assurance addAssurance(@RequestBody Assurance a) {
        Assurance assurance = assuranceService.addAssurance(a);
        return assurance;
    }
    @DeleteMapping("/remove-assurance/{assurance-id}")
    public void removeAssurance(@PathVariable("assurance-id") int idAssurance) {
        assuranceService.removeAssurance(idAssurance);
    }
    @PutMapping("/modify-assurance")
    public Assurance modifyAssurance(@RequestBody Assurance a) {
       Assurance assurance = assuranceService.modifyAssurance(a);
        return assurance;
    }
}
