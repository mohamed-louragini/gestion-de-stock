package com.loura.gestiondestock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class Adress {

    @Column(name = "adress1")
    private String adress1;

    @Column(name = "adress2")
    private String adress2;

    @Column(name = "ville")
    private String ville;

    @Column(name = "codepostale")
    private String codePostale;

    @Column(name = "pays")
    private String pays;
}
