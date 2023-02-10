package com.loura.gestiondestock.dto;

import com.loura.gestiondestock.model.Utilisateur;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class UtilisateurDto {

    private Integer id;

    private String nom;

    private String prenom;

    private String email;

    private Instant dateDeNaissance;

    private String motDePasse;

    private AdresseDto adress;

    private String photo;

    private EntrepriseDto Entreprise;

    private List<RolesDto> roles;

    public static UtilisateurDto fromEntity(Utilisateur utilisateur){
        if (utilisateur == null) {
            return null;
        }
        return UtilisateurDto.builder()
                .id(utilisateur.getId())
                .nom(utilisateur.getNom())
                .prenom(utilisateur.getPrenom())
                .email(utilisateur.getEmail())
                .motDePasse(utilisateur.getMotDePasse())
                .dateDeNaissance(utilisateur.getDateDeNaissance())
                .adress(AdresseDto.fromEntity(utilisateur.getAdress()))
                .photo(utilisateur.getPhoto())
                    .build();
    }
}
