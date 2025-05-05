package tn.esprit.samalinesryne4arctic7.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contrat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContrat;
    private String matricule;
    private Date dateEffet;

    @Enumerated(EnumType.STRING)
    private TypeContrat typeContrat;

}
