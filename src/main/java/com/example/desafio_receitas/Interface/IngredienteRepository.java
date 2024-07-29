package com.example.desafio_receitas.Interface;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.desafio_receitas.Model.Ingrediente;
    
@Repository
public interface IngredienteRepository extends JpaRepository<Ingrediente, Long> {
    Ingrediente findByNome(String nome);

    Optional<Ingrediente> findById(Long IngredienteID);
   
}