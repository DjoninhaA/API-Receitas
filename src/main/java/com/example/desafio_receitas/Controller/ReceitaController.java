// package com.example.desafio_receitas.Controller;

// import java.util.Set;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.servlet.ModelAndView;

// import com.example.desafio_receitas.Interface.ReceitaRepository;
// import com.example.desafio_receitas.Model.ListaIngredientes;
// import com.example.desafio_receitas.Model.Receita;

// @RestController("/")
// public class ReceitaController {
    
//     @Autowired
//     private ReceitaRepository receitaRepository;

//     @GetMapping("/")
//      public ModelAndView getReceitas() {
//         ModelAndView modelAndView = new ModelAndView();
//         modelAndView.setViewName("html/listarReceitas");
//         return modelAndView;
//      }


//     @GetMapping("/busca/{codigoReceita}")
//     public ResponseEntity<Receita> GetById(@PathVariable Long codigoReceita){
//         Receita receita = ReceitaRepository.findByCodigoReceita(codigoReceita);
//         return ResponseEntity.ok(receita);
//     }

//     @PostMapping("/CreateReceita")
//     public ResponseEntity<String> saveReceita(
//         @RequestParam("titulo") String titulo,
//         @RequestParam("ordem") int ordem,
//         @RequestParam("quantidade") float quantidade){
        
//         Receita receita = new Receita();
//         receita.setTitulo(titulo);


//         ListaIngredientes listaIngredientesReceita = new ListaIngredientes();
//         listaIngredientesReceita.setOrdem(0);
//         listaIngredientesReceita.setQuantidade(0);

//         //receita.setlistaIngredientesReceita(listaIngredientesReceita);
//         receitaRepository.save(receita);

//         return  ResponseEntity.ok("Receita Criada Com Sucesso");

//         }    
// }
