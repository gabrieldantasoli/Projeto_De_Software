package br.com.projeto.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.models.Pessoa;

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

    @GetMapping("/eua")
    public String HelloGringo() {
        String msg = "Hello, Gringo!";
        return msg;
    }

    @GetMapping("/welcome")
    public String welcome() {
        String msg = "Welcome, Programador desconhecido!";
        return msg;
    }

    @GetMapping("/welcome/{name}")
    public String welcome(@PathVariable String name) {
        String msg = "Welcome " + name + " !";
        return msg;
    }

    @PostMapping("/pessoa")
    public Pessoa pessoa(@RequestBody Pessoa pessoa) {
        return pessoa;
    }

}