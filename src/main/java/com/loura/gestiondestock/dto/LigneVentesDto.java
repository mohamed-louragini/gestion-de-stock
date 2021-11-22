package com.loura.gestiondestock.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class LigneVentesDto {

    private VentesDto vente;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;
}
