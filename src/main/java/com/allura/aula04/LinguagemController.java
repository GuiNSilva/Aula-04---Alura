package com.allura.aula04;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagemController {
    
    @Autowired 
    private linguagemRepository repositorio;

    @GetMapping("/linguagens")
    public List<Linguagem>obtLinguagens(){
        List<Linguagem>linguagens = repositorio.findAll();
        return linguagens;
    }
}
