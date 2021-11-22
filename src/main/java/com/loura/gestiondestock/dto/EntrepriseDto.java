package com.loura.gestiondestock.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class EntrepriseDto {

    private String nom;

    private String description;

    private AdresseDto adress;

    private String codeFiscal;

    private String photo;

    private String email;

    private String numTel;

    private String steWeb;

    private List<UtilisateurDto> utilisateur;
}
