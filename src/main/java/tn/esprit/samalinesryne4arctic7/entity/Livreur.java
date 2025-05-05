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
public class Livreur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLivreur;
    private String nomLivreur;
    private String prenomLivreur;
    @OneToMany
    List<Colis> colis;
}
