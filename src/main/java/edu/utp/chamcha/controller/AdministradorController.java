package edu.utp.chamcha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdministradorController {
            private static final String ADMIN ="Administrador/Admin"; 

        @GetMapping("/Administrador/Admin")
        public String index(Model model) {
            return ADMIN;
        }   
    }

