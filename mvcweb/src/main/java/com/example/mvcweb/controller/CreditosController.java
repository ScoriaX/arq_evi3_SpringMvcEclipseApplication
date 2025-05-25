package com.example.mvcweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CreditosController {

    @GetMapping("/creditos")
    public String cred(Model model) {
        model.addAttribute("mensaje", "Hecho por: Piero Poblete");
        return "cred";
    }
}
