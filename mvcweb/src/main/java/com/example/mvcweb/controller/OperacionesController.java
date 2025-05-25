package com.example.mvcweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OperacionesController {

    @GetMapping("/operaciones")
    public String mostrarFormulario() {
        return "operaciones";  // Muestra el formulario
    }

    @PostMapping("/operaciones/convertir")
    public String convertirGrados(@RequestParam("grados") double grados,
                                 @RequestParam("tipo") String tipo,
                                 Model model) {

        double resultado;
        String resultadoTexto;

        if ("celsius".equals(tipo)) {
            // Convertir Celsius a Fahrenheit
            resultado = grados * 9 / 5 + 32;
            resultadoTexto = grados + " °C son " + resultado + " °F";
        } else {
            // Convertir Fahrenheit a Celsius
            resultado = (grados - 32) * 5 / 9;
            resultadoTexto = grados + " °F son " + resultado + " °C";
        }

        model.addAttribute("resultado", resultadoTexto);
        return "operaciones";  // Regresa a la misma página con el resultado
    }
}
