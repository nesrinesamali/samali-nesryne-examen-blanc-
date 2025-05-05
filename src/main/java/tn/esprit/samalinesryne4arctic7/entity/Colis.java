package tn.esprit.samalinesryne4arctic7.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Colis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idColis;
    private String referenceColis;
    private float prixCommande ;
    private LocalDateTime dateLivraison;
    @Enumerated(EnumType.STRING)
    private Etat etatColis;
    @ManyToOne
    Client client;
    @ManyToMany
    List<Produit>produit ;
    @ManyToOne
    Livreur livreur;



}
