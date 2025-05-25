package com.example.mvcweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CreditosController {

    @GetMapping("/creditos")
    public String cred(Model model) {
        model.addAttribute("tituloPrincipal", "Hecho por:");
        model.addAttribute("nombre1", "Piero Fabricio Poblete Andía");
        model.addAttribute("nombre2", "Joshua David Ortiz Rosas ");
        model.addAttribute("agradecimiento", "¡Gracias por usar nuestra aplicación y por tu apoyo!");
        return "cred";
    }
}
