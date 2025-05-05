package tn.esprit.samalinesryne4arctic7.control;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.samalinesryne4arctic7.entity.Client;
import tn.esprit.samalinesryne4arctic7.entity.Colis;
import tn.esprit.samalinesryne4arctic7.service.IClientService;
import tn.esprit.samalinesryne4arctic7.service.IColisService;

@RestController
@AllArgsConstructor
@RequestMapping("/colis")
public class ColisRestController {
    @Autowired
    public IColisService colisService;

    @PostMapping("/add-colis")
    public Colis addColis(@RequestBody Colis c) {
        Colis colis = colisService.addColis(c);
        return colis;
    }
}
