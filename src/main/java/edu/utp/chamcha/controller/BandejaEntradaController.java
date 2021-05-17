package edu.utp.chamcha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BandejaEntradaController {
    public static String BANDEJA="cliente/Bandeja_Entrada";
    @GetMapping("/cliente/Bandeja_Entrada")
    public String index(Model model) {
        return BANDEJA;
    } 
}
