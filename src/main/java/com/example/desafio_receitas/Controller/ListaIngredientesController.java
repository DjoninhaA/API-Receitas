package com.example.desafio_receitas.Controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.desafio_receitas.Interface.IngredienteRepository;
import com.example.desafio_receitas.Model.Ingrediente;




@RestController
@RequestMapping("/api/ingredientes")
public class ListaIngredientesController {

    @Autowired IngredienteRepository ingredienteRepository;

    @PostMapping
    public ResponseEntity<Ingrediente> createIngrediente(@RequestBody Ingrediente ingrediente) {
        Ingrediente savIngrediente = ingredienteRepository.save(ingrediente);
        return new ResponseEntity<>(savIngrediente, HttpStatus.CREATED);

     }

     @GetMapping
     public ResponseEntity<Ingrediente> getIngredienteID(@PathVariable("id") Long id) {
        Optional<Ingrediente> ingrediente = ingredienteRepository.findById(id);
        return ingrediente.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());

     }

}