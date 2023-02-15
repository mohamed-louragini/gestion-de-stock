package com.loura.gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.loura.gestiondestock.model.Client;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
public class ClientDto {

    private Integer id;

    private String nom;

    private String prenom;

    private AdresseDto adress;

    private String photo;

    private String mail;

    private String numTel;

    @JsonIgnore
    private List<CommandeClientDto> commandeClient;

    public ClientDto fromEntity (Client client) {
        if (client == null) {
            return null;
        }
        return ClientDto.builder()
                .id(client.getId())
                .nom(client.getNom())
                .prenom(client.getPrenom())
                .photo(client.getPhoto())
                .mail(client.getMail())
                .numTel(client.getNumTel())
                .commandeClient(
                        client.getCommandeClient() != null ?
                                client.getCommandeClient().stream()
                                        .map(CommandeClientDto::fromEntity)
                                        .collect(Collectors.toList()) : null
                )
                .build();
    }
    public Client  toEntity (ClientDto clientDto) {
        Client client = new Client();
        client.setId(clientDto.getId());
        client.setNom((clientDto.getNom()));
        client.setPrenom(clientDto.getPrenom());
        client.setPhoto(clientDto.getPhoto());
        client.setMail(clientDto.getMail());
        client.setNumTel(client.getNumTel());
        return client;
    }
}
