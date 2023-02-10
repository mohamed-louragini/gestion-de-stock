package com.loura.gestiondestock.dto;

import com.loura.gestiondestock.model.CommandeClient;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class CommandeClientDto {

    private Integer id;

    private String code;

    private Instant dateCommande;

    private ClientDto client;

    private List<LigneCommandeClientDto> ligneCommandeClients;

    public CommandeClientDto fromEntity(CommandeClient commandeClient) {
        if (commandeClient == null) {
            return null;
        }
        return CommandeClientDto.builder()
                .id(commandeClient.getId())
                .code(commandeClient.getCode())
                .dateCommande(commandeClient.getDateCommande())
                .build();
    }
    public CommandeClient toEntity(CommandeClientDto commandeClientDto) {
        if (commandeClientDto == null) {
            return null;
        }
        CommandeClient commandeClient = new CommandeClient();
        commandeClient.setId(commandeClientDto.getId());
        commandeClient.setCode(commandeClientDto.getCode());
        commandeClient.setDateCommande(commandeClientDto.getDateCommande());
        return commandeClient;
    }
}
