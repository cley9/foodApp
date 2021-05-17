package edu.utp.chamcha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class BeneficioContoller {
 public static String BENEFICIO="cliente/beneficios";
 @GetMapping("/cliente/beneficios")
 public String index(Model model) {
     return BENEFICIO;
 }    

}
