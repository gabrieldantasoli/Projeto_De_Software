package br.com.projeto.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @GetMapping("/")
    public String mensagem() {
        String msg = "Hello, World!";
        return msg;
    }

    @GetMapping("/pt-br")
    public String HelloPtBr() {
        String msg = "Hello, Brazil!";
        return msg;
    }

}
