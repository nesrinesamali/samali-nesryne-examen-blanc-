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
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduit;
    private String identifiant;
    @Enumerated(EnumType.STRING)
    private Categorie categorie;
    @ManyToMany(mappedBy = "produit")
    private List<Colis> colis;

    public Long idProduit() {
        return idProduit;
    }

    public void setidProduit(Long idProduit) {
        this.idProduit = idProduit;
    }










}










