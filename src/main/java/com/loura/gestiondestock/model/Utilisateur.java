package com.loura.gestiondestock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "utilisateur")
public class Utilisateur extends AbstractEntity{

    private String nom;
}
