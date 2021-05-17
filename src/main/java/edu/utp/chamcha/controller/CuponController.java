package edu.utp.chamcha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CuponController {
    public static String CUPOM="cliente/cupon";
    @GetMapping("/cliente/cupon")
    public String index(Model model) {
        return CUPOM;
    } 
}
