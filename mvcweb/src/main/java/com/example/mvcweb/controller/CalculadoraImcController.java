package com.example.mvcweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculadoraImcController {

    @GetMapping("/imc")
    public String mostrarFormularioIMC() {
        return "imc";  // Página con el formulario
    }

    @PostMapping("/imc/calcular")
    public String calcularIMC(@RequestParam("peso") double peso,
                              @RequestParam("altura") double altura,
                              Model model) {
        double imc = peso / (altura * altura);
        String resultado;

        if (imc < 18.5) {
            resultado = "Bajo peso";
        } else if (imc < 24.9) {
            resultado = "Peso normal";
        } else if (imc < 29.9) {
            resultado = "Sobrepeso";
        } else {
            resultado = "Obesidad";
        }
        
        model.addAttribute("imc", String.format("%.2f", imc));
        model.addAttribute("diagnostico", resultado);

        return "imc";
    }
}
