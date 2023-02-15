package com.loura.gestiondestock.dto;

import com.loura.gestiondestock.model.Roles;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RolesDto {

    private Integer id;

    private String roleName;

    private UtilisateurDto utilisateur;

    public static RolesDto fromEntity(Roles roles) {
        if(roles == null) {
            return null; //TODO throw an exeption
        }
        return RolesDto.builder()
                .id(roles.getId())
                .roleName(roles.getRoleName())
                .utilisateur(UtilisateurDto.toEntity(roles.getUtilisateur()))
                .build();
    }
}
