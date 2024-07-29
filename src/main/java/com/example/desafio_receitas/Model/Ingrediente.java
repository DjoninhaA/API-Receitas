package com.example.desafio_receitas.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Ingrediente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IngredienteID;

    @Column(name = "nome", nullable = false)
    private String nome;

    public Long getIngredienteID() {
        return IngredienteID;
    }

    public void setIngredienteID(Long ingredienteID) {
        IngredienteID = ingredienteID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   
}
  