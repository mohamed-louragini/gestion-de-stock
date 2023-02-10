package com.loura.gestiondestock.dto;

import com.loura.gestiondestock.model.CommandeFournisseur;
import com.loura.gestiondestock.model.LigneCommandeFournisseur;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class LigneCommandeFournisseurDto {

    private Integer id;

    private ArticleDto article;

    private CommandeFournisseur commandeFournisseur;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;

    public LigneCommandeFournisseurDto fromEntity(LigneCommandeFournisseur ligneCommandeFournisseur) {
        if (ligneCommandeFournisseur == null) {
            return null;
        }
        return LigneCommandeFournisseurDto.builder()
                .id(ligneCommandeFournisseur.getId())
                //.quantite(ligneCommandeFournisseur.get)
                //TODO
                .build();
    }
}
