package com.loura.gestiondestock.dto;

import com.loura.gestiondestock.Entity.Adress;
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

    public static AdresseDto fromEntity(Adress adress){
        if (adress == null){
            return null;
        }
        return AdresseDto.builder()
                .adress1(adress.getAdress1())
                .adress2(adress.getAdress2())
                .codePostale(adress.getCodePostale())
                .ville(adress.getVille())
                .pays(adress.getPays())
                .build();
    }
    public static Adress toEntity(AdresseDto adresseDto){
        if (adresseDto == null){
            return null;
        }
        Adress adress = new Adress();
        adress.setAdress1(adresseDto.getAdress1());
        adress.setAdress2(adresseDto.getAdress2());
        adress.setCodePostale(adresseDto.getCodePostale());
        adress.setVille(adresseDto.getVille());
        adress.setPays(adresseDto.getPays());
        return adress;
    }
}
