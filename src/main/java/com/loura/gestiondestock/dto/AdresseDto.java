package com.loura.gestiondestock.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdresseDto {

    private String adress1;

    private String adress2;

    private String ville;

    private String codePostale;

    private String pays;
}
