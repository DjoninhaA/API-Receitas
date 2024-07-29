package com.example.desafio_receitas.DTO;

public class ingredienteDTO {
    private Long ingredienteID;
    private String Nome;
    public ingredienteDTO[] getIngredientes;

    public void setIngredienteID(Long ingredienteID) {
        this.ingredienteID = ingredienteID;
    }

    public Long getIngredienteID() {
        return ingredienteID;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public ingredienteDTO[] getGetIngredientes() {
        return getIngredientes;
    }

    public void setGetIngredientes(ingredienteDTO[] getIngredientes) {
        this.getIngredientes = getIngredientes;
    }
    
    
   
    
}
