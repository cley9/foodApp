package edu.utp.chamcha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuCartaController {
    public static String MENU="cliente/Menu_Carta";
    @GetMapping("/cliente/Menu_Carta")
    public String index(Model model) {
        return MENU;
    } 
}
