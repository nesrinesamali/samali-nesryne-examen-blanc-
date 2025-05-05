package tn.esprit.samalinesryne4arctic7.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Assurance implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAssurance;
    private String designation;
    private float montant;
    @ManyToOne
    private Contrat contrat;
    @ManyToOne
    private Beneficiare beneficiare;
}

