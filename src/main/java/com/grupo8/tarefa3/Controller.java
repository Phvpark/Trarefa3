package com.grupo8.tarefa3;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    @CrossOrigin(origins = "*")
    public String mensagemInicial(){
        return "Hello World";
    }

    @GetMapping("/pagina")
    @CrossOrigin(origins = "*")
    public String novaSecao(){
        return "Nova Pagina";
    }

}
