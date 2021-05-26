package com.gareis.mark1.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table( name = "usuario", schema = "financas")
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "SENHA")
    private String senha;
}
