package br.augusto.spring01.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // avisa o spring boot que a classe é uma Controller e para ser capaz de receber / responder requisições
@RequestMapping("/sample")   //indica qual o recurso que estará mapeado para essa classe - http://localhost:8080/recurso
public class HelloController {
    
    @GetMapping("/hello")   // esse método vai responder a um pedido de GET (consulta) mapeia a comunicação externa /sample com interna "olá mundo"
    public ResponseEntity<String> ola() {
        return ResponseEntity.ok("Olá mundo!");
    }

    @PostMapping("/hello")
    public ResponseEntity<String> ola2() {
        return ResponseEntity.ok("Olá mundo via POST!");
    }

}
