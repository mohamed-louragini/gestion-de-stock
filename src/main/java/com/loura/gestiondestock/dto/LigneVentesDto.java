package com.loura.gestiondestock.dto;

import com.loura.gestiondestock.model.LigneVente;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class LigneVentesDto {

    private Integer id;

    private VentesDto vente;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;

    public static LigneVentesDto fromEntity(LigneVente ligneVente) {
        if (ligneVente == null) {
            return null; //TODO throw an exception
        }
        return LigneVentesDto.builder()
                .id(ligneVente.getId())
                .vente(VentesDto.fromEntity(ligneVente.getVente()))
                .quantite(ligneVente.getQuantite())
                .prixUnitaire(ligneVente.getPrixUnitaire())
                .build();
    }
    public static LigneVente toEntity(LigneVentesDto ligneVentesDto) {
        if (ligneVentesDto == null) {
            return null;
        }
        LigneVente ligneVente = new LigneVente();
        ligneVente.setId(ligneVentesDto.getId());
        //TODO
        ligneVente.setQuantite(ligneVentesDto.getQuantite());
        ligneVente.setPrixUnitaire(ligneVentesDto.getPrixUnitaire());
        return ligneVente;
    }
}
