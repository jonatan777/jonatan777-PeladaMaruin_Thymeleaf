package com.pelada.controllers;

import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JogadorControllerGoleiros {

	@GetMapping("/goleiros")
    public String metodo_janeiro() {
        return "dados/goleiros";
    }
	
}
