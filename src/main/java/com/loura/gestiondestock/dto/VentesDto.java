package com.loura.gestiondestock.dto;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Data
@Builder
public class VentesDto {

    private String code;

    private Instant dateVente;

    private String commentaire;
}
