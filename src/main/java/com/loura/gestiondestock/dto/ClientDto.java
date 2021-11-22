package com.loura.gestiondestock.dto;

import com.loura.gestiondestock.model.Adress;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ClientDto {

    private String nom;

    private String prenom;

    private Adress adress;

    private String photo;

    private String mail;

    private String numTel;

    private List<CommandeClientDto> commandeClient;
}
