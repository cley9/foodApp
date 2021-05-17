package edu.utp.chamcha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelpController {
    public static String HELP="cliente/help";
    @GetMapping("/cliente/help")
    public String index(Model model) {
        return HELP;
    } 
}
