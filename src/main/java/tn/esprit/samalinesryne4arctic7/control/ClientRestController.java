package tn.esprit.samalinesryne4arctic7.control;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.samalinesryne4arctic7.entity.Client;
import tn.esprit.samalinesryne4arctic7.service.IAssuranceService;
import tn.esprit.samalinesryne4arctic7.service.IClientService;

@RestController
@AllArgsConstructor
@RequestMapping("/client")
public class ClientRestController {
    @Autowired
    public IClientService clientService;

    @PostMapping("/add-client")
    public Client addClient(@RequestBody Client c) {
        Client client = clientService.addClient(c);
        return client;
    }
}
