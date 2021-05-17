package edu.utp.chamcha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactenosController {
    public static String CONTACTENOS="cliente/contactenos";
    @GetMapping("/cliente/contactenos")
    public String index(Model model) {
        return CONTACTENOS;
    } 
}
