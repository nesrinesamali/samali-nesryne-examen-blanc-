package tn.esprit.samalinesryne4arctic7.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;
    private String nomClient;
    private String numTel;
    @OneToMany
    List<Colis> colis;
}
