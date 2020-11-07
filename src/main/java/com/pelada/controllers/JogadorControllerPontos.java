package com.pelada.controllers;

import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JogadorControllerPontos {


    @GetMapping("/pontos")
    public String metodo_janeiro() {
        return "dados/pontos";
    }

}
