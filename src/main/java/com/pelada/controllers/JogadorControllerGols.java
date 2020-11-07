package com.pelada.controllers;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JogadorControllerGols {
	
	 @GetMapping("/gols")
	    public String metodo_janeiro() {
	        return "dados/gols";
	    }
	
}
