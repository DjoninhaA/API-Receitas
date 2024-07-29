package com.example.desafio_receitas.Model;


import java.util.UUID;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Receita {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID ReceitaID;
    @Column(name = "titulo", nullable = false)
    private String titulo;
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
       
}
