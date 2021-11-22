package com.loura.gestiondestock.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class FournisseurDto {

    private String nom;

    private String prenom;

    private AdresseDto adress;

    private String photo;

    private String mail;

    private String numTel;

    private List<CommandeFournisseurDto> commandeFournisseurs;
}
